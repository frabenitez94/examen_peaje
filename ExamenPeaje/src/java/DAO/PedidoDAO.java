
package DAO;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pedido;

/**
 *
 * @author Francisco Benitez
 */
public class PedidoDAO implements IPedido{
    
    PreparedStatement ps;
    
    private static final String SQL_INSERT = "insert into pedido (total,rutEmpresa,idTipoPago,idTipoRetiro)"
                                        + " value(?,?,?,?)";
    private static final String SQL_DELETE = "delete from pedido where idPedido = ?";
    private static final String SQL_READALL = "select *from pedido where rut=?";
    

    private static final Conexion con = Conexion.getInstance();

    @Override
    public int Insertar(Pedido pedido) {
        int aux = 0;
        try {
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            
            ps.setInt(1, pedido.getTotal());
            ps.setInt(2, pedido.getEmpresa().getRut());
            ps.setInt(3, pedido.getTipoPago());
            ps.setInt(4, pedido.getTipoRetiro());
            
            aux = ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return aux;
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
