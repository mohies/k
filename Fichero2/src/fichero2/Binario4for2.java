/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author alu_tarde
 */
public class Binario4for2 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
     
     ObjectInputStream inputStream=null;
        try  {
             inputStream = new ObjectInputStream(new FileInputStream("numeros.dat"));
            // Leemos el arreglo de números del archivo binario
            double[] numeros = (double[]) inputStream.readObject();

            // Mostramos los números leídos
            System.out.println("Números leídos del archivo:");
           
                
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println((double)i);
                    
                }
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer los números del archivo binario: " + e.getMessage());
        }
    }
}

