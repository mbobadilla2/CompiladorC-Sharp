package listeners;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import panels.NewTabPanel;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 7:35:23 PM
 */

public class CodeListener extends KeyAdapter{
    private final NewTabPanel tab;
    private final JTextPane code;
    
    public CodeListener(NewTabPanel tab){
        this.tab = tab;
        this.code = tab.getCode();
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
        
        try {
            System.out.println("Posición: " + code.getDocument().getText(code.getCaretPosition(),1).charAt(0));
        } catch (BadLocationException ex) {
            Logger.getLogger(CodeListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
