/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iccr.poo.ej1;

/**
 *
 * @author LabP4101
 */
public class Veterinario {
    
    public String diagnosticar (Conejo c){
        String resultado;
        double relacion = c.getEdad() / c.getPeso();
        if (relacion < 0.10 ) 
            resultado = "El conejo debe comer más";
        else
            resultado = "El conejo está en perfectas condiciones.";
        
        return resultado;
        
    }
    
}
