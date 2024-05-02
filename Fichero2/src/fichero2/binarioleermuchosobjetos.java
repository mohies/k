/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 *
 * @author alu_tarde
 */
public class binarioleermuchosobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
            // Leemos los arreglos de números hasta que se lance EOFException
      ObjectInputStream inputStream=null;      
    int numArrays = 0;
    try  {
         inputStream = new ObjectInputStream(new FileInputStream("numeros.dat"));
         ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("cadena.dat"));
        while (true) {
          
            
             double[] numeros = (double[]) inputStream.readObject();
        String[] frases=(String[]) inputStream2.readObject();
      
            System.out.println(Arrays.toString(frases));
            System.out.println(Arrays.toString(numeros));
        }
    } catch (EOFException e) {
        System.out.println("FIN");
    } catch (IOException | ClassNotFoundException e) {
        System.err.println("Error al leer los objetos del archivo binario: " + e.getMessage());
    }
}
}
