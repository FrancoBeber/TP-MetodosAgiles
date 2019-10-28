
package Persistencia;

import java.util.Date;

/**
 *
 * @author Martin
 */
public class Persona {
     private Integer id;
     private String apellido;
     private String nombre;
     private Date fechaN;
     private String domicilio;
     private String grupoS;
     private String factor;
     private boolean donante;   


 public Persona() {
    }

public Persona(String apellido, String nombre, Date fechaN, String domicilio, String grupoS, String factor, boolean donante) {
       this.apellido = apellido;
       this.nombre = nombre;
       this.fechaN = fechaN;
       this.domicilio = domicilio;
       this.grupoS = grupoS;
       this.factor = factor;
       this.donante = donante;

    }

    public Integer getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getGrupoS() {
        return grupoS;
    }

    public String getFactor() {
        return factor;
    }

    public boolean isDonante() {
        return donante;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setGrupoS(String grupoS) {
        this.grupoS = grupoS;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public void setDonante(boolean donante) {
        this.donante = donante;
    }

}