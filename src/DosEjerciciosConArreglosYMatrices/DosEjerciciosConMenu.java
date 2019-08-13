/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DosEjerciciosConArreglosYMatrices;

import static estructurasdedatos.utils.*;

/**
 *
 * @author ilichh1
 */
public class DosEjerciciosConMenu {
    
    public static void imprimirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("(Elegir una opción)");
        System.out.println("1.- Seis Números");
        System.out.println("2.- Negativos y positivos en una matriz");
        System.out.print("Su respuesta: ");
        
        switch(readInteger()) {
            case 1:
                seisNumerosMayorYPromedio();
            break;
            case 2:
                negativosYPositivosEnMatriz();
            break;
            default:
                System.out.println("La opción seleccionada no es válida.");
        }
    }
    
    public static void seisNumerosMayorYPromedio() {
        System.out.print("Ingrese seis numeros separados por comas: ");
        String[] stringsArray = readString().split(",");
        
        if (stringsArray.length != 6) {
            System.out.println("No introdujo 6 números.");
            return;
        }
        
        double totalAcumulado = 0;
        double numeroMayor = 0;
        
        for (String numeroString : stringsArray) {
            double numeroActual = Double.parseDouble(numeroString);
            totalAcumulado += numeroActual;
            
            if (numeroActual > numeroMayor) {
                numeroMayor = numeroActual;
            }
        }
        
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El promedio es: " + (totalAcumulado/stringsArray.length));
    }
    
    public static void negativosYPositivosEnMatriz() {
        int[] matrizSize = new int[] { 3, 4 };
        int totalPositions = matrizSize[0] * matrizSize[1];
        int[] positivePositions = new int[] { 0, 0 };
        int[] negativePositions = new int[] { matrizSize[0] - 1, matrizSize[1] - 1 };
        double[][] matriz = new double[matrizSize[0]][matrizSize[1]];
        
        for (int i = 0; i < totalPositions; i++) {
            System.out.print("Número #"+(i+1)+": ");
            double numberToBeInserted = readDouble();
            if (numberToBeInserted < 0) {
                // INSERTAR NEGATIVO
                matriz[negativePositions[0]][negativePositions[1]] = numberToBeInserted;
                
                if (negativePositions[0] == 0) {
                    negativePositions[0] = matrizSize[0] - 1;
                    negativePositions[1]--;
                    continue;
                }
                
                negativePositions[0]--;
            } else {
                // INSERTAR POSITIVO
                matriz[positivePositions[0]][positivePositions[1]] = numberToBeInserted;
                
                if (positivePositions[0] == matriz.length - 1) {
                    positivePositions[0] = 0;
                    positivePositions[1]++;
                    continue;
                }
                
                positivePositions[0]++;
            }
        }
        
        System.out.println("\n==== Matriz ====");
        System.out.println(printTwoDimensionArray(matriz));
    }
    
}
