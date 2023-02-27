/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iccr.poo.ej1;

/**
 *
 * @author LabP41010
 */
public class Perro extends Mascota {

    public Perro(String nombre, double peso, boolean estaEsterilizado) {
        /*asignar los valores a las variables de instancia usando
         */
        super.setEstaEsterilizado(estaEsterilizado);
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String presentarOnomatopeya() {
        return "Guau guau guau";
    }
    
    

}
