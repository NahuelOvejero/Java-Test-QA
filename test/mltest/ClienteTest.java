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
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente("inicial", "apellido", 0, 0, 0);
        instance.setNombre("resultado");
        assertEquals("resultado", instance.getNombre());
    }

    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Cliente instance = new Cliente("nombre", "inicial", 0, 0, 0);
        instance.setApellido("cambio");
        assertEquals("cambio", instance.getApellido());
    }

    @Test
    public void testSetNro_compras() {
        System.out.println("setNro_compras");
        int nro_compras = 0;
        Cliente instance = new Cliente("nombre","apellido",10,10,10);
        instance.setNro_compras(1);
        assertEquals(1, instance.getNro_compras());
    }

    @Test
    public void testSetBonificacion() {
        System.out.println("setBonificacion");
        float bonificacion = 0.0F;
        Cliente instance = new Cliente("nombre","apellido",10,10,10);
        instance.setBonificacion(0);
        assertEquals(0, (int)instance.getBonificacion());
    }

    @Test
    public void testSetMonto_total() {
        System.out.println("setMonto_total");
        float monto_total = 0.0F;
        Cliente instance = new Cliente("nombre","apellido",10,10,10);
        instance.setMonto_total(0);
        assertEquals(0, (int)instance.getMonto_total());
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente("nombre","apellido",10,10,10);
        String expResult = "nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);        
    }

    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Cliente instance = new Cliente("nombre","apellido",10,10,10);
        String expResult = "apellido";
        String result = instance.getApellido();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNro_compras() {
        System.out.println("getNro_compras");
        Cliente instance = new Cliente("nombre","apellido",10,10,10);
        int expResult = 10;
        int result = instance.getNro_compras();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBonificacion() {
        System.out.println("getBonificacion");
        Cliente instance = new Cliente("nombre","apellido",10,10,10);
        float expResult = 10F;
        float result = instance.getBonificacion();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetMonto_total() {
        System.out.println("getMonto_total");
        Cliente instance = new Cliente("nombre","apellido",10,10,10);
        float expResult = 10F;
        float result = instance.getMonto_total();
        assertEquals(expResult, result, 0.0);
    }
    
}
