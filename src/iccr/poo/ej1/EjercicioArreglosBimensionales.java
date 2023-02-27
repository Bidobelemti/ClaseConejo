/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iccr.poo.ej1;

/**
 *
 * @author LabP41010
 */
public class EjercicioArreglosBimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double calificaciones[][];
        calificaciones = new double[10][2];
        //filas con diferentes numeros de columnas
        calificaciones[0] = new double[2];
        calificaciones[1] = new double[3];
        calificaciones[2] = new double[2];
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {

            for (int j = 0; j < calificaciones[i].length; j++) {
                calificaciones[i][j] = Math.random() * 20;
                suma = suma + Math.random() * 20;
            }
        }

        for (double fila[] : calificaciones) {
            
            for (double e : fila) {
                System.out.printf("%.2f\t\t", e);
            }
            System.out.println("");
        }
        //poner letros estudiantes 1,2,3,4, etc
        //colocar "nota 1", "nota 2" y "nota 3"
        // colocar el promedio de filas y de columnas 
        //TAREA DE LA CLASE CONEJO
        //identificar el conejo de MENOR EDAD
        //identificar el conejo que PESA MAS
        //PROMEDIO tasa de crecimiento

    }

}
