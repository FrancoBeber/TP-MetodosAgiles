/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author marti
 */

import Persistencia.Clase;
        
public class ClaseController {
    
    
 private ClaseDAO claseDAO;
    
    public ClaseController(){
        this.claseDAO = new ClaseDAO();
    }
    
    public boolean verificarClase(String clase){
        return (!(claseDAO.read(clase)==null));
        
    }
}
