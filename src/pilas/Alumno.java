/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author ilichh1
 */
public class Alumno {
    private int codigo = -1;
    private String nombre = "";
    private double[] calificaciones = new double[] { 0, 0, 0 };
    
    public Alumno() {
        System.out.println("Alumno vacio creado");
    }
    
    public Alumno(int codigo, String nombre, double[] calificaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the calificaciones
     */
    public double[] getCalificaciones() {
        return calificaciones;
    }
    
    public double getCalificacion(int index) {
        return calificaciones[index];
    }
    
    public double getPromedio() {
        double total = 0;
        for (double cal : calificaciones) {
           total += cal;
        }
        return total / calificaciones.length;
    }

    /**
     * @param calificaciones the calificaciones to set
     */
    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    @Override
    public String toString() {
        return codigo + ", " + nombre + ", " + getPromedio();
    }
}
