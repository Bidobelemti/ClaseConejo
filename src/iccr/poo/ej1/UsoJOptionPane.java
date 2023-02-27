/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iccr.poo.ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author LabP41010
 */
public class UsoJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog
        //JOptionPane.showInputDialog(args)
        int opcionSeleccionada = JOptionPane.showConfirmDialog(null,
                "¿Desea ingresar un número?", "Pregunta",
                 JOptionPane.YES_NO_OPTION);

        if (opcionSeleccionada == 0) {
            /* Crear un cuadro de dialogo de entrada para que el usuario
            ingrese el número y guardarlo en una variable adecuada */

            String entradaUsuario = JOptionPane.showInputDialog("Introduzca un número:");
            int numero = Integer.parseInt(entradaUsuario);

            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero es par",
                         "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }

            if (numero % 2 != 0) {
                JOptionPane.showMessageDialog(null, "El numero es impar",
                         "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
    
}
