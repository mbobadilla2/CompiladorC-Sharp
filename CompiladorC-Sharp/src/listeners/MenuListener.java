package listeners;

import javacc.CompiladorC_Sharp;
import javacc.CompiladorC_Sharp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacc.ParseException;
import javax.swing.JOptionPane;
import menu.MainMenu;
import panels.NewTabPanel;
import panels.TabsPanel;
import thangs.BoraFiles;
import thangs.BoraMessages;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 1:22:12 PM
 */

public class MenuListener implements ActionListener{
    public static TabsPanel tabs;
    private MainMenu menu;
    public static ArrayList<NewTabPanel> openTabs;
    
    public MenuListener(MainMenu menu){
        this.menu = menu;
        openTabs = new ArrayList<>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        NewTabPanel auxTab = openTabs.get(tabs.getSelectedIndex());
        
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
            
            
        // Compile button
        }else if(e.getSource().equals(menu.getLexSync())){
            
            if(!auxTab.getCode().getText().equals("")){
            
                BoraFiles.writeFile(auxTab.getCode().getText(), BoraFiles.TEMP_FILE);
                try {
                    BoraFiles.readTemp();
                    /*try {
                    CompiladorC_Sharp.Compilar(openTabs.get(tabs.getSelectedIndex()));
                    } catch (ParseException ex) {
                    System.out.println("Algo salió mal: " + ex.getMessage());
                    }*/
                } catch (ParseException | FileNotFoundException ex) {
                    Logger.getLogger(MenuListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                BoraMessages.warning("El campo de código está vacío", "Warning");
            }
            
        }else{
        
        JOptionPane.showMessageDialog(null, "Hola mamá, ya casi termino mi tarea",
                                        "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void addTab(NewTabPanel tab){
        openTabs.add(tab);
    }

    public void setTabs(TabsPanel tabs) {
        this.tabs = tabs;
    }
    
    
}
