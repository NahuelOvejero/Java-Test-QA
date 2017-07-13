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
public class VendedorTest {
    
    public VendedorTest() {
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "juancho";
        Vendedor instance = new Vendedor();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    @Test
    public void testSetMonto_vendido() {
        System.out.println("setMonto_vendido");
        float monto_vendido = 2F;
        Vendedor instance = new Vendedor();
        instance.setMonto_vendido(monto_vendido);
        assertEquals(monto_vendido,instance.getMonto_vendido(),0);
    }

    @Test
    public void testSetPuntaje() {
        System.out.println("setPuntaje");
        float puntaje = 2.2F;
        Vendedor instance = new Vendedor();
        instance.setPuntaje(puntaje);
        assertEquals(puntaje,instance.getPuntaje(),0);
    }

    @Test
    public void testSetNro_ventas() {
        System.out.println("setNro_ventas");
        int nro_ventas = 20;
        Vendedor instance = new Vendedor();
        instance.setNro_ventas(nro_ventas);
        assertEquals(nro_ventas,instance.getNro_ventas());
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Vendedor instance = new Vendedor("pedro", 10, 10, 10);
        String expResult = "pedro";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMonto_vendido() {
        System.out.println("getMonto_vendido");
        Vendedor instance = new Vendedor("pedro", 10, 10, 10);
        float expResult = 10F;
        float result = instance.getMonto_vendido();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetPuntaje() {
        System.out.println("getPuntaje");
        Vendedor instance = new Vendedor("pedro", 10, 10, 10);
        float expResult = 10F;
        float result = instance.getPuntaje();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetNro_ventas() {
        System.out.println("getNro_ventas");
        Vendedor instance = new Vendedor("pedro", 10, 10, 10);
        int expResult = 10;
        int result = instance.getNro_ventas();
        assertEquals(expResult, result);
    }
    
}
