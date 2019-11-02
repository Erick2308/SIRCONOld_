package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consulta extends Conexion{
    
    public boolean autenticacion(String usuario, String password){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from usuario where usuario = ? and password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e);
        } finally{
            try {
                if(getConexion() != null)getConexion().close();                
                if(pst != null)pst.close();
                if(rs != null)rs.close();                
            } catch (Exception e) {
                System.err.println("ERROR: "+e);
            }
        }
        
        return false;
    }
    public boolean registrar(String nombre, String apellido, String usuario, String password){
        
        PreparedStatement pst = null;
        
        try {
            String consulta = "insert into usuario (nombre, apellido, usuario, password) values (?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, usuario);
            pst.setString(4, password);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("Error: "+e);
            }
        }
        
        return false;
    }
}
