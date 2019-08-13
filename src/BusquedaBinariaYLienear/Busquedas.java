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
public class Busquedas {
    // BUSQUEDAS SECUENCIALES
    public static int busquedaSecuencial(Alumno[] alumnos, String nombre) {
        for (int idx = 0; idx < alumnos.length; idx++) {
            Alumno alumno = alumnos[idx];
            if (alumno.getNombre().equalsIgnoreCase(nombre))
                return idx;
        }
        return -1;
    }
    
    public static int busquedaSecuencial(Alumno[] alumnos, int codigo) {
        for (int idx = 0; idx < alumnos.length; idx++) {
            Alumno alumno = alumnos[idx];
            if (alumno.getCodigo() == codigo)
                return idx;
        }
        return -1;
    }
    
    // BUSQUEDAS BINARIAS
    public static int busquedaBinariaPorNombre(Alumno[] arreglo, int first, int last, String nombre) {
        if (last >= first) {
            int mid = first + (last - first) / 2;

            if (arreglo[mid].getNombre().equalsIgnoreCase(nombre))
                return mid;

            if (arreglo[mid].getNameNumericValue() > Helpers.stringToNumber(nombre))
                return busquedaBinariaPorNombre(arreglo, first, mid - 1, nombre);

            return busquedaBinariaPorNombre(arreglo, mid + 1, last, nombre);
        }

        return -1;
    }
    
    public static int busquedaBinariaPorCodigo(Alumno[] arreglo, int first, int last, int codigo) {
        if (last >= first) {
            int mid = first + (last - first) / 2;

            if (arreglo[mid].getCodigo() == codigo)
                return mid;

            if (arreglo[mid].getCodigo() > codigo)
                return busquedaBinariaPorCodigo(arreglo, first, mid - 1, codigo);

            return busquedaBinariaPorCodigo(arreglo, mid + 1, last, codigo);
        }

        return -1;
    }
    
    
    public static int busquedaBinaria(int arr[], int first, int last, int searchValue) {
        // termination condition
        if (last >= first) {
            int mid = first + (last - first) / 2;

            // if the middle element is our goal element, return its index
            if (arr[mid] == searchValue)
                return mid;

            // if the middle element is bigger than the goal element
            // recursively call the method with narrowed data
            if (arr[mid] > searchValue)
                return busquedaBinaria(arr, first, mid - 1, searchValue);

            // else, recursively call the method with narrowed data
            return busquedaBinaria(arr, mid + 1, last, searchValue);
        }

        return -1;
    }
}
