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
public class Vendedor {
    
    
  private String nombre;
  private float monto_vendido;
  private int nro_ventas;

 public Vendedor(String nombre, float monto_vendido, int nro_ventas, float puntaje) {
        this.nombre = nombre;
        this.monto_vendido = monto_vendido;
        this.nro_ventas = nro_ventas;
        this.puntaje = puntaje;
    }

 public Vendedor(){}
   

  public void setNombre(String nombre){ this.nombre = nombre; }
  public void setMonto_vendido (float monto_vendido) { this.monto_vendido = monto_vendido; }
  public void setPuntaje(float puntaje) { this.puntaje = puntaje; }
  public void setNro_ventas(int nro_ventas) {this.nro_ventas = nro_ventas;}
  private float puntaje;

  public String getNombre(){ return nombre; }
  public float getMonto_vendido () { return monto_vendido;}
  public float getPuntaje(){return puntaje;}
  public int getNro_ventas() {return nro_ventas;}
}
