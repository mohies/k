/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaficherostextoagenda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marta
 */

@XmlRootElement(name="contacto")
@XmlType(propOrder={"NOMBRE","TLF"}) //los atributos de la clase
@XmlAccessorType(XmlAccessType.FIELD)
public class Contacto implements Comparable {
    
    @XmlElement(name="NOMBRE")
    private  String NOMBRE;
    @XmlElement(name="TLF")
    private  String TLF;
    
    Contacto(){
        
    }

    Contacto(String nombre, String tlf) { // constructor
        this.NOMBRE = nombre;
        this.TLF = tlf;
    }
    

    public String formatoFichero() {
        return (NOMBRE + ";" + TLF);
    }

    //Dos contactos son iguales si sus nombres son iguales
    @Override
    public boolean equals(Object otro) {
        Contacto otroContacto = (Contacto) otro;
        return this.NOMBRE.equals(otroContacto.NOMBRE);
    }

    @Override
    public String toString() {
        String aux;
        aux = "Nombre: " + NOMBRE + "\tTeléfono: " + TLF;
        return (aux);
    }

    // Orden por defecto: por nombre alfabéticamente
    @Override
    public int compareTo(Object otro) {
        return this.NOMBRE.compareTo(((Contacto) otro).NOMBRE);
    }
}
