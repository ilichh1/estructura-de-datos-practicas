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
public class Vendedor {
    
    private int id;
    private String nombre;
    private String correo;
    private int edad;
    
    public Vendedor() {
        id = -1;
        nombre = "";
        correo = "";
        edad = -1;
    }
    
    public Vendedor(int i, String n, String c, int e) {
        id = i;
        nombre = n;
        correo = c;
        edad = e;
    }
    
    @Override
    public String toString() {
        return nombre;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
