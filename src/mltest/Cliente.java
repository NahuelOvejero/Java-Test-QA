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
public class Cliente {
  private String nombre;
  private String apellido;
  private int nro_compras;
  private float monto_total;
  private float bonificacion;
  
  public Cliente(){}

    public Cliente(String nombre, String apellido, int nro_compras, float monto_total, float bonificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nro_compras = nro_compras;
        this.monto_total = monto_total;
        this.bonificacion = bonificacion;
    }
  
  
  
  
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setNro_compras(int nro_compras){ this.nro_compras = nro_compras;}
  public void setBonificacion(float bonificacion){ this.bonificacion = bonificacion; }  
  public void setMonto_total(float monto_total) {this.monto_total = monto_total;}

    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public int getNro_compras() {return nro_compras;}
    public float getBonificacion() {return bonificacion;} 
    public float getMonto_total() {return monto_total;}
  
}
