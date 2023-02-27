/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import iccr.poo.ej1.Conejo;
import java.util.Comparator;

/**
 *
 * @author LabP41011
 */
public class OrdenadorPorNombre implements Comparator<Conejo> {

    @Override
    public int compare(Conejo o1, Conejo o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }

    
    
}
