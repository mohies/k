/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichero2;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author alu_tarde
 */
public class Registro implements Serializable {
    
    double  grados;
    LocalDateTime fechahora;

    public Registro(double  grados) {
        this.grados = grados;
        this.fechahora = LocalDateTime.now();
    }
    

    @Override
    public String toString() {
        return "Registro{" + "grados=" + grados + ", fechahora=" + fechahora + '}';
    }
    
    
    
    
}
