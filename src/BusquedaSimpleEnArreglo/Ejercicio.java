/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaSimpleEnArreglo;

import java.util.Scanner;

/**
 *
 * @author ilichh1
 */
public class Ejercicio {
    
    public static final Scanner TECLADO = new Scanner(System.in);
    
    public static void main(String[] argumentos) {
        int elementos = 7;
        System.out.println("Ingrese siete (7) números: ");
        double[] arreglo = preguntarNumeros(elementos);
        System.out.print("Ingrese un número a buscar: ");
        double busqueda = Double.parseDouble(TECLADO.nextLine());
        ResultadoBusqueda resultado = buscarPromediarYDeterminarRango(arreglo, busqueda);
        
        if (resultado.incidendias > 0) {
            System.out.println("El número se encontró en: "+resultado.incidendias+" elemento(s).");
            // Resultados de mayores y menores
            if (resultado.numeroMenor)
                System.out.println("El valor de búsqueda ES el menor.");
            if (resultado.numeroMayor)
                System.out.println("El número a buscar ES el mayor dentro del arreglo");
            if (!resultado.numeroMenor && !resultado.numeroMayor)
                System.out.println("El número no es NI MENOR NI MAYOR dentro del arreglo");
        } else {
            System.out.println("El número NO SE ENCONTRÓ en el arreglo.");
        }
        
        System.out.println("Promedio total del arreglo: "+resultado.promedio);
    }
    
    
    public static double[] preguntarNumeros(int elementosDelArreglo) {
        double[] nuevoArreglo = new double[elementosDelArreglo];
        for (int i = 0; i < nuevoArreglo.length; i++) {
            System.out.print("#"+(i+1)+": ");
            nuevoArreglo[i] = Double.parseDouble(TECLADO.nextLine());
        }
        return nuevoArreglo;
    }
    
    public static ResultadoBusqueda buscarPromediarYDeterminarRango(double[] arreglo, double numeroBusqueda) {
        double numeroMenor = 0;
        double numeroMayor = 0;
        double sumaTotal = 0;
        double promedio = 0;
        int incidendias = 0;
        
        for (double d : arreglo) {
            // Si el número esta dentro del arreglo
            if (numeroBusqueda == d)
                incidendias++;
            // Comprar numeros menores y mayores
            if (d < numeroMenor)
                numeroMenor = d;
            if (d > numeroMayor)
                numeroMayor = d;
            
            sumaTotal += d;
        }
        
        promedio = sumaTotal / arreglo.length;
        
        return new ResultadoBusqueda(
                numeroMenor == numeroBusqueda,
                numeroMayor == numeroBusqueda,
                incidendias,
                promedio
        );
    }
    
}

class ResultadoBusqueda {
    public boolean numeroMenor = false;
    public boolean numeroMayor = false;
    public int incidendias = 0;
    public double promedio = 0;
    
    public ResultadoBusqueda(boolean menor, boolean mayor, int in, double pro) {
        numeroMenor = menor;
        numeroMayor = mayor;
        incidendias = in;
        promedio = pro;
    }
}