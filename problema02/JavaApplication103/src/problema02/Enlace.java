/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Enlace {

    private Connection conn;
    
    public void establecerConexion() {        
        
        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
            
        } catch (SQLException e) {            
            System.out.println(e.getMessage());            
        }        
        
    }    
    
    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarEstudiante(Estudiante est) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (id,"
                    + "nombre, "
                    + "apellido,"
                    + "calificacion1,"
                    + "calificacion2)"
                    + "calificacion3)"
                    
                    + "values ('%d','%s','%s',%s, '%s', '%s')", 
                    est.obtenerId(), 
                    est.obtenerNombre(),
                    est.obtenerApellido(),
                    est.obtenerC1(),
                    est.obtenerC2(),
                    est.obtenerC3()
                    
            );
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
     
    public ArrayList<Estudiante> obtenerDataEstudiantes() {        
        ArrayList<Estudiante> lista = new ArrayList<>();
        try {            
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";
            
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Estudiante est = new Estudiante();
                est.establecerNombre(rs.getString("nombre"));
                est.establecerApellido(rs.getString("apellido"));
                est.establecerC1(rs.getDouble("calificacion1"));
                est.establecerC2(rs.getDouble("calificacion2"));
                est.establecerC3(rs.getDouble("calificacion3"));
                est.calcularPromedio();
                
                lista.add(est);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {            
            System.out.println("Exception: Calcular Promedio");
            System.out.println(e.getMessage());            
            
        }        
        return lista;
    }
    
}
