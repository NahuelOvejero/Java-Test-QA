
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mltest;

/**
 *
 * @author Nahuel
 */
public class Venta {
    
    Producto producto;
    Vendedor vendedor;
    Cliente comprador;

    
    

  public String registrarVenta (Cliente cliente, Producto producto , Vendedor vendedor , int cantidad){    
      this.comprador = cliente;
      this.producto = producto;
      this.vendedor = vendedor;
      
     /*podrian realizarse metodos auxiliares como "aumentarVenta" / "aumentarCompra"
       que aumente el 1 cada atributo respectivamente.
     Pero para mantener la fidelidad del examen, utilice las nombradas en el mismo.*/
      
      

    if(producto.getStock() < cantidad || cantidad <= 0){
      return "Error al intentar vender " + cantidad + " Unidades de " + producto.getNombre() + " Stock Insuficiente (" + producto.getStock() + ").";
     }
    else {
        
    }
      float precio_neto = cantidad * producto.getPrecio();   
      
      //aumentar compra cliente, bajar stock.      
      producto.setStock( producto.getStock() - cantidad );      
      cliente.setNro_compras( cliente.getNro_compras() +1 ); 
      
      //vendedor: +++
      vendedor.setNro_ventas( vendedor.getNro_ventas() + 1 ); 
      float puntajeAntiguo = vendedor.getPuntaje();        
      
      float precio_final = 0;
      
      if(cliente.getMonto_total() >= 10000){
          precio_final = precio_neto - (precio_neto * 25 / 100) ;
      } 
      else{
          precio_final = precio_neto - (precio_neto * 25 / 100) * (cliente.getNro_compras() / 10000) ;
      } 
      
      comprador.setMonto_total( comprador.getMonto_total() + precio_final);
      vendedor.setMonto_vendido(vendedor.getMonto_vendido() + precio_final );
      
      vendedor.setPuntaje( 100 - (100/(vendedor.getNro_ventas() * vendedor.getMonto_vendido())));
      
     
      
 
              
      return "El producto vendido fue : " + producto.getNombre() + " a $" + producto.getPrecio() + " la unidad." 
              + " Siendo " + cantidad + " unidades, por un precio total de : $" + precio_final 
              + ". Comprador : " + cliente.getNombre() + ". Vendedor : " + vendedor.getNombre() 
              + "Teniendo un puntaje de : " + puntajeAntiguo + " Paso a tener : " + vendedor.getPuntaje();

    }
}

  

