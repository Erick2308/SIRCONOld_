package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private String username = "root";
    private String password = "SirconVS20++";
    private String host = "127.0.0.1";
    private String port = "3306";
    private String database = "bd_loginjsp";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+host+":"+port+"/"+database+"?serverTimezone=UTC";
    private Connection con;
    
    public Conexion(){
        try {
            Class.forName(classname);
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR: "+e);
        } catch (SQLException e){
            System.err.println("ERROR: "+e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
    public static void main(String[] args) {
        
        Conexion con = new Conexion();
        
    }
}
