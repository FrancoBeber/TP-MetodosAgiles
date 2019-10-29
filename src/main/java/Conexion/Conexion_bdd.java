/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author Martin
 */

import java.sql.*;

        
public class Conexion_bdd {
    
    
    public static void main(String args[]){
    String url= "jdbc:postgresql://localhost:5432/postgres";
    
    String usuario = "postgres";
    String contrasenia= "1234";
    try{
        Class.forName("org.postgresql.Driver");
        Connection conexion=DriverManager.getConnection(url, usuario, contrasenia);
        java.sql.Statement at= conexion.createStatement();
    
}catch(Exception e){
  System.out.println("ERROR DE CONEXION" + e.getMessage());
}
            
    
}}
