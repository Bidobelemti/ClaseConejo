/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iccr.poo.ej1;

import Utilidades.OrdenadorPorNombre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author LabP41010
 */
public class TestDeOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> listaDeColores = new ArrayList<>();
        listaDeColores.add("verde");
        listaDeColores.add("azul");
        listaDeColores.add("amarillo");
        listaDeColores.add("beige");
        listaDeColores.add("rosado");

        System.out.println(listaDeColores);

        //ordenar alfabeticamente
        Collections.sort(listaDeColores);
        System.out.println("Lista Ordenada: " + listaDeColores);

        //ordenar de mayor a menor
        ArrayList<Conejo> listaDeConejos = new ArrayList<>();
        listaDeConejos.add(new Conejo("Juan", 2, true));
        listaDeConejos.add(new Conejo("Pepe", 4.5, false));
        listaDeConejos.add(new Conejo("Lola", 3.5, true));
        listaDeConejos.add(new Conejo("Scott", 6, false));
        listaDeConejos.add(new Conejo("Chispa", 1.2, true));

        System.out.println("El conejo que pesa mas es: ");
        System.out.println(Collections.max(listaDeConejos));

        OrdenadorPorNombre ordenadorPorNombre = new OrdenadorPorNombre();
        Collections.sort(listaDeConejos, ordenadorPorNombre);
        for (Conejo C : listaDeConejos) {
            System.out.println(C.toString());
        }
        //diferenciar array list con listas enlazadas
        LinkedList<String> listaDeCiudades = new LinkedList<>();
        listaDeCiudades.add("Quito");
        listaDeCiudades.addFirst("Cuenca");
        listaDeCiudades.addLast("Guayaquil");
        System.out.println(listaDeCiudades);
        Collections.sort(listaDeCiudades);
        System.out.println(listaDeCiudades);
        
        
    }

}
