/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package excepciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *Diseña una aplicacion que pida al usuario su  nombre y edad y estos  datos deben guardarse
 * en el fichero datos.txt si este fichero existe
 * deben añadirse en una nueva linea en caso de no existir debe crearse.
 * @author alu_tarde
 */
public class progjuev2 {

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", true ))){//este parametro para que no me pise 
            // Solicitar al usuario que ingrese su nombre y edad
            System.out.print("Ingresa tu nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingresa tu edad: ");
            int edad = sc.nextInt();

            // Escribir los datos del usuario en el archivo datos.txt
            writer.write(nombre + "," + edad);
            writer.newLine();

            System.out.println("Datos guardados en el archivo datos.txt.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            sc.close(); // Cerrar el Scanner
        }
    }
}
