package menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import listeners.MenuListener;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 12:57:46 PM
 */

public class MainMenu extends JMenuBar{
    private JMenu file, edit, build, help, openRecent;
    private JMenuItem newFile, open, close,
                        save, saveAs, saveAll, exit;
    private JMenuItem copy, cut, paste, find, replace;
    private JMenuItem lexical, syntactic, lexSync;
    private JMenuItem manual, tiger, about;
    
    public MainMenu(){
        setComponents();
    }
    
    public final void setComponents(){
        file = new JMenu("File");
        edit = new JMenu("Edit");
        build = new JMenu("Build");
        help = new JMenu("Help");
        
        openRecent = new JMenu("Open recent...");
        openRecent.add(new JMenuItem("Código super chido.cs"));
        openRecent.add(new JMenuItem("Código super chido2.cs"));
        openRecent.add(new JMenuItem("Código super chido3.cs"));
        openRecent.add(new JMenuItem("Código super chido4.cs"));
        openRecent.add(new JMenuItem("Código super chido5.cs"));

        // File menu...
        newFile = new JMenuItem("New file");
        open = new JMenuItem("Open");
        close = new JMenuItem("Close");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save as...");
        saveAll = new JMenuItem("Save all");
        exit = new JMenuItem("Exit");
        
        file.add(newFile);
        file.add(new JSeparator());
        file.add(open);
        file.add(openRecent);
        file.add(new JSeparator());
        file.add(close);
        file.add(new JSeparator());
        file.add(save);
        file.add(saveAs);
        file.add(saveAll);
        file.add(new JSeparator());
        file.add(exit);
        
        // Edit menu....
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");
        find = new JMenuItem("Find");
        replace = new JMenuItem("Replace...");
        
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        edit.add(new JSeparator());
        edit.add(find);
        edit.add(new JSeparator());
        edit.add(replace);
        
        // Build menu...
        lexical = new JMenuItem("Lexical phase");
        syntactic = new JMenuItem("Syntactic phase");
        lexSync = new JMenuItem("Fire");
        
        build.add(lexical);
        build.add(syntactic);
        build.add(new JSeparator());
        build.add(lexSync);
        
        // Help menu...
        manual = new JMenuItem("User manual");
        tiger = new JMenuItem("Eye of the tiger");
        about = new JMenuItem("About BORA");
        
        help.add(manual);
        help.add(new JSeparator());
        help.add(tiger);
        help.add(new JSeparator());
        help.add(about);
        
        // All togethers...
        this.add(file);
        this.add(edit);
        this.add(build);
        this.add(help);
    }

    public void addEvents(MenuListener listener){
        newFile.addActionListener(listener);
        open.addActionListener(listener);
        close.addActionListener(listener);
        save.addActionListener(listener);
        saveAs.addActionListener(listener);
        saveAll.addActionListener(listener);
        exit.addActionListener(listener);
        
        copy.addActionListener(listener);
        cut.addActionListener(listener);
        paste .addActionListener(listener);
        find.addActionListener(listener);
        replace.addActionListener(listener);
                
        lexical.addActionListener(listener);
        syntactic.addActionListener(listener);
        lexSync.addActionListener(listener);
         
        manual.addActionListener(listener);
        tiger.addActionListener(listener);
        about.addActionListener(listener);
    }
    
    public JMenuItem getNewFile() {
        return newFile;
    }

    public JMenuItem getOpen() {
        return open;
    }

    public JMenuItem getClose() {
        return close;
    }
    
    public JMenuItem getOpenRecent() {
        return openRecent;
    }

    public JMenuItem getSave() {
        return save;
    }

    public JMenuItem getSaveAs() {
        return saveAs;
    }

    public JMenuItem getSaveAll() {
        return saveAll;
    }

    public JMenuItem getExit() {
        return exit;
    }

    public JMenuItem getCopy() {
        return copy;
    }

    public JMenuItem getCut() {
        return cut;
    }

    public JMenuItem getPaste() {
        return paste;
    }

    public JMenuItem getFind() {
        return find;
    }

    public JMenuItem getReplace() {
        return replace;
    }

    public JMenuItem getLexical() {
        return lexical;
    }

    public JMenuItem getSyntactic() {
        return syntactic;
    }

    public JMenuItem getLexSync() {
        return lexSync;
    }

    public JMenuItem getManual() {
        return manual;
    }

    public JMenuItem getTiger() {
        return tiger;
    }

    public JMenuItem getAbout() {
        return about;
    }
    
    
}
