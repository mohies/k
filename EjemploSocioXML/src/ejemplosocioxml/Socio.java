/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosocioxml;

import javax.xml.bind.annotation.*;
/**
 *
 * @author martarobina
 */
@XmlRootElement(name = "socio")
@XmlType(propOrder = {"identificacion", "nombreSocio", "direccion", "fechaAlta"}) //atributos de la clase
@XmlAccessorType(XmlAccessType.FIELD) // FIELD: los elementos hijo del elemento raiz "socio" se tomarán 
                                      // directamente de los atributos de la clase, aunque sean privados
                                      // PROPERTY: se tomarán de los getter/setter
                                      // PUBLIC_MEMBER: se tomarán de los miembros públicos

public class Socio {
    
    @XmlAttribute(name = "id", required = true)
    private int identificacion;
    @XmlElement(name = "nombre")
    private String nombreSocio;
    //@XmlElement(name = "direccion") // Se puede comentar porque se llaman igual EN EL XML
    private String direccion;
    @XmlElement(name = "alta")
    private String fechaAlta;
    
    public Socio(){
        
    }
    public Socio (int identificacion, String nombreSocio, String direccion, String fechaAlta){
        this.direccion = direccion;
        this.identificacion = identificacion;
        this.nombreSocio = nombreSocio;
        this.fechaAlta = fechaAlta;
    }
    
    @Override
    public String toString() {
        return "\nID:" + identificacion + " Nombre:" + nombreSocio
                + " Direccion:" + direccion + " Fecha Alta:" + fechaAlta;
    }
}
