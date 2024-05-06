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
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
public class TestRegistro {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream inputStream=null;
        ObjectOutputStream outputStream=null;
        Scanner sc = new Scanner(System.in);
        
        
      
       
        int num;
    
        
        do {  
            
        System.out.println("ELIGE ALGUNA DE LAS OPCIONES");
        System.out.println("0.Salida");
        System.out.println("1.Insertar Valores");
        System.out.println("2.Mostrar valores");
        num=sc.nextInt();
        switch (num) {
            case 1:
                // hacer el output apra que tel o ahga solo uan vez y el archivo tiene que sestar vacio
                System.out.println("Nueva temperatura a añadir");
                double temperatura=sc.nextDouble();
                Registro nuevoReg = new Registro(temperatura);
                try {
              outputStream = new ObjectOutputStream(new FileOutputStream("tiempo.dat",true)); 
              
              outputStream.writeObject(nuevoReg);
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
                break;
                
             case 2:
                try {
                        inputStream = new ObjectInputStream(new FileInputStream("tiempo.dat"));
                        System.out.println("Registros históricos:");
                        while (true) {
                            Registro r = (Registro) inputStream.readObject();
                           
                            System.out.println(r);
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
                    break;
                
             case 0:
                 System.out.println("Has salido");
                 break;
            default:
                System.out.println("Esta opcion es erronea");;
        }
    } while (num!=0);
    } 
}
