package Persistencia;
// Generated 08/11/2019 17:59:29 by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * Licencia generated by hbm2java
 */
public class Licencia  implements java.io.Serializable {


     private Serializable idLicencia;
     private Clase clase;
     private Costo costo;
     private Persona persona;
     private User user;
     private Vigencia vigencia;
     private Serializable motivo;
     private Serializable fechaDeEmision;
     private Serializable fechaDeVencimiento;
     private Serializable observaciones;

    public Licencia() {
    }

    public Licencia(Serializable idLicencia, Clase clase, Costo costo, Persona persona, User user, Vigencia vigencia, Serializable motivo, Serializable fechaDeEmision, Serializable fechaDeVencimiento, Serializable observaciones) {
       this.idLicencia = idLicencia;
       this.clase = clase;
       this.costo = costo;
       this.persona = persona;
       this.user = user;
       this.vigencia = vigencia;
       this.motivo = motivo;
       this.fechaDeEmision = fechaDeEmision;
       this.fechaDeVencimiento = fechaDeVencimiento;
       this.observaciones = observaciones;
    }
   
    public Serializable getIdLicencia() {
        return this.idLicencia;
    }
    
    public void setIdLicencia(Serializable idLicencia) {
        this.idLicencia = idLicencia;
    }
    public Clase getClase() {
        return this.clase;
    }
    
    public void setClase(Clase clase) {
        this.clase = clase;
    }
    public Costo getCosto() {
        return this.costo;
    }
    
    public void setCosto(Costo costo) {
        this.costo = costo;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Vigencia getVigencia() {
        return this.vigencia;
    }
    
    public void setVigencia(Vigencia vigencia) {
        this.vigencia = vigencia;
    }
    public Serializable getMotivo() {
        return this.motivo;
    }
    
    public void setMotivo(Serializable motivo) {
        this.motivo = motivo;
    }
    public Serializable getFechaDeEmision() {
        return this.fechaDeEmision;
    }
    
    public void setFechaDeEmision(Serializable fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }
    public Serializable getFechaDeVencimiento() {
        return this.fechaDeVencimiento;
    }
    
    public void setFechaDeVencimiento(Serializable fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
    public Serializable getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(Serializable observaciones) {
        this.observaciones = observaciones;
    }




}


