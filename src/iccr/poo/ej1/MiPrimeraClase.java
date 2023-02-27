/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iccr.poo.ej1;

import java.util.Scanner;

/**
 *
 * @author LabP4101
 */
public class MiPrimeraClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conejo gus = new Conejo();
        Conejo pepe = new Conejo();
        System.out.println("La edad de Gus es " + gus.getEdad());
        gus.setEdad(10);
        pepe.setEdad(20);
        System.out.println("La edad de Gus es " + gus.getEdad());
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso");
        double peso;
        peso = entrada.nextDouble();
        gus.setPeso(peso);
        System.out.println("El peso de Gus es "+gus.getPeso());
        gus.setTasaCrecimientoPorcentual(0.02);
        gus.crecer();
        System.out.println("Lueo de crecer ");
        System.out.println("El peso de Gus es "+gus.getPeso());
        System.out.println("La edad de Gus es " + gus.getEdad());
        System.out.println("Gus es adulto? "+gus.esAdulto());
        
        Veterinario veterinario = new Veterinario(); 
        String diagnostico = veterinario.diagnosticar(gus); //invocar
        System.out.println(diagnostico);

    }

}
