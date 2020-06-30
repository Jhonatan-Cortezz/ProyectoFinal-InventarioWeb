
package DAO;

// @author Cristian

import Model.Producto;
import java.util.List;


public interface ProductoDAO {
    //Metodos Abstractos
    public List<Producto> Listar();
    public  Producto editaProd(int id_prod_edit);
    public boolean guardarProd(Producto producto);
    public boolean borrarProd(int id_prod_borrar);
}
