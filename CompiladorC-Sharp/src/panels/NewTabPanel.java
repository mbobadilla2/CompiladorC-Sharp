package panels;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
    private JTextArea txtSyntacticErrors, txtTokens, txtSemanticErrors, lineNumber;
    private JTextPane code;
    // Etiqueta que pone en qué fila y columna
    // del código está posicionado el puntero.
    private JLabel currentRowLabel;
    // Acceso a la ventana principal...
    protected JFrame frame;
    protected JPanel top, bot, topLeft; // El que cuenta las líneas...
    private JLabel syntacticErrorsLabel, tokensLabel, semanticErrorsLabel;
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

        // Configuración del panel topLeft...
        topLeft = countLines();
       
        top.add(topLeft, "West");
       
        // Configuración del textArea que contiene los tokens...
        JPanel topRight =  new JPanel();
        topRight.setLayout(new BorderLayout());
        
        txtTokens = new JTextArea();
        txtTokens.setColumns(25);
        txtTokens.setBorder(BorderFactory.createLineBorder(BoraColors.GRAY, 10));
        txtTokens.setFont(BoraFonts.MENLO);
        txtTokens.setCaretColor(BoraColors.WHITE);
        txtTokens.setBackground(BoraColors.GRAY);
        txtTokens.setForeground(BoraColors.WHITE);
        txtTokens.setEditable(false);
        
        tokensLabel = new JLabel("\t\t\tTokens");
        tokensLabel.setFont(BoraFonts.MENLOOUT);
        tokensLabel.setBackground(BoraColors.LIGHT_GRAY);
        tokensLabel.setForeground(BoraColors.WHITE);
        tokensLabel.setHorizontalAlignment(JLabel.LEFT);
        tokensLabel.setOpaque(true);
        
        JScrollPane scrollTokens = newScroll(txtTokens);
        
        topRight.add(tokensLabel, "North");
        topRight.add(scrollTokens, "Center");
        
        top.add(topRight, "East");
        
        /********************** PARTE DE ABAJO ***********************/
        
        // Configuración del panel bot...
        JPanel subBot = new JPanel();
        subBot.setLayout(new BorderLayout());
        
        txtSyntacticErrors = new JTextArea();
        txtSyntacticErrors.setBorder(BorderFactory.createLineBorder(BoraColors.DARK_GRAY, 10));
        txtSyntacticErrors.setFont(BoraFonts.MENLO);
        txtSyntacticErrors.setCaretColor(BoraColors.WHITE);
        txtSyntacticErrors.setForeground(BoraColors.WHITE);
        txtSyntacticErrors.setBackground(BoraColors.DARK_GRAY);
        txtSyntacticErrors.setEditable(false);
        JScrollPane scrollTerminal = newScroll(txtSyntacticErrors);
        
        syntacticErrorsLabel = new JLabel("\t\t\tSyntactic errors");
        syntacticErrorsLabel.setFont(BoraFonts.MENLOOUT);
        syntacticErrorsLabel.setBackground(BoraColors.LIGHT_GRAY);
        syntacticErrorsLabel.setForeground(BoraColors.WHITE);
        syntacticErrorsLabel.setHorizontalAlignment(JLabel.LEFT);
        syntacticErrorsLabel.setOpaque(true);
        
        currentRowLabel = new JLabel("\t\t\tLine 0, Column 0");
        currentRowLabel.setFont(BoraFonts.MENLOOUT);
        currentRowLabel.setForeground(BoraColors.WHITE);
        currentRowLabel.setHorizontalAlignment(JLabel.LEFT);
        JLabel language = new JLabel("C#\t\t\t");
        language.setFont(BoraFonts.MENLOOUT);
        language.setForeground(BoraColors.WHITE);
        language.setHorizontalAlignment(JLabel.RIGHT);
        JPanel subBotSouth = new JPanel();
        subBotSouth.setLayout(new BorderLayout());
        subBotSouth.setBackground(BoraColors.LIGHT_GRAY);
        
        subBotSouth.add(currentRowLabel, "West");
        subBotSouth.add(language, "East");
        
        JPanel subBotAux = new JPanel();
        subBotAux.setLayout(new BorderLayout());
        subBotAux.add(syntacticErrorsLabel, "North");
        subBotAux.add(scrollTerminal, "Center");
        
        subBot.add(subBotAux, "Center");
        subBot.add(subBotSouth, "South");
        
        
        // Panel de errores semánticos...
        JPanel botRight =  new JPanel();
        botRight.setLayout(new BorderLayout());
        
        txtSemanticErrors = new JTextArea();
        txtSemanticErrors.setColumns(45);
        txtSemanticErrors.setBorder(BorderFactory.createLineBorder(BoraColors.GRAY, 10));
        txtSemanticErrors.setFont(BoraFonts.MENLO);
        txtSemanticErrors.setCaretColor(BoraColors.WHITE);
        txtSemanticErrors.setBackground(BoraColors.GRAY);
        txtSemanticErrors.setForeground(BoraColors.WHITE);
        txtSemanticErrors.setEditable(false);
        txtSemanticErrors.setText("");
       
        
//        txtSemanticErrors.setText("Esta zona aún no funciona.\n"
//                + "\nBobadilla Contreras Miguel Fernando"
//                + "\nOrdoñez Ruiz Edgar"
//                + "\nArenas Vázquez Alfredo"
//                + "\nPérez Rodríguez José Rubén");
//        
        semanticErrorsLabel = new JLabel("\t\t\tSemantic errors");
        semanticErrorsLabel.setFont(BoraFonts.MENLOOUT);
        semanticErrorsLabel.setBackground(BoraColors.LIGHT_GRAY);
        semanticErrorsLabel.setForeground(BoraColors.WHITE);
        semanticErrorsLabel.setHorizontalAlignment(JLabel.LEFT);
        semanticErrorsLabel.setOpaque(true);
        
        JScrollPane scrollSemanticErros = newScroll(txtSemanticErrors);
        
        botRight.add(semanticErrorsLabel, "North");
        botRight.add(scrollSemanticErros, "Center");
        
        subBot.add(botRight, "East");
        
        bot.add(subBot);
        
        // Agregamos los páneles al splitPane...
        this.setTopComponent(top);
        this.setBottomComponent(bot);
        this.setOrientation(JSplitPane.VERTICAL_SPLIT);
        this.setDividerLocation(frame.getHeight() - 100);
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
    
    private JPanel countLines(){
        JPanel aux = new JPanel();
        aux.setSize(10, code.getHeight());
        
        JLabel num = new JLabel("1");
//        num.setSize(10,code.);
        aux.add(num);
        
        return aux;
    }
    
    public JTextPane getCode() {
        return code;
    }

    public JTextArea getTxtSyntacticErrors() {
        return txtSyntacticErrors;
    }

    public JTextArea getLineNumber() {
        return lineNumber;
    }

    public JLabel getCurrentRow() {
        return currentRowLabel;
    }

    public JLabel getSyntacticErrorsLabel() {
        return syntacticErrorsLabel;
    }

    public JTextArea getTxtTokens() {
        return txtTokens;
    }

    public JTextArea getTxtSemanticErrors() {
        return txtSemanticErrors;
    }
    
    
    
}