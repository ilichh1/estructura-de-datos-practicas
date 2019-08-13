/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaBinariaYLienear;

import static BusquedaBinariaYLienear.Helpers.inicializarAlumnos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ilichh1
 */
public class Busqueda {
    
    public static final ArrayList<Alumno> ALUMNOS = new ArrayList<>();
    
    public static void main(String[] argumentos) {
        Busqueda busquedaObject = new Busqueda();
        
        do {
            busquedaObject.imprimirMenu();;
        } while (busquedaObject.continuarEjecucion());
        
    }
    
    public Busqueda() {
        ALUMNOS.addAll(Arrays.asList(inicializarAlumnos(7)));
    }
    
    public void imprimirMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1. Registrar alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Busqueda secuencial");
        System.out.println("4. Busqueda binaria");
        // System.out.println("5. Ordenar");
        System.out.print("*) Su elección: ");
        
        int opcion = Helpers.TECLADO.nextInt();
        onMenuOption(opcion);
    }
    
    public boolean continuarEjecucion() {
        System.out.print("¿Desea continuar? (s/n): ");
        char respuesta = Helpers.TECLADO.next().toLowerCase().charAt(0);
        return respuesta != 'n';
    }
    
    private void onMenuOption(int option) {
        
        switch (option) {
            case 1:
                System.out.println("==== REGISTRAR ALUMNO ====");
                ALUMNOS.add(preguntarDatosAlumno());
            break;
            case 2:
                mostrarAlumnos();
            break;
            case 3:
                busquedaSecuencial();
            break;
            case 4:
                busquedaBinaria();
            break;
            case 5:
                // throw new AssertionError("NO SOPORTADO");
                ordenar();
            break;
            default:
                System.out.println("OPCIÓN INVALIDA.");
        }
        
    }
    
    public void mostrarAlumnos() {
        System.out.println("=== ALUMNOS ====");
        for (Alumno alumno : ALUMNOS) {
            System.out.println(alumno);
        }
    }
    
    public void busquedaSecuencial() {
        System.out.println("==== Opciones ====");
        System.out.println("1. Buscar por nombre");
        System.out.println("2. Buscar por código");
        System.out.print("*) Respuesta: ");
        int opcion = Helpers.TECLADO.nextInt();
        
        if (opcion == 1) {
            busquedaSecuencialPorNombre();
        } else {
            busquedaSecuencialPorCodigo();
        }
    }
    
    public void busquedaSecuencialPorNombre() {
        System.out.println("Nombre del alumno: ");
        String nombre = "";
        try {
            nombre = Helpers.TECLADO2.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("BUSCANDO: " + nombre);
        Alumno[] alumnosABuscar = ALUMNOS.toArray(new Alumno[ALUMNOS.size() - 1]);
        int resultIdx = Busquedas.busquedaSecuencial(alumnosABuscar, nombre);
        imprimirResultadoBusqueda(resultIdx, alumnosABuscar);
    }
    
    public void busquedaSecuencialPorCodigo() {
        System.out.println("Codigo: ");
        int codigo = Helpers.TECLADO.nextInt();
        Alumno[] alumnosABuscar = ALUMNOS.toArray(new Alumno[ALUMNOS.size() - 1]);
        int resultIdx = Busquedas.busquedaSecuencial(alumnosABuscar, codigo);
        imprimirResultadoBusqueda(resultIdx, alumnosABuscar);
    }
    
    public void imprimirResultadoBusqueda(int idx, Alumno[] arr) {
        if (idx == -1) {
            System.out.println("NO SE ENCONTRÓ NINGUN ALUMNO CON ESE VALOR DE BUSQUEDA");
            return;
        }
        System.out.println("==== RESULTADO DE BUSQUEDA ===");
        System.out.println(arr[idx]);
    }
    
    public void busquedaBinaria() {
        System.out.println("==== Opciones ====");
        System.out.println("1. Buscar por nombre");
        System.out.println("2. Buscar por código");
        System.out.print("*) Respuesta: ");
        int opcion = Helpers.TECLADO.nextInt();
        
        if (opcion == 1) {
            busquedaBinariaPorNombre();
        } else {
            busquedaBinariaPorCodigo();
        }
    }
    
    public void busquedaBinariaPorNombre() {
        System.out.println("Nombre del alumno: ");
        String nombre = "";
        try {
            nombre = Helpers.TECLADO2.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("BUSCANDO: " + nombre);
        Alumno[] alumnosOrdenados = Ordenamiento
                .ordenarPorNombre(ALUMNOS.toArray(new Alumno[ALUMNOS.size()-1]));
        int resultIdx = Busquedas.busquedaBinariaPorNombre(alumnosOrdenados, 0, alumnosOrdenados.length - 1, nombre);
        if (resultIdx == -1) {
            System.out.println("NO SE ENCONTRÓ NINGUN ALUMNO CON ESE VALOR DE BUSQUEDA");
            return;
        }
        System.out.println("==== RESULTADO DE BUSQUEDA ===");
        System.out.println(alumnosOrdenados[resultIdx]);
    }
    
    public void busquedaBinariaPorCodigo() {
        System.out.println("Codigo: ");
        int codigo = Helpers.TECLADO.nextInt();
        
        Alumno[] alumnosOrdenados = Ordenamiento
                .ordenarPorCodigo(ALUMNOS.toArray(new Alumno[ALUMNOS.size()-1]));
        int resultIdx = Busquedas.busquedaBinariaPorCodigo(alumnosOrdenados, 0, alumnosOrdenados.length - 1, codigo);
        if (resultIdx == -1) {
            System.out.println("NO SE ENCONTRÓ NINGUN ALUMNO CON ESE VALOR DE BUSQUEDA");
            return;
        }
        System.out.println("==== RESULTADO DE BUSQUEDA ===");
        System.out.println(alumnosOrdenados[resultIdx]);
    }
    
    public Alumno preguntarDatosAlumno() {
        System.out.println("Codigo del nuevo alumno: ");
        int codigo = Helpers.TECLADO.nextInt();
        System.out.println("Nombre del nuevo alumno: ");
        String nombre = "SIN NOMBRE";
        try {
            nombre = Helpers.TECLADO2.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Edad del nuevo alumno: ");
        int edad = Helpers.TECLADO.nextInt();
        return new Alumno(codigo, nombre, edad);
    }
    
    // ORDENAMIENTOS
    public void ordenar() {
        System.out.println("1. Ordenar por nombre");
        System.out.println("2. Ordenar por codigo");
        System.out.print("*) Su respuesta: ");
        int respuesta = Helpers.TECLADO.nextInt();
        
        if (respuesta == 1) {
            ordenarPorNombre();
        } else {
            ordenarPorCodigo();
        }
    }
    
    public void ordenarPorNombre() {
        System.out.println("==== Ordenados por nombre ====");
        Alumno[] ordenados = Ordenamiento
                .ordenarPorNombre(ALUMNOS.toArray(new Alumno[ALUMNOS.size() - 1]));
        Helpers.imprimirArregloDeAlumnos(ordenados);
    }
    
    public void ordenarPorCodigo() {
        System.out.println("==== Ordenados por codigo ====");
        Alumno[] ordenados = Ordenamiento
                .ordenarPorCodigo(ALUMNOS.toArray(new Alumno[ALUMNOS.size() - 1]));
        Helpers.imprimirArregloDeAlumnos(ordenados);
    }
    
}
