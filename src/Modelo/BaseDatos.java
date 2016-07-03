/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.gjt.mm.mysql.Driver;

/**
 *
 * @author nicoo
 */
public class BaseDatos {
    private Connection conn = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ayuda_psicologica?user=root&password=NEOGpastor1994");
        }catch(Exception ex){
            System.out.printf(ex.getMessage());
        }
        return conn;
    }
    
    public boolean comprobarUsuario(String correo) throws SQLException{
        conn = this.conexion();
        Statement st = conn.createStatement();
        ResultSet rs = (ResultSet) st.executeQuery("SELECT * FROM USUARIO WHERE USUARIOCORREO="+correo);
        if(rs.first()){
            return true;
        }else{
            return false;
        }
    }
    
    public ResultSet consultar(String consulta) throws SQLException{
        conn = this.conexion();
        Statement st = conn.createStatement();
        ResultSet rs = (ResultSet) st.executeQuery(consulta);
        return rs; 
    }
}
