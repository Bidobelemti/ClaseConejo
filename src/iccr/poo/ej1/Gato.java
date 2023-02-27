/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iccr.poo.ej1;

/**
 *
 * @author LabP41010
 */
public class Gato extends Mascota {
    public Gato (String nombre, double peso, boolean estaEsterilizado){
        /*llamda al constructor con datos del padre para asignar los valores a 
        las variables de instancia
        */
        super(peso,nombre,estaEsterilizado);
    }
    
    @Override
    public String presentarOnomatopeya() {
        return "Miau miau miau";
    }
}
