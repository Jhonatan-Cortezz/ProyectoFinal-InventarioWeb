/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Luis E. Leonor
 */
public class FactoryConexionBD {
   //podemos definir la conexion para diferentes BD
    public static final int MySql = 1;
    public static String[] configMySql = {"bd_inventario", "root", ""};
    
    public static ConexionBD open(int tipoBD){
        switch(tipoBD){
            case FactoryConexionBD.MySql:
                return new MySqlConexionFactory(configMySql);
               
            default:
                return null;
        }
    }
}
