/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author alu_tarde
 */
public class ProgSosio {

    /**abrir fichero y recuperar informacion y mostrarla por pantalla
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Socio tabla[]=new Socio[2];
        
        Socio s1 = new Socio("Mohcen","543243432L");
        Socio s2 = new Socio("Eduardo","43234234L");
        tabla[0]=s1;
        tabla[1]=s2;
        
 
        
        ObjectInputStream inputStream=null;
         ObjectOutputStream o=null;
         
           try {
            // TODO code application logic here
            o = new ObjectOutputStream(new FileOutputStream("socio.dat"));
         
            o.writeObject(tabla);
        
        } catch (IOException ex) {
            System.out.println(ex);
            
        }
           
 try {
    inputStream = new ObjectInputStream(new FileInputStream("socio.dat"));
  
     while (true) {         
     System.out.println(Arrays.toString(tabla));    
     }
     
    
} catch (IOException e) {
    System.err.println("Error al leer los objetos del archivo binario: " + e.getMessage());
}
    }
}
