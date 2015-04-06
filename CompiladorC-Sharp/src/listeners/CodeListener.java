package listeners;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacc.ParseException;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import static listeners.MenuListener.openTabs;
import static listeners.MenuListener.tabs;
import panels.NewTabPanel;
import thangs.BoraFiles;
import thangs.BoraMessages;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 7:35:23 PM
 */

public class CodeListener extends KeyAdapter{
    private final NewTabPanel tab;
    private final JTextPane code;
    private boolean shift, enter;
            
    public CodeListener(NewTabPanel tab){
        this.tab = tab;
        this.code = tab.getCode();
        shift = false;
        enter = false;
    }
    
    @Override
    public void keyPressed(KeyEvent e){
        // Cambiamos la longitud de la tabulación por 4 espacios...
        if(e.getKeyCode() == KeyEvent.VK_TAB){
            
            try{
                StyledDocument styleDoc = code.getStyledDocument();
                styleDoc.insertString(code.getCaretPosition(), "    ", null);
                
            }catch(Exception ex){
                System.out.println("Algo salío mal... " + ex.getMessage());
            }
            
            e.consume();
        }
        
        
        // Combinación de teclas para compilar...
        if(e.getKeyCode() == KeyEvent.VK_SHIFT){
            shift = true;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            enter = true;
        }
        
        if(shift && enter){
            compile();
        }
     
        // Para completar llaves y paréntesis...
        //40 = (
        //91 = [
        //123 = {
        if(e.getKeyChar() == 40){            
        }

        if(e.getKeyChar() == 91){
        }
                
        if(e.getKeyChar() == 123){
            
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        shift = false;
        enter = false;
    }
    
    public void compile(){
        NewTabPanel auxiTab = MenuListener.openTabs.get(MenuListener.tabs.getSelectedIndex());
        MenuListener.auxTab = auxiTab;
        
        boolean empty = true;
        shift = false;
        enter = false;
        
        if(!auxiTab.getCode().getText().equals("")){
                for(char car: auxiTab.getCode().getText().toCharArray()){
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
                    BoraFiles.writeFile(auxiTab.getCode().getText(), BoraFiles.TEMP_FILE);
                    try {
                        BoraFiles.readTemp();
                    } catch (ParseException | FileNotFoundException ex) {
                        Logger.getLogger(MenuListener.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    BoraMessages.warning("El campo de código solo contiene espacios o tabulaciones", "Sin código");
               
                    tab.getTxtTokens().setText("");
                    tab.getTxtSyntacticErrors().setText("");
                
                }
                
            }else{
                BoraMessages.warning("El campo de código está vacío", "Warning");
                
                tab.getTxtTokens().setText("");
                tab.getTxtSyntacticErrors().setText("");
        }        
    }
}
