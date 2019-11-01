/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Martin
 */
import Persistencia.Costos;
import java.util.List;
import Conexion.util;
import org.hibernate.Query;
import org.hibernate.Session;
public class CostosDAO {
    private Session ss;
    
    public CostosDAO() {
    }
    
    public Costos calcularCosto(String clase, int vigencia){
        ss = util.getSessionFactory().openSession();
        ss.beginTransaction();
        
        String sentencia = "SELECT C.* "
                        + "FROM costo C "
                        + "WHERE C.idclase='" + clase + "' "
                        + "AND C.anios ='" + vigencia + "';";        
             
        Query query = ss.createSQLQuery(sentencia).addEntity(Costos.class);
        List<Costos> lista = query.list();
        
        ss.getTransaction().commit();
        ss.close();
        
        
        if (lista.size() == 1){
            return lista.get(0);
        }    
        else{
            return null;
        }
        
    }
    
    
}
