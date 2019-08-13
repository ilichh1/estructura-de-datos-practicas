/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaBinariaYLienear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author ilichh1
 */
public class Helpers {
    public static final Scanner TECLADO = new Scanner(System.in);
    public static final BufferedReader TECLADO2 = new BufferedReader(new InputStreamReader(System.in));
    
    private static String[] NOMBRES = new String[] {
        "Juan",
        "Armando",
        "Gilberto",
        "Roberto",
        "Alberto",
        "Gildarts",
        "Lee",
        "Francisco",
        "José",
        "Jesus",
    };
    private static String[] APELLIDOS = new String[] {
        "Casarez",
        "Perez",
        "Suarez",
        "Sanchez",
        "Ramirez",
        "Gonzalez",
        "Godinez",
        "Arizmendi",
        "Arredondo",
        "Herrera",
        "Coss y Leon",
        "Windsor"
    };
    
    public static void imprimirArregloDeAlumnos(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
    public static Alumno[] inicializarAlumnos(int cantidad) {
        Alumno[] alumnosGenerados = new Alumno[cantidad];
        for (int i = 0; i < alumnosGenerados.length; i++) {
            alumnosGenerados[i] = generarAlumnoAleatorio();
        }
        return alumnosGenerados;
    }
    
    public static Alumno generarAlumnoAleatorio() {
        int nom1Idx = (int)(Math.random() * NOMBRES.length - 0);
        int ap1Idx = (int)(Math.random() * APELLIDOS.length - 0);
        int nom2Idx = (int)(Math.random() * NOMBRES.length - 0);
        int ap2Idx = (int)(Math.random() * APELLIDOS.length - 0);
        
        int codigo = 0;
        String nombres = "";
        String apellidos = "";
        int edad = (int)(Math.random() * 40 + 18);
        
        if (NOMBRES[nom1Idx].equals(NOMBRES[nom2Idx])) {
            nombres = NOMBRES[nom1Idx];
        } else {
            nombres = NOMBRES[nom1Idx] + " " + NOMBRES[nom2Idx];
        }
        
        if (APELLIDOS[ap1Idx].equals(APELLIDOS[ap2Idx])) {
            apellidos = APELLIDOS[ap1Idx];
        } else {
            apellidos += APELLIDOS[ap1Idx] + " " + APELLIDOS[ap2Idx];
        }
        
        String nombreGenerado = nombres + "  " + apellidos;
        codigo = stringToNumber(nombreGenerado);
        codigo += (int)(Math.random() * codigo);
        return new Alumno(codigo, nombres, edad);
    }

    public static int stringValorNumerico(String cadena) {
        int valorTotal = stringToNumber(cadena);
        int lastAdded = 0;
        for (String palabra : cadena.split(" ")) {
            
            int valorLetra = 0;
            int lastAddedLetra = 0;
            
            for (char letra : palabra.toCharArray()) {
                if (lastAddedLetra > accentedLetterToNormalLetter(letra)) {
                    valorLetra += letra;
                    lastAddedLetra = letra;
                } else break;
            }
            valorTotal -= valorLetra;
        }
        return valorTotal;
    }
    
    public static int stringToNumber(String cadena) {
        int value = 0;
        for (char c : cadena.toCharArray()) {
            value += c;
        }
        return value;
    }
    
    public static char accentedLetterToNormalLetter(char letter) {
        switch (letter) {
            case 'á': return 'a';
            case 'Á': return 'A';
            case 'é': return 'e';
            case 'É': return 'E';
            case 'í': return 'i';
            case 'Í': return 'I';
            case 'ó': return 'o';
            case 'Ó': return 'O';
            case 'ú': return 'u';
            case 'Ú': return 'U';
            default: return letter;
        }
    }

}
