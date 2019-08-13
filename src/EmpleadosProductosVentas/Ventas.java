/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpleadosProductosVentas;

import java.util.ArrayList;

/**
 *
 * @author ilichh1
 */
public class Ventas {
    public static final ArrayList<Vendedor> VENDEDORES = new ArrayList<>();
    public static final ArrayList<Producto> PRODUCTOS = new ArrayList<>();
    public static final ListaVentas VENTAS = new ListaVentas();
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Datos de los vendedores
        VENDEDORES.add(new Vendedor(1, "Ilich Arredondo", "ilich@mail.com", 31));
        VENDEDORES.add(new Vendedor(2, "Francisco G", "frang@mail.com", 21));
        // Datos de los productos
        PRODUCTOS.add(new Producto(1, "Galletas Oreo", "Galletas veganas rellenas de crema", 18.55));
        PRODUCTOS.add(new Producto(1, "Galletas Maria", "Galletas rendidoras para toda la familia", 16));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(
                        VENDEDORES,
                        PRODUCTOS,
                        VENTAS
                ).setVisible(true);
            }
        });
    }
    
}
