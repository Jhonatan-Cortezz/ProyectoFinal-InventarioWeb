/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luis E. Leonor
 */
public abstract class ConexionBD {
    protected String[] parametros;//arreglo que recibe los parametros de la conexion
    protected Connection conexion;
    
    //metodo abstracto
    abstract Connection open();
    
    //metodo para las consultas
    public ResultSet consultaSql(String consulta){
        Statement st;
        ResultSet rs = null;//tabla temporal de almacenamiento de datos
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(consulta);//ejecuta la consulta
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return rs;
    }
    
    //metodo para ejecutar Sql
    public boolean ejecutarSql(String consulta){
        Statement st;
        boolean guardar = true;
        try {
            st = conexion.createStatement();
            st.executeUpdate(consulta);
        } catch (SQLException e) {
            guardar = false;
            e.printStackTrace();
        }
        return guardar;
    }
    
    //metodo para cerrar conexion
    public boolean cerrarConexion(){
        boolean ok = true;
        try {
            conexion.close();
        } catch (Exception ex) {
            ok = false;
            ex.printStackTrace();
        }
        return ok;
    }
}
