package frames;

import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import listeners.MenuListener;
import menu.MainMenu;
import panels.NewTabPanel;
import panels.TabsPanel;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 11:59:26 AM
 */

public class Main {

    public static void main(String[] args) {
        //setLookAndFeel();
        drawWindow();
    }

    public static void drawWindow(){
        // Configuramos la ventana principal...
        JFrame frame = new JFrame("BORA Compiler");
        frame.setSize(900,600); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        //Se va a controlar con el windowListener...
        
        // El panel que controla las pestañas...
        TabsPanel tabs = new TabsPanel(frame);
        tabs.newTab();
        tabs.newTab();
        tabs.newTab();
        tabs.newTab();
        tabs.newTab();
        
//        PanelListener pListener = new PanelListener(panel);
//        MenuListener mListener = new MenuListener(panel);
//        FrameListener fListener = new FrameListener(frame);
//        
//        panel.addEvents(pListener, mListener);
//        frame.addWindowListener(fListener);
//        
        
        // La barra de menú...
        MainMenu menu = new MainMenu();
        MenuListener mListener = new MenuListener(menu);
        menu.addEvents(mListener);
        frame.setJMenuBar(menu);
        
        // Agregamos a la ventana...
        frame.getContentPane().add(tabs);
        frame.setVisible(true);
    }
    
    public static void setLookAndFeel(){
        try{
            //Poner el nombre de la aplicacion en la barra de tareas
            System.setProperty( "com.apple.mrj.application.apple.menu.about.name", "Analizador léxico BOO" );
            
            //Poner el JMenuBar en la barra de tareas de OS X
            System.setProperty( "com.apple.macos.useScreenMenuBar", "true" );
            
            //Poner el JMenuBar en la barra de tareas de OS X -Versiones antiguas de Java
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            
            //Colocar el look and feel del sistema operativo que se esté usando
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        }catch(UnsupportedLookAndFeelException | ClassNotFoundException | 
                InstantiationException | IllegalAccessException e){
            // No hagas nada...
        }    
    }
}
