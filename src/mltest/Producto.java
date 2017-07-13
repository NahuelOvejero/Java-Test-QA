/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mltest;

/**
 *
 * @author Usuario
 */
public class Producto {
    
  private String nombre;
  float precio;
  private int stock;

public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
public Producto(){}
  
  
  public void setNombre(String nombre){ this.nombre = nombre; }
  public void setPrecio(float precio) { this.precio = precio; }
  public void setStock(int stock) { this.stock = stock; }
  
  public String getNombre(){ return nombre; }
  public float getPrecio() { return precio;} 
  public int getStock() {return stock;}

}
