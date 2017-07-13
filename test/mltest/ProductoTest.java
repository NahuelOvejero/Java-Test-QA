/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mltest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ProductoTest {
    
    public ProductoTest() {
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "pedro";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
                
    }

    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        float precio = 6.5F;
        Producto instance = new Producto();
        instance.setPrecio(precio);
        assertEquals(precio, instance.getPrecio(),0);
    }

    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 22;
        Producto instance = new Producto();
        instance.setStock(stock);
        assertEquals(stock, instance.getStock());
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto("cepillo", 10, 10);
        String expResult = "cepillo";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = new Producto("cepillo", 10, 10);
        float expResult = 10F;
        float result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Producto instance = new Producto("cepillo", 10, 10);
        int expResult = 10;
        int result = instance.getStock();
        assertEquals(expResult, result);
    }
    
}
