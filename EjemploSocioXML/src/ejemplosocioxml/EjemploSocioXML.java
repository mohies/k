/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosocioxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author martarobina
 */
public class EjemploSocioXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            JAXBContext contexto = JAXBContext.newInstance(Socio.class);
            Unmarshaller um = contexto.createUnmarshaller();

            Socio s = (Socio) um.unmarshal(new FileReader("socio.xml"));
            System.out.println(s.toString());
            
            Marshaller m = contexto.createMarshaller();
            Socio s1 = new Socio(1, "Armando Fuentes", "C/Fontanería 1", "01/09/1990");
            Club c1=new Club("ClubDam");
           
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);  // Establece salida formateada, para que no se escriba todo en una línea
            m.marshal(s1, new FileWriter("socio1.xml"));

            JAXBContext contexto2 = JAXBContext.newInstance(Club.class);
            Unmarshaller um2=contexto2.createUnmarshaller();

            Club c=(Club) um2.unmarshal(new FileReader("club.xml"));
    
            System.out.println(c.toString());
            
            c1.nuevoSocio(s1);
            Marshaller m2 = contexto2.createMarshaller(); //hay que tener cuidado con esto hay que crear dos marshall
            
            m2.marshal(c1, new FileWriter("club2.xml"));
        } 
        catch (JAXBException e){
            System.out.println(e);
        } 
        /*catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploXML.class.getName()).log(Level.SEVERE, null, ex);
        } */
        catch (IOException ex) {
            Logger.getLogger(EjemploSocioXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
