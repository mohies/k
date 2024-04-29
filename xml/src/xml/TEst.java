/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package xml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author alu_tarde
 */
public class TEst {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        // TODO code application logic here
        try {
            JAXBContext contexto = JAXBContext.newInstance(Socio.class);
            Unmarshaller um = contexto.createUnmarshaller();
            
            Socio s =(Socio) um.unmarshal(new FileReader("/home/alu_tarde/NetBeansProjects/xml/xml.xml"));
            System.out.println(s.toString());
            
            
        } catch (JAXBException e) {
            System.out.println(e);
        }
    }
}
