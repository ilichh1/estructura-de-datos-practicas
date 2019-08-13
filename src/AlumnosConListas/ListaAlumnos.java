/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnosConListas;

/**
 *
 * @author ilichh1
 */
public class ListaAlumnos {
    
    private int nodeCount = 0;
    private Nodo inicio = null;
    private Nodo currentNode = null;
    
    public int getSize() {
        return nodeCount;
    }
    
    public void agregar(Alumno alumno) {
        nodeCount++;
        Nodo nuevo = new Nodo(alumno);
        if (listaVacia()) {
            inicio = nuevo;
            return;
        }
        Nodo nodoActual = inicio;
        while (nodoActual.getSiguienteElemento() != null) {
            nodoActual = nodoActual.getSiguienteElemento();
        }
        // Al ultimo nodo, le asignamos el siguiente nodo al inicio como referencia
        nuevo.setSiguienteElemento(inicio);
        nodoActual.setSiguienteElemento(nuevo);
    }    
    
    public Nodo getSiguienteNodo() {
        if (listaVacia()) {
            return null;
        }
        if (currentNode == null) {
            currentNode = inicio;
            return currentNode;
        }
        currentNode = currentNode.getSiguienteElemento();
        return currentNode;
    }
    
    public boolean listaVacia() {
        return inicio == null;
    }
}

class Nodo {
    private Alumno valor;
    private Nodo siguienteElemento;
    
    public Nodo() {}
    public Nodo(Alumno v) {
        valor = v;
    }
    public Nodo(Nodo s, Alumno v) {
        valor = v;
        siguienteElemento = s;
    }

    /**
     * @return the valor
     */
    public Alumno getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Alumno valor) {
        this.valor = valor;
    }

    /**
     * @return the siguienteElemento
     */
    public Nodo getSiguienteElemento() {
        return siguienteElemento;
    }

    /**
     * @param siguienteElemento the siguienteElemento to set
     */
    public void setSiguienteElemento(Nodo siguienteElemento) {
        this.siguienteElemento = siguienteElemento;
    }
}
