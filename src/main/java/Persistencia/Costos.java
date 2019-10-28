
package Persistencia;

/**
 *
 * @author Martin
 */
public class Costos {

     private Integer id;
     private String clase;
     private int anios;
     private float precio;

    public Costos() {
    }

    public Costos(String clase, int anios, float precio) {
       this.clase = clase;
       this.anios = anios;
       this.precio = precio;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getClase() {
        return this.clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }
    public int getAnios() {
        return this.anios;
    }
    
    public void setAnios(int anios) {
        this.anios = anios;
    }
    public float getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }




}

