/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosocioxml;

import java.util.Arrays;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ejemplosocioxml.Socio;

/**
 *
 * @author alu_tarde
 */
@XmlRootElement(name = "club")
@XmlType(propOrder = {"nombreClub", "listaSocios"}) //atributos de la clase
@XmlAccessorType(XmlAccessType.FIELD)
public class Club {
    @XmlElement(name="nombre")
    private String nombreClub;
    @XmlElementWrapper(name="socios")//estamos diciendo que es un wrapper de socios  luego hay que decir un wrapper de que
    @XmlElement(name="socio") //Esto es lo que es el wrapper socios
    private Socio[] listaSocios;
    public Club(){
        
    }

    public Club(String nombreClub) {
        this.nombreClub = nombreClub;
        this.listaSocios=new Socio[0];
    }
    
    
    public void nuevoSocio(Socio nuevo){
        listaSocios=Arrays.copyOf(listaSocios,listaSocios.length+1);
        listaSocios[listaSocios.length-1]=nuevo;
        
    }

    @Override
    public String toString() {
        return "Club{" + "nombreClub=" + nombreClub + ", listaSocios=" + Arrays.toString(listaSocios) + '}';
    }
    
    
    
}
