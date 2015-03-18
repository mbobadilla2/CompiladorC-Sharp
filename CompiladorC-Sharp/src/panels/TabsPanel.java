package panels;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import thangs.BoraColors;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 12:45:26 PM
 */

public class TabsPanel extends JTabbedPane {
    public static String TITLE = "Untitled";
    protected JFrame frame;
    
    public TabsPanel(JFrame frame){
        this.frame = frame;
        this.setBackground(BoraColors.DARK_GRAY);
        this.setBorder(BorderFactory.createEmptyBorder());
    }
    
    public void newTab(){
        NewTabPanel tab = new NewTabPanel(frame, new JPanel(), new JPanel());
        this.add(tab, TITLE);
    }
}
