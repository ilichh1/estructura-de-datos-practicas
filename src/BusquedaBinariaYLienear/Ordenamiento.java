/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaBinariaYLienear;

/**
 *
 * @author ilichh1
 */
public class Ordenamiento {
    
    // ORDENAR POR CODIGO
    public static Alumno[] ordenarPorCodigo(Alumno[] arrayAOrdenar) {
        Alumno[] nuevosAlumnos = arrayAOrdenar.clone();
        quickSort(nuevosAlumnos, 0, nuevosAlumnos.length - 1, false);
        return nuevosAlumnos;
    }
    
    // ORDENAR POR NOMBRE
    public static Alumno[] ordenarPorNombre(Alumno[] arrayAOrdenar) {
        Alumno[] nuevosAlumnos = arrayAOrdenar.clone();
        quickSort(nuevosAlumnos, 0, nuevosAlumnos.length - 1, true);
        return nuevosAlumnos;
    }
    
    public static void quickSort(Alumno[] alumnos, int begin, int end, boolean orderByName) {
        if (begin < end) {
            int partitionIndex = -1;
            if (!orderByName) {
                partitionIndex = partitionByCode(alumnos, begin, end);
            } else {
                partitionIndex = partitionByName(alumnos, begin, end);
            }
            // Recursive call
            quickSort(alumnos, begin, partitionIndex - 1, orderByName);
            quickSort(alumnos, partitionIndex + 1, end, orderByName);
        }
    }
    
    private static int partitionByCode(Alumno[] alumnos, int begin, int end) {
        int pivot = alumnos[end].getCodigo();
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (alumnos[j].getCodigo() <= pivot) {
                i++;
                Alumno swapTemp = alumnos[i];
                alumnos[i] = alumnos[j];
                alumnos[j] = swapTemp;
            }
        }
        
        Alumno swapTemp = alumnos[i+1];
        alumnos[i+1] = alumnos[end];
        alumnos[end] = swapTemp;
        
        return i+1;
    }
    
    private static int partitionByName(Alumno[] alumnos, int begin, int end) {
        int pivot = alumnos[end].getNameNumericValue();
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (alumnos[j].getNameNumericValue() <= pivot) {
                i++;
                Alumno swapTemp = alumnos[i];
                alumnos[i] = alumnos[j];
                alumnos[j] = swapTemp;
            }
        }
        
        Alumno swapTemp = alumnos[i+1];
        alumnos[i+1] = alumnos[end];
        alumnos[end] = swapTemp;
        
        return i+1;
    }
    
}
