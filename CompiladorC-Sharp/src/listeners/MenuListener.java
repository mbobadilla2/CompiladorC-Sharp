package listeners;

import javacc.CompiladorC_Sharp;
import javacc.CompiladorC_Sharp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacc.ParseException;
import javax.swing.JOptionPane;
import menu.MainMenu;
import panels.NewTabPanel;
import panels.TabsPanel;
import thangs.BoraFiles;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 1:22:12 PM
 */

public class MenuListener implements ActionListener{
    public static TabsPanel tabs;
    private MainMenu menu;
    public static ArrayList<NewTabPanel> openTabs;
    
    public MenuListener(MainMenu menu){
        this.menu = menu;
        openTabs = new ArrayList<>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(menu.getNewFile())){
            tabs.newTab();
        
        }else if(e.getSource().equals(menu.getLexSync())){
            BoraFiles.writeFile(openTabs.get(tabs.getSelectedIndex()).getCode());
            BoraFiles.readTemp();
            /*try {
                CompiladorC_Sharp.Compilar(openTabs.get(tabs.getSelectedIndex()));
            } catch (ParseException ex) {
                System.out.println("Algo salió mal: " + ex.getMessage());
            }*/
            
        }else{
        
        JOptionPane.showMessageDialog(null, "Hola mamá, ya casi termino mi tarea",
                                        "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void addTab(NewTabPanel tab){
        openTabs.add(tab);
    }

    public void setTabs(TabsPanel tabs) {
        this.tabs = tabs;
    }
    
    
}
