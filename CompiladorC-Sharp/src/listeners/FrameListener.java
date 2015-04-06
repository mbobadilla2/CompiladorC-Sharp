package listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacc.CompiladorC_Sharp;
import javacc.ParseException;
import panels.NewTabPanel;
import panels.TabsPanel;
import thangs.BoraMessages;

/**
 * @author fernando2
 * Created on Apr 6, 2015, 3:52:27 PM
 */

public class FrameListener extends WindowAdapter{
    
    public FrameListener(){
    }
    
    @Override
    public void windowClosing(WindowEvent e){
        BoraMessages.close();
    }
   
}
