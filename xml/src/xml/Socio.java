/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xml;

import java.time.LocalDate;
import javax.xml.bind.annotation.*;
/**
 *
 * @author alu_tarde
 */

@XmlRootElement(name="socio")
@XmlType(propOrder={"identificacion","nombre","direccion","alta"}) //los atributos de la clase
@XmlAccessorType(XmlAccessType.FIELD    )

public class Socio {
    @XmlAttribute(name="id",required=true)
   private int identificacion;
    @XmlElement(name="nombre")
    private String nombre;
    //@XmlElement(name="direccion") no es encesario porque se llama igual
    private String direccion;
    @XmlElement(name="alta")
    private String alta;

    public Socio(int identificacion, String nombre, String direccion, String alta) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Socio{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", direccion=" + direccion + ", alta=" + alta + '}';
    }
    
    
    
}
