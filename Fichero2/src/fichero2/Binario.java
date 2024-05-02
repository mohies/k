/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Escribir en un archivos datos.dat 10 enteros;
 * @author alu_tarde
 */
public class Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int num[]={1,2,3,4,5,6,7,8,9,10};
      ObjectOutputStream o = null;
        try {
            // TODO code application logic here
            o = new ObjectOutputStream(new FileOutputStream("archivo.dat"));
            
            for (int i = 0; i < num.length; i++) {
                o.writeInt(i);
                
            }
        
        } catch (IOException ex) {
            System.out.println(ex);
            
        }
//        } finally {
//            try {
//                o.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Binario.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
}
