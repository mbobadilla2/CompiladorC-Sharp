package listeners;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacc.CompiladorC_Sharp;
import javacc.ParseException;
import javax.swing.JOptionPane;
import menu.MainMenu;
import panels.NewTabPanel;
import panels.TabsPanel;
import thangs.BoraFiles;
import thangs.BoraMessages;

import javax.swing.text.*;
import thangs.BoraColors;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 1:22:12 PM
 */

public class MenuListener implements ActionListener{
    public static TabsPanel tabs;
    public static ArrayList<NewTabPanel> openTabs;
    public static NewTabPanel auxTab;
    private final MainMenu menu;
    private Highlighter highlight;
    Highlighter.HighlightPainter painter;
    
    
    public MenuListener(MainMenu menu){
        this.menu = menu;
        openTabs = new ArrayList<>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        auxTab = openTabs.get(tabs.getSelectedIndex());
        
        if(e.getSource().equals(menu.getNewFile())){
            tabs.newTab();
        
        // Open button
        }else if(e.getSource().equals(menu.getOpen())){
            String open = BoraFiles.openFile();
            
            if(!open.equals(BoraFiles.IOE)){
                auxTab.getCode().setText(open);
            }
            
        // Save as... button
        }else if(e.getSource().equals(menu.getSaveAs())){
            BoraFiles.saveAs(auxTab.getCode().getText());
            
        // Close button
        }else if(e.getSource().equals(menu.getClose())){
            System.out.println("Tabs antes: \n\tTabs: " + tabs.getTabCount() + "\n\tArray: " + openTabs.size());
            
            if(openTabs.size() > 1){
                tabs.removeTabAt(tabs.getSelectedIndex());
                openTabs.remove(tabs.getSelectedIndex());
            
            }else{
                auxTab.getCode().setText("");
                auxTab.getTxtTokens().setText("");
                auxTab.getTxtSyntacticErrors().setText("");
                tabs.setTitleAt(tabs.getSelectedIndex(), TabsPanel.TITLE);
            }
            System.out.println("Tabs después: \n\tTabs: " + tabs.getTabCount() + "\n\tArray: " + openTabs.size());
            
            
        // Compile button (fire!)
        }else if(e.getSource().equals(menu.getLexSync())){
            compile();
            
        }else{
        
        JOptionPane.showMessageDialog(null, "Hola mamá, ya casi termino mi tarea",
                                        "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Para resaltar errores semánticos...
    public void highlightSemanticErrors(String search){
        highlight = new DefaultHighlighter();
        painter = new DefaultHighlighter.DefaultHighlightPainter(BoraColors.RED);
        
        auxTab.getCode().setHighlighter(highlight);
        
        
        String semerror = auxTab.getCode().getText();

        if(search.length() > 0){
            String content = semerror;
            int index = content.indexOf(search, 0);
            if(index >= 0){
                
                try{
                    int end = index + search.length();
                    highlight.addHighlight(index, end, painter);
                    auxTab.getCode().setCaretPosition(end);
                    System.out.println("Posición: " + auxTab.getCode().getCaretPosition());
                    
                }catch(BadLocationException e){
                    BoraMessages.error(e.getMessage(), "Ocurrió un error");
                }
            }
        
        } else{
            //No hay error
            highlight.removeAllHighlights();
            auxTab.getCode().setBackground(BoraColors.DARK_GRAY);
            auxTab.getCode().updateUI();
            
            System.out.println("Borrar resaltado");
        }
    }
    
    public void compile(){

        boolean empty = true;
        
        if(!auxTab.getCode().getText().equals("")){
        for(char car: auxTab.getCode().getText().toCharArray()){
                    //10 Enter
                    //32 Espacio
                    //09 tab
                    if(car != 32 && car != 10 && car != 9){
                        System.out.println("Caracter " + car);
                        empty = false;
                        break;
                    }
        }

            if(!empty){
                BoraFiles.writeFile(auxTab.getCode().getText(), BoraFiles.TEMP_FILE);
                try {
                    BoraFiles.readTemp();
                } catch (ParseException | FileNotFoundException ex) {
                    Logger.getLogger(MenuListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                BoraMessages.warning("El campo de código solo contiene espacios o tabulaciones", "Sin código");
                
                auxTab.getTxtTokens().setText("");
                auxTab.getTxtSyntacticErrors().setText("");
            }
        
        }else{
            BoraMessages.warning("El campo de código está vacío", "Warning");
            
            auxTab.getTxtTokens().setText("");
            auxTab.getTxtSyntacticErrors().setText("");
        }
    }
    
    public static void addTab(NewTabPanel tab){
        openTabs.add(tab);
    }

    public void setTabs(TabsPanel tabs) {
        this.tabs = tabs;
    }
    
    
}
