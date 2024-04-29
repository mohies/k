/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaficherostextoagenda;

/**
 *
 * @author marta
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="agenda")
@XmlType(propOrder={"agenda","numContactos"}) //los atributos de la clase
@XmlAccessorType(XmlAccessType.FIELD)
public class Agenda {
    
    
    @XmlElementWrapper(name = "contactos")
    @XmlElement(name="contacto")
    private Contacto agenda[];
    @XmlElement(name="numContactos")
    private int numContactos;   // Número de contactos introducidos
    
    Agenda(){
        
    }

    Agenda(int tam) {
        agenda = new Contacto[tam]; // Agenda vacía
        numContactos = 0;
    }

    
    
    public void nuevoContacto(String nombre, String tlf) {
        if (numContactos < agenda.length) {
            agenda[numContactos] = new Contacto(nombre, tlf);
            numContactos++;
        }
    }

    public boolean agendaLlena() {
        return (numContactos == agenda.length);
    }

    public void buscaNombre(String nombre) {
        Contacto claveBusqueda = new Contacto(nombre, "");
        for (int i = 0; i < numContactos; i++) {
            if (agenda[i].equals(claveBusqueda)) {
                System.out.println(agenda[i]);
            }
        }
    }

    public void muestraTodos() {
        Arrays.sort(agenda, 0, numContactos);   // Ordena por orden natural desde el elemento 0 
        // hasta el elemento numContactos sin incluirlo
        for (int i = 0; i < numContactos; i++) {
            System.out.println(agenda[i].toString());
        }
    }

    public void desdeFichero() {    // Lectura del fichero con la agenda guardada en la anterior ejecución
        try {

            JAXBContext contexto1 = JAXBContext.newInstance(Agenda.class);
            Unmarshaller um = contexto1.createUnmarshaller();
            
            Agenda c = (Agenda) um.unmarshal(new FileReader("Agenda.xml"));
            System.out.println(c.toString());

          

            
         } 
        catch (JAXBException e){
            System.out.println(e);
        } 
        /*catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploXML.class.getName()).log(Level.SEVERE, null, ex);
        } */
        catch (IOException ex) {
            System.out.println(ex);
        }
    }

    void aFichero(Agenda a) {
    try{
            
            
    
            
            
            JAXBContext contexto = JAXBContext.newInstance(Agenda.class);

            Marshaller m = contexto.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(a, new FileWriter("Agenda.xml"));
            
            
        } 
        catch (JAXBException e){
            System.out.println(e);
        } 
        /*catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploXML.class.getName()).log(Level.SEVERE, null, ex);
        } */
        catch (IOException ex) {
            System.out.println(ex);
        }
}

    @Override
    public String toString() {
        return "Agenda{" + "agenda=" + Arrays.toString(agenda) + ", numContactos=" + numContactos + '}';
    }
    
    
    
}
