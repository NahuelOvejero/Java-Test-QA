/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mltest;
import mltest.ClasesMock.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class VentaTest {
    
    public VentaTest() {
    }

    @Test
    public void testRegistrarVentaSinStock() {
        System.out.println("registrarVenta");
        Cliente cliente = new Cliente("Pedro", "Lopez", 0, 0, 0);
        Producto producto = new Producto("Cajas", 25, 0);
        Vendedor vendedor = new Vendedor("Juancho",0, 0, 0);
        int cantidad = 1;
        Venta instance = new Venta();
        String expResult = "Error al intentar vender 1 Unidades de Cajas Stock Insuficiente (0).";
        String result = instance.registrarVenta(cliente, producto, vendedor, cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        @Test
    public void testRegistrarVentaConStock() {
        System.out.println("registrarVenta");
        mockCliente cliente = new mockCliente();
        mockProducto producto = new mockProducto();
        mockVendedor vendedor = new mockVendedor();
        int cantidad = 1;
        Venta instance = new Venta();
        String expResult = "El producto vendido fue : " + producto.getNombre() + " a $" + producto.getPrecio() + " la unidad." 
              + " Siendo " + cantidad + " unidades, por un precio total de : $" + 10.0
              + ". Comprador : " + cliente.getNombre() + ". Vendedor : " + vendedor.getNombre() 
              + "Teniendo un puntaje de : " + 0.0 + " Paso a tener : " + 99.545456;
        String result = instance.registrarVenta(cliente, producto, vendedor, cantidad);     
        
        assertEquals(1, 1);
        assertEquals(11, cliente.getNro_compras());
        assertEquals(11, vendedor.getNro_ventas());
        assertEquals(99,(int)vendedor.getPuntaje());
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

class mockCliente extends Cliente {

    public mockCliente(){
        this.setNombre("nombre");
        this.setApellido("apellido");
        this.setNro_compras(10);
        this.setMonto_total(10);
        this.setBonificacion(10);
    }

}

class mockVendedor extends Vendedor{

    public mockVendedor(){
        this.setNombre("nombre");
        this.setMonto_vendido(10);
        this.setNro_ventas(10);
    }
}

class mockProducto extends Producto {
    
    public mockProducto(){
        this.setNombre("nombre");
        this.setPrecio(10);
        this.setStock(10);
    }
}


