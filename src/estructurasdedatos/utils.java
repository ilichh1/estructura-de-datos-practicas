/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import java.util.Scanner;

/**
 *
 * @author ilichh1
 */
public class utils {
    private static Scanner KEYBOARD = new Scanner(System.in);
    
    public static String readString() {
        String input = "";
        for(;;) {
            try {
                input = KEYBOARD.nextLine();
                break;
            } catch (Exception ex) {
                System.out.println("El valor que introdujo no puede ser leído.");
            }
        }
        return input;
    }
    
    public static int readInteger() {
        int input = 0;
        
        for(;;) {
            try {
                input = Integer.parseInt(readString());
                break;
            } catch (Exception e) {
                System.out.println("El valor que introdujo no es un número válido.");
            }
        }
        
        return input;
    }
    
    public static double readDouble() {
        double input = 0;
        
        for(;;) {
            try {
                input = Double.parseDouble(readString());
                break;
            } catch (Exception e) {
                System.out.println("El número que introdujo no es un double.");
            }
        }
        
        return input;
    }
    
    public static String printTwoDimensionArray(Object[][] array) {
        String output = "";
        for (Object[] row : array) {
            // ITERAR FILAS
            for (Object column : row) {
                // ITERAR COLUMNA
                output += column.toString() + ", ";
            }
            output += "\n";
        }
        return output;
    }
    
    public static String printTwoDimensionArray(double[][] array) {
        String output = "";
        for (double[] row : array) {
            // ITERAR FILAS
            for (double column : row) {
                // ITERAR COLUMNA
                output += String.valueOf(column) + ", ";
            }
            output += "\n";
        }
        return output;
    }
    
}
