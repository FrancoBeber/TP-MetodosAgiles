/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import org.hibernate.Session;
import Conexion.util;

/**
 *
 * @author marti
 */
public class AuxDAO {
    
    private static Session SS;
    
    public AuxDAO(){
        SS = util.getSessionFactory().openSession();
        SS.beginTransaction();
        SS.getTransaction().commit();
        SS.close();
    }

    public static void create(Object o){
        SS = util.getSessionFactory().openSession();
        SS.beginTransaction();
        SS.save(o);
        SS.getTransaction().commit();
        SS.close();
    }
    
    
    public static Object read(Object o, int id){
        SS = util.getSessionFactory().openSession();
        SS.beginTransaction();
        Class c = o.getClass();
        Object obj = SS.get(c, id);
        SS.getTransaction().commit();
        SS.close();
        return obj;
    }
    
    public static void update(Object o){
        SS = util.getSessionFactory().openSession();
        SS.beginTransaction();
        SS.update(o);
        SS.getTransaction().commit();
        SS.close();
    }

    public static void delete(Object o){
        SS = util.getSessionFactory().openSession();
        SS.beginTransaction();
        SS.delete(o);
        SS.getTransaction().commit();
        SS.close();
    }  
    
}

