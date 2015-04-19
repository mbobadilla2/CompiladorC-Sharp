package javacc;

import java.util.HashMap;

class AnalizadorSemantico{
    
    private static final HashMap<String,String> tabla = new HashMap<>();

    public static HashMap<String, String> getTabla() {
        return tabla;
    }
    
    
    static void insertarSimbolo(String identificador, String tipo){
        tabla.put(identificador,tipo);
    }
    
    /*Kind tipos
     *
     * int: 23      Entero: 28
     * string: 25   Cadena: 29
     * char: 26     Caracter: 30
     * float: 24    Flotante: 31
     * bool: 27     True: 32    False: 33
     * null: 34
    */   
    
    static String declaracionSencilla(String tipoDato, String identificador, int linea){
        if (!tabla.containsKey(identificador)) {
            insertarSimbolo(identificador, tipoDato);
            return "";
        }else
            return "ERROR en la linea " + linea+": El identificador: " + identificador +
                    " ya ha sido declarado, con tipo de dato: " +
                    tabla.get(identificador);
    } 
    
    static String declaracionCompleta(String tipoDato, String identificador1, String identificador2, int linea){
        if (tabla.containsKey(identificador2)) {
            if (tabla.get(identificador2).equals(tipoDato) || (tabla.get(identificador2).equals("int") && tipoDato.equals("float"))) {
                return declaracionSencilla(tipoDato, identificador1, linea);
            }
            return "ERROR en la linea " + linea+"! El identificador: " + identificador2 + " (" + tabla.get(identificador2)+ ") es incompatible con el identificador: " +
                    identificador1 + " (" + tipoDato+ ")";
        }else
            return "ERROR en la linea " + linea+"! El identificador: " + identificador2 + " no ha sido declarado.";
    }
    
    static String declaracionSinTipo(String identificador1, String identificador2, int linea ){
        if (tabla.containsKey(identificador1)) {
            if (tabla.containsKey(identificador2)) {
                String tipo1 = tabla.get(identificador1);  
                String tipo2 = tabla.get(identificador2);  
                if (tipo1.equals(tipo2) || (tipo2.equals("int") && tipo1.equals("float"))) {
                    return "";
                }else
                    return "ERROR en la linea " + linea+"! El identificador: " + identificador2 +"(" +tipo2+") es incompatible con el identificador: " + 
                            identificador1 + "(" + tipo1 +")";
            }else            
                return "ERROR en la linea " + linea+"! El identificador: " + identificador2 + " no ha sido declarado";
        }else
            return "ERROR en la linea " + linea+"! El identificador: " + identificador1 + " no ha sido declarado";
    }
    
    
    
    
}