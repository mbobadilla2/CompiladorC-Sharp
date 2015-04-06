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
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import listeners.MenuListener;

/**
 * @author Fernando2
 * Created on Feb 20, 2015, 2:03:52 PM
 */

public class BoraFiles {
    public static String TEMP_FILE = "src/thangs/BoraTemp.txt";
    public static String SYNTACTIC_ERROR = "src/thangs/SyntacticErrors.txt";
    public static String TOKENS = "src/thangs/Tokens.txt";
    public static String SEMANTIC_ERROR = "src/thangs/SemanticErrors.txt";
    public static String IOE = "BORANotFound";
    
    public static void readTemp() throws ParseException, FileNotFoundException{
        System.out.println("COMPILA");
        CompiladorC_Sharp.compilar(MenuListener.openTabs.get(MenuListener.tabs.getSelectedIndex()));
    }

    public static String openFile(){
        String text = "";
        
        JFileChooser jfc = new JFileChooser();
        int option = jfc.showOpenDialog(null);
        
        
        if(option == JFileChooser.APPROVE_OPTION){
            
            try{
                String path = jfc.getSelectedFile().getAbsolutePath();
                BufferedReader br = new BufferedReader(new FileReader(path));
                String line;
            
                String fileName = jfc.getSelectedFile().getName();
                MenuListener.tabs.setTitleAt(MenuListener.tabs.getSelectedIndex(), fileName);
                
                do{
                    line = br.readLine();
                    
                    if(line != null){
                        text += line + "\n";
                    }
                
                }while(line != null);
                
                //return text;
                
                //Reempazar los tabs por cuatro espacios...
                return text.replaceAll("\t", "    ");
                
            }catch(IOException e){
                BoraMessages.error("Hubo un error al abrir el archivo");
                return IOE;
            }
            
        }
        
        return IOE;
    }
    
    public static void saveAs(String text){
        JFileChooser jfc = new JFileChooser();
        int option = jfc.showSaveDialog(null);
        
        if(option == JFileChooser.APPROVE_OPTION){
            try{
                FileWriter fr = new FileWriter(new File(jfc.getSelectedFile().getAbsolutePath()+".cs"));
                fr.write(text);
                
                MenuListener.tabs.setTitleAt(MenuListener.tabs.getSelectedIndex(), jfc.getSelectedFile().getName()+".cs");
                
                fr.close();
                
            }catch(IOException e){
                BoraMessages.error("Ocurrió un error al guardar el archivo");
            
            }
        }
    }
 /*   public static ArrayList<String> readFile(String path){
        ArrayList<String> list = new ArrayList<>();
        
        try{
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                
                do{
                    line = br.readLine();
                    if(line != null){
                        list.add(line);
                    }
                }while(line != null);
            }
            
        }catch(IOException e){
            System.out.println("IOException(READ): " + e.getMessage());
        
        }
        
        return list;
    }*/
    
    public static void writeFile(String text, String path){
        
        try{
            try (FileWriter fr = new FileWriter(path)) {
                fr.write(text);
                fr.close();
            }
            
        }catch(IOException e){
            BoraMessages.error("Hubo un error al generar el archivo temporal", "Error en la compilación");
        }
    }
}
