/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistorialColas;

import java.util.ArrayList;

/**
 *
 * @author ilichh1
 */
public class Cola<T> {
    int largo = 0;
    NodoCola<T> primero = null;
    NodoCola<T> ultimo = null;
    // private final ArrayList<RegistroHistorial> historial = new ArrayList<>();
    private final Pila<RegistroHistorial> historial = new Pila<>();
    
    public void agregar(T valor) {
        largo++;
        NodoCola<T> nuevoNodo = new NodoCola<>();
        nuevoNodo.valor = valor;
        registrarHistorial("Creado", valor);
        if (this.primero == null) {
            this.primero = nuevoNodo;
            this.ultimo = nuevoNodo;
            this.primero.siguiente = this.ultimo;
            this.ultimo.anterior = this.primero;
            return;
        }
        NodoCola viejoUltimo = ultimo;
        nuevoNodo.anterior = viejoUltimo;
        viejoUltimo.siguiente = nuevoNodo;
        ultimo = nuevoNodo;
    }
    
    public T sacar() {
        if (primero == null) {
            return null;
        }
        if (largo == 1) {
            T valor = primero.valor;
            largo = 0;
            primero = null;
            largo--;
            registrarHistorial("Eliminado", valor);
            return valor;
        }
        T valor = primero.valor;
        /*
        T valor = ultimo.valor;
        Nodo penultimo = ultimo.anterior;
        ultimo = penultimo;
        ultimo.siguiente = null;
        largo--;
        registrarHistorial("Eliminado", valor);
        */
        NodoCola segundo = primero.siguiente;
        primero = segundo;
        primero.anterior = null;
        largo--;
        registrarHistorial("Eliminado", valor);
        return valor;
    }
    
    private void registrarHistorial(String tipo, T valor) {
        this.historial.apilar(new RegistroHistorial(tipo, valor));
    }
    
    public ArrayList<RegistroHistorial> getHistorial() {
        return historial.toArrayList();
    }
    
    public ArrayList<T> toArrayList() {
        ArrayList<T> lista = new ArrayList<>();
        NodoCola<T> nodoActual = this.primero;
        while (nodoActual != null) {
            lista.add(nodoActual.valor);
            nodoActual = nodoActual.siguiente;
        }
        return lista;
    }
}

class NodoCola<T> {
    NodoCola anterior = null;
    NodoCola siguiente = null;
    T valor;
}

class RegistroHistorial<T> {
    private String tipo;
    private T valor;
    
    RegistroHistorial(String t, T v) {
        tipo = t;
        valor = v;
    }
    
    @Override
    public String toString() {
        return tipo + ":  "+ valor.toString();
    }
}