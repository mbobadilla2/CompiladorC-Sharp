package frames;

import java.awt.Insets;
import java.awt.Window;
import java.lang.reflect.Method;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import listeners.MenuListener;
import menu.MainMenu;
import panels.TabsPanel;
import thangs.BoraColors;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 11:59:26 AM
 */

public class Main {

    public static void main(String[] args) {
        setLookAndFeel();
        drawWindow();
    }

    public static void drawWindow(){
        // Configuramos la ventana principal...
        if (isMacOSX()) {
            System.setProperty(
                    "com.apple.mrj.application.apple.menu.about.name",
                    "BORA Compiler");
        }
        JFrame frame = new JFrame("BORA Compiler");
        frame.setSize(900,600); 
        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(BoraColors.DARK_GRAY);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Se va a controlar con el windowListener...
        
        // La barra de menú...
        MainMenu menu = new MainMenu();
        MenuListener mListener = new MenuListener(menu);
        menu.addEvents(mListener);
        frame.setJMenuBar(menu);
        
        // El panel que controla las pestañas...
        TabsPanel tabs = new TabsPanel(frame);
        mListener.setTabs(tabs);
        tabs.newTab();
        
//        PanelListener pListener = new PanelListener(panel);
//        MenuListener mListener = new MenuListener(panel);
//        FrameListener fListener = new FrameListener(frame);
//        
//        panel.addEvents(pListener, mListener);
//        frame.addWindowListener(fListener);
//        
        
        
        // Agregamos a la ventana...
        frame.getContentPane().add(tabs);
        if (isMacOSX()) {
            enableFullScreenMode(frame);
        }
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
    
    //Para poner el frame en pantalla completa en OSX
    private static boolean isMacOSX() {
        return System.getProperty("os.name").indexOf("Mac OS X") >= 0;
    }
    
    public static void enableFullScreenMode(Window window) {
        String className = "com.apple.eawt.FullScreenUtilities";
        String methodName = "setWindowCanFullScreen";
 
        try {
            Class<?> clazz = Class.forName(className);
            Method method = clazz.getMethod(methodName, new Class<?>[] {
                    Window.class, boolean.class });
            method.invoke(null, window, true);
        } catch (Throwable t) {
            System.err.println("Full screen mode is not supported");
            t.printStackTrace();
        }
    }
}
