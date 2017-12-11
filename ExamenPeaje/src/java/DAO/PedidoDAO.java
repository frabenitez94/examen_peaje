
package DAO;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import modelo.Pedido;

/**
 *
 * @author Francisco Benitez
 */
public class PedidoDAO implements IPedido{
    
    PreparedStatement ps;
    
    private static final String SQL_INSERT = "insert into pedido () value()";
    private static final String SQL_DELETE = "delete from pedido where idPedido = ?";
    private static final String SQL_READALL = "select *from pedido where rut=?";
    

    private static final Conexion con = Conexion.getInstance();

    @Override
    public boolean Insertar(Pedido pedido) {
        
        try {
        
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            
            ps.setInt(2, pedido.get);
            
            
        } catch (Exception ex) {
        }
        
        
        return true;
    }

    @Override
    public boolean Eliminar(int idPedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pedido> LeerTodo(int rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
