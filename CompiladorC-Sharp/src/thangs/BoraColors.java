package thangs;

import java.awt.Color;

/**
 * @author Fernando2
 * Created on Feb 17, 2015, 4:16:39 PM
 */

public class BoraColors {
    public static Color WHITE = new Color(hexToRGB("FFFFFF"));
    public static Color BLACK = new Color(hexToRGB("000000"));
    public static Color GRAY = new Color(hexToRGB("252623"));
    public static Color DARK_GRAY = new Color(hexToRGB("292B26"));
    public static Color LIGHT_GRAY = new Color(hexToRGB("494949"));
    public static Color LIGHTER_GRAY = new Color(hexToRGB("6A6A6A"));
    
    // Toma un color hexadecimal y lo convierte a RGB
    // para que lo entienda swing...
    private static int hexToRGB(String hexColor){
        return Integer.parseInt(hexColor, 16);
    }
}
