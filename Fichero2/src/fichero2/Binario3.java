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
import java.util.Scanner;

/**Pedir un entero n por consola y a continuacion pedir numeros de tipo double que iremos insertando en una 
 * tabla y guardarlo en un binario
 *
 * @author alu_tarde
 */
public class Binario3 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        ObjectOutputStream outputStream=null;

        // Guardar en archivo binario
        try  {
            outputStream = new ObjectOutputStream(new FileOutputStream("numeros.dat"));
            outputStream.writeObject(numeros);
            System.out.println("Los números se han guardado correctamente en 'numeros.dat'");
        } catch (IOException e) {
            System.err.println("Error al guardar los números en el archivo binario: " + e.getMessage());
        }
        
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("numeros.dat"))) {
            // Leemos el arreglo de números del archivo binario
            numeros = (double[]) inputStream.readObject();

            // Mostramos los números leídos
            System.out.println("Números leídos del archivo:");
           System.out.println(Arrays.toString(numeros));
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer los números del archivo binario: " + e.getMessage());
        }
    }
    
}
 
