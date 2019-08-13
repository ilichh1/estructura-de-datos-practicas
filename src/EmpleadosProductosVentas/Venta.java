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
public class Venta {
    private int id;
    private Producto producto;
    private Vendedor vendedor;
    
    public Venta() {
        id = -1;
        producto = null;
        vendedor = null;
    }
    
    public Venta(int i, Producto p, Vendedor v) {
        id = i;
        producto = p;
        vendedor = v;
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
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
