/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TresEjerciciosRecursividad;

import static estructurasdedatos.utils.*;

/**
 *
 * @author ilichh1
 */
public class TresRecursividad {
    
    public static void imprimirMenu() {
        System.out.println("==== MENU ====");
        System.out.println("(Eliga una opción)\n");
        System.out.println("1.- Donación obligatoria");
        System.out.println("2.- Multiplicación \"especialita\"");
        System.out.println("3.- Torres de Hanoi");
        System.out.print("Su respuesta: ");
        int response = readInteger();
        
        switch(response) {
            case 1:
                pedirDonacionObligatoria();
            break;
            case 2:
                System.out.print("Numero a multiplicar: ");
                double numero = readDouble();
                System.out.print("Multiplicador (enteros únicamente): ");
                int multiplicador = readInteger();
                double resultado = multiplicarConSumas(numero, multiplicador);
                System.out.println("Su resultado es: " + resultado);
            break;
            case 3:
                System.out.print("¿Cuantos discos tienen las torres?: ");
                int nDiscos = readInteger();
                torresDeHannoi(nDiscos, "Torre 1", "Torre 2", "Torre 3");
            break;
            default:
                System.out.println("La opción que seleccionó no existe.");
        }
    }
    
    public static void pedirDonacionObligatoria() {
        System.out.print("¿Usted desea donar? (S/N): ");
        char response = readString().toUpperCase().charAt(0);
        
        if (response == 'S') {
            System.out.println("¡¡¡ Gracias por su donación, vuelva pronto !!!");
        } else {
            System.out.println("Tiene que donar al todo poderoso, no hay otra opción.");
            pedirDonacionObligatoria();
        }
    }
    
    public static double multiplicarConSumas(double numero, int multiplicador) {
        if (multiplicador == 1) {
            return numero;
        } else {
            return numero += multiplicarConSumas(numero, multiplicador - 1);
        }
    }
    
    public static void torresDeHannoi(
            int numeroDeDiscos,
            String torreActual,
            String torreDestino,
            String torreTemporal) {
        if (numeroDeDiscos == 1) {
            System.out.println(
                    "Mover " + numeroDeDiscos + "disco desde la "
                    + torreActual + " a la torre "
                    + torreDestino);
        } else {
            torresDeHannoi(numeroDeDiscos - 1, torreActual, torreTemporal, torreDestino);
            torresDeHannoi(1, torreActual, torreDestino, torreTemporal);
            torresDeHannoi(numeroDeDiscos - 1, torreTemporal, torreDestino, torreActual);
        }
    }
    
}
