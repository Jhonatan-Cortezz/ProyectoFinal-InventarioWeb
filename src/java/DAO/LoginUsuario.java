
package DAO;

import Factory.ConexionBD;
import Factory.FactoryConexionBD;
import Model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class LoginUsuario {
    ConexionBD con;

    public LoginUsuario() {
        this.con = FactoryConexionBD.open(FactoryConexionBD.MySql);
    }
    
    public Usuario login(String correo, String contra) throws SQLException, ClassNotFoundException{
        String bdLocal = "jdbc:mysql://localhost:3306/bd_inventario";
        String user = "root";
        String pass = "";
        Usuario usuario = null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(bdLocal, user, pass);
            String miSql = "select * from tb_usuario where correo = ? and clave = ?";
            PreparedStatement st = connection.prepareStatement(miSql);
            st.setString(1, correo);
            st.setString(2, contra);

            ResultSet result = st.executeQuery();
            
            if (result.next()) {
                usuario = new Usuario();
                usuario.setCorreo(correo);
                usuario.setNombre(result.getString("nombre"));
                usuario.setApellido(result.getString("apellido"));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        
        return usuario;
    }
}
