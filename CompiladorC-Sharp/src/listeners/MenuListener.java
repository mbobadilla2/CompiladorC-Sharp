package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import menu.MainMenu;
import panels.TabsPanel;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 1:22:12 PM
 */

public class MenuListener implements ActionListener{
    private TabsPanel tabs;
    private MainMenu menu;
    
    public MenuListener(MainMenu menu, TabsPanel tabs){
        this.menu = menu;
        this.tabs = tabs;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(menu.getNewFile())){
            tabs.newTab();
        }else{
        
        JOptionPane.showMessageDialog(null, "Hola mamá, ya casi termino mi tarea",
                                        "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
