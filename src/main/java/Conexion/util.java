/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Martin
 */
public class util {
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
      public static SessionFactory getSessionFactory() {
        //Se verifica conexión
        try{
            DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "39255414");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR. Falló la conexión a la base de datos", "Error",  JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return sessionFactory;
    }
}