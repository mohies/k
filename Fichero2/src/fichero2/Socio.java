/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichero2;

import java.io.Serializable;

/**
 *
 * @author alu_tarde
 */
public class Socio implements Serializable {
    String nombre;
    String Dni;

    public Socio(String nombre, String Dni) {
        this.nombre = nombre;
        this.Dni = Dni;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", Dni=" + Dni + '}';
    }
    
    
    
    
}
