/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author martin
 */
import Persistencia.Costos;

public class CostosController {
    private CostosDAO costoDAO;
    private Costos costo;
    //Costo administrativo
    private final float costoAdministrativo = 8;
    
    public CostosController(){
        this.costoDAO = new CostosDAO();
    }
    
    public float calcularCosto(String clase, int vigencia){
        this.costo = costoDAO.calcularCosto(clase , vigencia);
        float costoLicencia = costo.getPrecio();
        return (costoAdministrativo + costoLicencia);
    }
    
    public int getCostoId(){
        return this.costo.getId();
    }
    
    public Costos getCosto(){
        return this.costo;
    }

    public float getCostoAdmin() {
        return costoAdministrativo;
    }

}
