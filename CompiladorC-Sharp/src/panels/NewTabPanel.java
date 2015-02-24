package panels;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import listeners.CodeCaretListener;
import listeners.CodeListener;
import listeners.MenuListener;
import thangs.BoraColors;
import thangs.BoraFonts;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 12:07:49 PM
 */

public class NewTabPanel extends JSplitPane{
    // La zonas de texto de código y la consola.
    private JTextArea terminal, lineNumber;
    private JTextPane code;
    // Etiqueta que pone en qué fila y columna
    // del código está posicionado el puntero.
    private JLabel currentRow;
    // Acceso a la ventana principal...
    protected JFrame frame;
    protected JPanel top, bot;
    private JLabel terminalLabel;
    public static JTextPane auxCode;

    public NewTabPanel(JFrame frame, JPanel top, JPanel bot){
        this.frame = frame;
        this.top = top;
        this.bot = bot;
        setComponents();
        addEvents();
        auxCode = code;
        MenuListener.addTab(this);
    }
    
    public final void setComponents(){
        this.setBorder(null);
        this.setBackground(BoraColors.LIGHTER_GRAY);
        // Los páneles superior y inferior
        // donde va el código y la consola...
        
//        top.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),"Source"));
        top.setLayout(new BorderLayout());
//        bot.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),"Output"));
        bot.setLayout(new BorderLayout());
        
        // Configuración del panel top...
        code = new JTextPane();
//        code.setWrapStyleWord(true);
//        code.setLineWrap(true);
        code.setBorder(BorderFactory.createLineBorder(BoraColors.DARK_GRAY, 10));
        code.setFont(BoraFonts.MENLO);
        code.setCaretColor(BoraColors.WHITE);
        code.setForeground(BoraColors.WHITE);
        code.setBackground(BoraColors.DARK_GRAY);
        JScrollPane scrollCode = newScroll(code);
        
        top.add(scrollCode, "Center");
        
        // Configuración del panel bot...
        JPanel subBot = new JPanel();
        subBot.setLayout(new BorderLayout());
        
        terminal = new JTextArea();
        terminal.setBorder(BorderFactory.createLineBorder(BoraColors.DARK_GRAY, 10));
        terminal.setFont(BoraFonts.MENLO);
        terminal.setCaretColor(BoraColors.WHITE);
        terminal.setForeground(BoraColors.WHITE);
        terminal.setBackground(BoraColors.DARK_GRAY);
        terminal.setEditable(false);
        JScrollPane scrollTerminal = newScroll(terminal);
        
        terminalLabel = new JLabel("\t\t\tOutput");
        terminalLabel.setFont(BoraFonts.MENLOOUT);
        terminalLabel.setBackground(BoraColors.LIGHT_GRAY);
        terminalLabel.setForeground(BoraColors.WHITE);
        terminalLabel.setHorizontalAlignment(JLabel.LEFT);
        terminalLabel.setOpaque(true);
        
        currentRow = new JLabel("\t\t\tLine 0, Column 0");
        currentRow.setFont(BoraFonts.MENLOOUT);
        currentRow.setForeground(BoraColors.WHITE);
        currentRow.setHorizontalAlignment(JLabel.LEFT);
        JLabel language = new JLabel("C#\t\t\t");
        language.setFont(BoraFonts.MENLOOUT);
        language.setForeground(BoraColors.WHITE);
        language.setHorizontalAlignment(JLabel.RIGHT);
        JPanel subBotSouth = new JPanel();
        subBotSouth.setLayout(new BorderLayout());
        subBotSouth.setBackground(BoraColors.LIGHT_GRAY);
        
        subBotSouth.add(currentRow, "West");
        subBotSouth.add(language, "East");
        
        subBot.add(terminalLabel, "North");
        subBot.add(scrollTerminal, "Center");
        subBot.add(subBotSouth, "South");
        
        bot.add(subBot);
        
        // Agregamos los páneles al splitPane...
        this.setTopComponent(top);
        this.setBottomComponent(bot);
        this.setOrientation(JSplitPane.VERTICAL_SPLIT);
        this.setDividerLocation(frame.getHeight() - 200);
        this.setDividerSize(2);
        // Para que se redibuje en tiempo real...
        this.setContinuousLayout(true);
        
    }

    private JScrollPane newScroll(Object in){
        JScrollPane aux;
        JTextPane textPane;
        JTextArea textArea;
        
        try{
            textPane = (JTextPane) in;
            aux = new JScrollPane(textPane);
        }catch(ClassCastException e){
            textArea = (JTextArea) in;
            aux = new JScrollPane(textArea);
        }
        
        aux.setBorder(BorderFactory.createEmptyBorder());
        aux.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        aux.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);    
        
        return aux;
    }
    
    public void addEvents(){
        CodeListener listener = new CodeListener(this);
        CodeCaretListener caretListener = new CodeCaretListener(this);
        code.addKeyListener(listener);
        code.addCaretListener(caretListener);
    }
    
    public JTextPane getCode() {
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

    public JLabel getTerminalLabel() {
        return terminalLabel;
    }
    
    
}