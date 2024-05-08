/*
 I love Programming.
 */
package mohcenbenizza_tarea8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class MohcenBenizza_Tarea8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
        
        //1.leer fichero
          String[] nombres = new String[0];
        
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("lista.dat"))) {
              
            while (true) {
               nombres=(String[]) inputStream.readObject();
                
                System.out.println(Arrays.toString(nombres));

            }
            
            
       } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lista vacía");
        }
        
            Scanner sc = new Scanner(System.in);
        
            
       
     
        System.out.println("Escribe el nombre");
        String nombre=sc.nextLine();
         
            while(!nombre.equals("fin")){
                
                nombres=Arrays.copyOf(nombres, nombres.length+1);
                nombres[nombres.length-1]=nombre;
                 System.out.println("Escribe otro nombre");
              nombre=sc.nextLine();
        }
    
        
            
        
        try( ObjectOutputStream outputStream =new ObjectOutputStream(new FileOutputStream("lista.dat"))) {
           
              Arrays.sort(nombres);
           outputStream.writeObject(nombres);
           System.out.println("Los nombres se han guardado correctamente");
           
        } catch (IOException e) {
            System.err.println("Error al guardar los números en el archivo binario: " + e.getMessage());
        }
        
    }
    
}
