package panels;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 12:45:26 PM
 */

public class TabsPanel extends JTabbedPane {
    protected JFrame frame;
    
    public TabsPanel(JFrame frame){
        this.frame = frame;
        this.setBorder(BorderFactory.createEmptyBorder());
    }
    
    public void newTab(){
        this.add(new NewTabPanel(frame, new JPanel(), new JPanel()), "Untitled");
    }
}
