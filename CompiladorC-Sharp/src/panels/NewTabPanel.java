package panels;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 12:07:49 PM
 */

public class NewTabPanel extends JSplitPane{
    // La zonas de texto de código y la consola.
    private JTextArea code, terminal, lineNumber;
    // Etiqueta que pone en qué fila y columna
    // del código está posicionado el puntero.
    private JLabel currentRow;
    private JTabbedPane tabs;
    // Acceso a la ventana principal...
    protected JFrame frame;
    protected JPanel top, bot;

    public NewTabPanel(JFrame frame, JPanel top, JPanel bot){
        this.frame = frame;
        this.top = top;
        this.bot = bot;
        setComponents();
    }
    
    public final void setComponents(){
        this.setBorder(BorderFactory.createLineBorder(frame.getBackground(), 10));
        // Los páneles superior y inferior
        // donde va el código y la consola...
        
        top.setBorder(BorderFactory.createTitledBorder("Source"));
        bot.setBorder(BorderFactory.createTitledBorder("Output"));
        
        this.setTopComponent(top);
        this.setBottomComponent(bot);
        this.setOrientation(JSplitPane.VERTICAL_SPLIT);
        this.setDividerLocation(frame.getHeight()-150);
        // Para que se redibuje en tiempo real...
        this.setContinuousLayout(true);
        
    }

    public JTextArea getCode() {
        return code;
    }

    public JTextArea getTerminal() {
        return terminal;
    }

    public JTextArea getLineNumber() {
        return lineNumber;
    }

    public JLabel getCurrentRow() {
        return currentRow;
    }

    public JTabbedPane getTabs() {
        return tabs;
    }
}