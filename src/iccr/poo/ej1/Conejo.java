/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iccr.poo.ej1;

/**
 *
 * @author LabP4101
 */
public class Conejo extends Mascota implements Comparable<Conejo> {

    /*atributos - variables de instancia*/
    private int edad;
    private double tasaCrecimientoPorcentual;
    private String raza;
    private String sexo;
    //el conejo tendra una dieta de 5 cosas no mas pero si menos
    private String[] dieta = new String[5];

    public Conejo(int edad, double peso, double tasaCrecimientoPorcentual, String nombre) {
        this.edad = edad;
        this.peso = peso;
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
        this.nombre = nombre;
    }

    public Conejo(String nombre, double peso, boolean estsEsterilizado) {
        this.nombre = nombre;
        this.peso = peso;
        super.setEstaEsterilizado(estsEsterilizado);
    }

    public Conejo() {

    }

    /*set y get*/
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getTasaCrecimientoPorcentual() {
        return tasaCrecimientoPorcentual;
    }

    public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual) {
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
    }

    public String[] getDieta() {
        return dieta;
    }

    public void setDieta(String[] dieta) {
        this.dieta = dieta;
    }

    /*
    simula el crecimiento diario del conejo
     */
    public void crecer() {
        this.edad++;
        this.peso += this.peso * tasaCrecimientoPorcentual;
    }

    public boolean esAdulto() {
        return this.edad > 99;
    }

    public String presentarDieta() {
        //logica: formar un string con cada opcion de dieta separado por -
        String resultado = "";

        /*for (int i = 0; i < dieta.length; i++) {
            resultado += dieta[i] + " - ";
        }*/
        //utilizar un for mejorado
        for (String d : dieta) {
            if (d != null) {
                resultado += d + " -- ";
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Conejo" + "\nEdad: " + edad + ", Peso: " + peso + ", Tasa de "
                + "Crecimiento Porcentual: " + tasaCrecimientoPorcentual + ", "
                + "Raza: " + raza + ", Nombre: " + nombre + ", Sexo: " + sexo
                + ", Esta Esterilizado: " + super.getEstaEsterilizado();
    }

    @Override
    public String presentarOnomatopeya() {
        return "Wii wii wii";
    }

    public String presentarCuidados() {
        return "Este tipo de mascotas debe ser tratado por un veterinario de "
                + "exoticos";
    }
    
    //Orden Natural
    @Override
    public int compareTo(Conejo o) {
        //comparacion del peso desde 0
        /*if (this.peso < o.peso) {
            return -1;
        } else if (this.peso == o.peso) {
            return 0;
        } else {
            return 1;
        }*/
        
        //Compara con la clase wrapper
        return Double.compare(this.edad, o.edad);
    }

}
