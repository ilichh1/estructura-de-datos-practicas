/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistorialColas;

import pilas.*;
import java.util.ArrayList;

/**
 *
 * @author ilichh1
 */
public class Pila<T> {
    private Nodo<T> primerNodo;
    private Nodo<T> ultimoNodo;
    protected int largo = 0;
    
    public Pila() {
        primerNodo = null;
        ultimoNodo = null;
        System.out.println("Pila vacia creada");
    }
    
    public void apilar(T v) {
        Nodo nuevoNodo = new Nodo(v);
        largo++;
        if (pilaVacia()) {
            primerNodo = nuevoNodo;
            primerNodo.siguiente = primerNodo;
            // primerNodo.anterior = primerNodo;
            ultimoNodo = primerNodo;
            return;
        }
        nuevoNodo.anterior = ultimoNodo;
        // nuevoNodo.siguiente = primerNodo;
        // primerNodo.anterior = nuevoNodo;
        ultimoNodo.siguiente = nuevoNodo;
        ultimoNodo = nuevoNodo;
    }
    
    public T desapilar() {
        if(pilaVacia()) {
            System.out.println("La pila esta vacía.");
            return null;
        }
        Nodo<T> nodoDesapilado = ultimoNodo;
        if (largo == 1) {
            ultimoNodo = null;
            primerNodo = null;
            largo = 0;
            return nodoDesapilado.valor;
        }
        Nodo<T> penultimoNodo = ultimoNodo.anterior;
        ultimoNodo = penultimoNodo;
        ultimoNodo.siguiente = null;
        largo--;
        return nodoDesapilado.valor;
    }
    
    public T consultar(int index) {
        if (index >= largo || index < 0) {
            System.out.println("El inidice esta fuera del rango de la pila.");
            return null;
        }
        int indiceActual = 0;
        Nodo<T> nodoActual = primerNodo;
        while (indiceActual != index && nodoActual != null) {
            nodoActual = nodoActual.siguiente;
            indiceActual++;
        }
        return nodoActual.valor;
    }
    
    private void vaciar() {
        primerNodo = null;
        ultimoNodo = null;
        largo = 0;
    }
   
    
    public void eliminar(int index) {
        if (index == 0) {
            Nodo nodoActual = primerNodo;
            Pila tmpPila = Pila.crearPilaTemporal(primerNodo.siguiente);
            primerNodo = tmpPila.primerNodo;
            largo--;
            return;
        }
        
        Nodo nodoActual = primerNodo;
        int indiceActual = 0;
        while(indiceActual != index) {
            nodoActual = nodoActual.siguiente;
            indiceActual++;
        }
        if (nodoActual.siguiente == null || nodoActual == null) {
            this.desapilar();
            largo--;
            return;
        }
        largo--;
        Nodo nuevoSiguiente = nodoActual.siguiente;
        nodoActual.anterior.siguiente = nuevoSiguiente;
    }
    
    private static Pila crearPilaTemporal(Nodo nodoInicio) {
        Pila pilaTemporal = new Pila<>();
        Nodo ultimoNodo = nodoInicio;
        while (ultimoNodo.siguiente != null) {
            ultimoNodo = ultimoNodo.siguiente;
        }
        pilaTemporal.ultimoNodo = ultimoNodo;
        pilaTemporal.primerNodo = nodoInicio;
        return pilaTemporal;
    }
    
    public ArrayList<T> toArrayList() {
        ArrayList<T> listaValores = new ArrayList<>();
        if (largo == 0) {
            return listaValores;
        }
        if (largo == 1) {
            listaValores.add(primerNodo.valor);
            return listaValores;
        }
        Nodo<T> nodoRecorrido = primerNodo;
        while(nodoRecorrido != null) {
            listaValores.add(nodoRecorrido.valor);
            nodoRecorrido = nodoRecorrido.siguiente;
        }
        return listaValores;
    }
    
    public boolean pilaVacia() {
        return primerNodo == null;
    }
    
    public int getLargo() {
        return largo;
    }
}

class Nodo<T> {
    public Nodo siguiente;
    public Nodo anterior;
    public T valor;
    
    public Nodo(T v) {
        valor = v;
    }
    
    public Nodo(Nodo a, T v, Nodo s) {
        valor = v;
        anterior = a;
        siguiente = s;
    }
}