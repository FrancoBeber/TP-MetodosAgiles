
package Persistencia;
import java.util.Date;
/**
 *
 * @author Martin
 */
public class Licencia {
     private Integer id;
     private int personaId;
     private String claseId;
     private int usuarioId;
     private int costoId;
     private int vigenciaId;
     private Date fechaEmision;
     private Date fechaVenc;
     private String observaciones;

    
public Licencia(){
    }

 public Licencia(int personaId, String claseId, int usuarioId, int costoId, int vigenciaId, Date fechaEmision, Date fechaVenc) {
        this.personaId = personaId;
        this.claseId = claseId;
        this.usuarioId = usuarioId;
        this.costoId = costoId;
        this.vigenciaId = vigenciaId;
        this.fechaEmision = fechaEmision;
        this.fechaVenc = fechaVenc;
    }
    public Licencia(int personaId, String claseId, int usuarioId, int costoId, int vigenciaId, Date fechaEmision, Date fechaVenc, String observaciones) {
       this.personaId = personaId;
       this.claseId = claseId;
       this.usuarioId = usuarioId;
       this.costoId = costoId;
       this.vigenciaId = vigenciaId;
       this.fechaEmision = fechaEmision;
       this.fechaVenc = fechaVenc;
       this.observaciones = observaciones;
    }

    public Integer getId() {
        return id;
    }

    public int getPersonaId() {
        return personaId;
    }

    public String getClaseId() {
        return claseId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public int getCostoId() {
        return costoId;
    }

    public int getVigenciaId() {
        return vigenciaId;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public void setClaseId(String claseId) {
        this.claseId = claseId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setCostoId(int costoId) {
        this.costoId = costoId;
    }

    public void setVigenciaId(int vigenciaId) {
        this.vigenciaId = vigenciaId;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
