/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author Martin
 */
public class Clase {
     private String id;
     private String vehiculos;
     private int edadMinima;
    
 public Clase() {
    }

	
    public Clase(String id, String vehiculos, int edadMinima) {
        this.id = id;
        this.vehiculos = vehiculos;
        this.edadMinima = edadMinima;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(String vehiculos) {
        this.vehiculos = vehiculos;
    }
    public int getEdadMinima() {
        return this.edadMinima;
    }
    
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

}