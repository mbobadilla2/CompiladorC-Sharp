package listeners;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.Utilities;
import panels.NewTabPanel;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 8:39:38 PM
 */

public class CodeCaretListener implements CaretListener{
    private NewTabPanel tab;
    
    public CodeCaretListener(NewTabPanel tab){
        this.tab = tab;
    }
    
    @Override
    public void caretUpdate(CaretEvent e) {        
       int row = getRow(e.getDot(), (JTextComponent)e.getSource());
       int column = getColumn(e.getDot(), (JTextComponent)e.getSource());
       
       tab.getCurrentRow().setText("\t\t\tLine " + row + ", Column " + column);
    }

    public static int getRow(int pos, JTextComponent editor) {
        int rn = (pos==0) ? 1 : 0;
        try {
            int offs=pos;
            while( offs>0) {
                offs=Utilities.getRowStart(editor, offs)-1;
                rn++;
            }
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        return rn;
    }

    public static int getColumn(int pos, JTextComponent editor) {
        try {
            return pos-Utilities.getRowStart(editor, pos)+1;
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
