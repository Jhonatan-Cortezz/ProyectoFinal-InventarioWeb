/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Luis E. Leonor
 */
public class MySqlConexionFactory extends ConexionBD {
  public MySqlConexionFactory(String[] criterios) {
        this.parametros = criterios;
        this.open();
    }   
    //jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull
    @Override
    public Connection open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //en this.parametros pasaremos los datos de la BD 
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.parametros[0], this.parametros[1], this.parametros[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.conexion;
    }
    
}

