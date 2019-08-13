/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistorialColas;

/**
 *
 * @author ilichh1
 */
public class Alumno {
    int edad;
    String nombre;
    
    Alumno(String n, int e) {
        edad = e;
        nombre = n;
    }
    
    @Override
    public String toString() {
        return "Alumno: " + nombre + ", Edad: " + edad;
    }
}
