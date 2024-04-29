/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**Escribe un programa que duplique el contenido del fichero cuyo nombre se pide al usuario
 * el fichero copia tendra el mismo nombre con el prefijo copiadefichero.txt.
 *
 * @author alu_tarde
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
       FileWriter file= null;
        Scanner sc=null;
         BufferedWriter bf=null;
         FileReader f=null;
         BufferedReader bf2=null;
        try { 
            file = new FileWriter( "elcurro");
            bf=new BufferedWriter(file);
            
            
            System.out.println("Introducir linea");

            String linea;
            while (!(linea = sc.nextLine()).equals("fin")) { //si no es igual a fin la linea
                
                bf.write(linea);
                bf.newLine(); // salto de linea
            }

            System.out.println("exito");
            
           

         

            System.out.println("Contenido del archivo copia:");
            String linea2;
            while ((linea2 = bf2.readLine()) != null) {
                System.out.println(linea2);
            }

           
   
            
            
            
            
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }finally{
            try {
                
               if (bf != null) {
                    bf.close();
                }
                if (bf2 != null) {
                    bf2.close();
                }
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
}
