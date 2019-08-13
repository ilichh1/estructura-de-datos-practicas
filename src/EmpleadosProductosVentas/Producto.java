/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpleadosProductosVentas;

/**
 *
 * @author ilichh1
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    
    public Producto() {
        codigo = -1;
        nombre = null;
        descripcion = null;
        precio = -1;
    }
    
    public Producto(int c, String n, String d, double p) {
        codigo = c;
        nombre = n;
        descripcion = d;
        precio = p;
    }
    
    @Override
    public String toString() {
        return this.nombre;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
