package thangs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javacc.CompiladorC_Sharp;
import javacc.ParseException;
import javax.swing.JTextPane;
import listeners.MenuListener;

/**
 * @author Fernando2
 * Created on Feb 20, 2015, 2:03:52 PM
 */

public class BoraFiles {
    public static String TEMP_FILE = "src/thangs/BoraTemp.txt";
    
    public static void readTemp() throws ParseException, FileNotFoundException{
        System.out.println("COMPILA");
        CompiladorC_Sharp.Compilar(MenuListener.openTabs.get(MenuListener.tabs.getSelectedIndex()));
    }

    public static ArrayList<String> readFile(String path){
        ArrayList<String> list = new ArrayList<>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            
            do{
                line = br.readLine();
                if(line != null){
                    list.add(line);
                }
            }while(line != null);
            
            br.close();
            
        }catch(IOException e){
            System.out.println("IOException(READ): " + e.getMessage());
        
        }
        
        return list;
    }
    
    public static void writeFile(JTextPane textPane){
        
        try{
            FileWriter fr = new FileWriter(TEMP_FILE);
            fr.write(textPane.getText());
            
            fr.close();
            
        }catch(IOException e){
            System.out.println("IOException(WRITE): " + e.getMessage());
        }
    }
}
