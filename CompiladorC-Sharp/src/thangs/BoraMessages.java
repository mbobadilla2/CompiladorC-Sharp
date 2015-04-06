package thangs;

import javax.swing.JOptionPane;

/**
 * @author Fernando2
 * Created on Mar 17, 2015, 6:58:20 PM
 */

public class BoraMessages {

    public static void error(String msg, String title){
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
    }
    
    public static void error(String msg){
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void warning(String msg, String title){
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.OK_OPTION);
    }
    
    public static void close(){
        String[] options = {"Salir", "Cancelar"};
        int opt = JOptionPane.showOptionDialog(null, "Se perderá todo el trabajo no guardado", "Cerrar programa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                options, options[1]);
        
        if(opt == JOptionPane.OK_OPTION){
            System.exit(-1);
        }
    }
}
