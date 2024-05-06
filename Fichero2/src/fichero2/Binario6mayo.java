/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fichero2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Implementar un programa que solicita al usuario diez numero enteros y los vaya guardando en el fichero datos.dat
 * despues debe guardar los numeros pares en pares.dat y los impares en impares.dat
 * @author alu_tarde
 */
public class Binario6mayo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
          ObjectInputStream inputStream=null;
        ObjectOutputStream outputStream=null;
               ObjectOutputStream outputStreamImPar=null;
         ObjectOutputStream outputStreamPar=null;
        Scanner sc = new Scanner(System.in);
       
        int num;
        
        try {
           outputStream = new ObjectOutputStream(new FileOutputStream("datos.dat")); 
            System.out.println("Introduce los numeros");
            for (int i = 0; i < 10; i++) {
                num=sc.nextInt();
                outputStream.writeInt(num);
            }
             System.out.println("Se guardo");
        } catch (IOException e) {
                    System.out.println(e.getMessage());
         }finally{
                  try{
                      if(outputStream!=null){
                        outputStream.close();
                    }
                  }catch(IOException e){
                      System.out.println("error" + e.getMessage());
                           
                           }
                }
        
         try {
                         inputStream = new ObjectInputStream(new FileInputStream("datos.dat"));
                      outputStreamPar = new ObjectOutputStream(new FileOutputStream("par.dat"));
                         outputStreamImPar = new ObjectOutputStream(new FileOutputStream("impar.dat"));
                        System.out.println("numeros :");
                      while(true){
                          
                      
                            int r = (int) inputStream.readInt();
                           
                            System.out.println(r);
                          
                            if (r % 2 ==0) {
                                System.out.println("Es par");
                   
                                outputStreamPar.writeInt(r);
                           
                            }else{
                                System.out.println("Es Impar");
                    
                                outputStreamImPar.writeInt(r);
                      
                                
                            }
                       }   
                    } catch (EOFException e) { //esto es el final de
                       System.out.println("No hay mas reg : "+e.getMessage());
                    } catch (IOException  e) {
                        System.out.println("Error al leer los registros: " + e.getMessage());
                    } finally {
                        try {
                            if(outputStreamImPar!=null){
                                outputStreamImPar.close();
                            }
                            if (outputStreamPar!=null){
                                outputStreamPar.close();
                            }
                            if (inputStream != null){
                                inputStream.close();
                            }
                        } catch (IOException e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                    }
        
              
         try {
                        inputStream = new ObjectInputStream(new FileInputStream("par.dat"));
                        System.out.println("Registros impares:");
                      while(true){
                            int n = (int) inputStream.readInt();
                           
                            System.out.println(n);
                      }
                    } catch (EOFException e) { //esto es el final de
                       System.out.println("No hay mas reg : "+e.getMessage());
                    } catch (IOException  e) {
                        System.out.println("Error al leer los registros: " + e.getMessage());
                    } finally {
                        try {
                            if (inputStream != null){
                                inputStream.close();
                            }
                        } catch (IOException e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                    }
    }
    
    
}
