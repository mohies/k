/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package mohcenbenizza_tarea8;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class EjLLamadasCAsa {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        ObjectInputStream inputStream = null;
        ObjectOutputStream outputStream = null;
        Scanner scanner = new Scanner(System.in);

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("llamadas.dat"));

            int opcion;
            do {
                System.out.println("1.Añadir  llamadas");
                System.out.println("2.lista completa  ");
                System.out.println("0.salir");
                System.out.print(" opción: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.print("introduce: ");
                        int llamadas = scanner.nextInt();
                        outputStream.writeInt(llamadas);
                        System.out.println("guardado correctamente.");
                        outputStream.flush();
                        break;
                    case 2:
                        inputStream = new ObjectInputStream(new FileInputStream("llamadas.dat"));
                        System.out.println(" Lista de  llamadas:");
                        try {
                            while (true) {
                                int llamadasDia = inputStream.readInt();
                                System.out.println( llamadasDia + " llamadas");
                            }
                        } catch (EOFException e) {
                            System.out.println("No hay mas " + e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } while (opcion != 0);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

