/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iccr.poo.ej1;

/**
 *
 * @author LabP41010
 */
public abstract class Mascota {
    
    protected double peso;
    protected String nombre;
    private boolean estaEsterilizado;

    public Mascota() {
    }

    public Mascota(double peso, String nombre, boolean estaEsterilizado) {
        this.peso = peso;
        this.nombre = nombre;
        this.estaEsterilizado = estaEsterilizado;
    }
    
    

    public boolean getEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" + "peso=" + peso + ", nombre=" + nombre + ", estaEsterilizado=" + estaEsterilizado + '}';
    }
    
    public abstract String presentarOnomatopeya();
    
}
