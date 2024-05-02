/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**Crear una cadena y serializar el string
 *
 * @author alu_tarde
 */
public class Binario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       String num[]={"sad","sdasda","sdaasd","asdasd","asdasd"};
      ObjectOutputStream o = null;
        try {
            // TODO code application logic here
            o = new ObjectOutputStream(new FileOutputStream("cadena.dat"));
         
            o.writeObject(num);
        
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
