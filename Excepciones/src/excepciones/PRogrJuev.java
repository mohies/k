/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**Escribe un programa que solicite el usuario el nombre de un fichero de texto y muestre su contenido en pantalla
 * si no se proporciona ningun nombre por defecto la aplicacion usara prueba.txt
 *
 * @author alu_tarde
 */
public class PRogrJuev {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileReader fr = null;
        BufferedReader br = null;
        String archivo = new String(); //podemos usar el scanner

        System.out.println("Introduce el nombre de un archivo para mostrar su contenido por pantalla.");
        archivo = sc.nextLine();

        try {
            if (archivo.equals("")){//archivo es un string podemos hacerlo con scanner arriba  
                fr = new FileReader("prueba.txt"); 
                br = new BufferedReader(fr);

                String linea = br.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = br.readLine();
                }
            } else {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                String linea = br.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = br.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
