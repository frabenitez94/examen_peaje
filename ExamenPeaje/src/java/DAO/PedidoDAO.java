
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
    
    private static final String SQL_INSERT = "INSERT INTO pedido (comprador,tipoRetiro,tipoPago,cRutaSol,cRuta68,cTroncalSur,cGuardaVieja,total,idRut)"
                                        + " VALUES(?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "delete from pedido where idPedido = ?";
    private static final String SQL_READALL = "select *from pedido where rut=?";
    

    private static final Conexion con = Conexion.getInstance();

    @Override
    public int Insertar(Pedido pedido) {
        int aux = 0;
        try {
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            
            ps.setString(1, pedido.getComprador());
            ps.setInt(2, pedido.getTipoPago());
            ps.setInt(3, pedido.getTipoRetiro());
            ps.setInt(4, pedido.getcRuta68());
            ps.setInt(5, pedido.getcRutaSol());
            ps.setInt(6, pedido.getcTroncalSur());
            ps.setInt(7, pedido.getcGuardaVieja());
            ps.setInt(8, pedido.getTotal());
            ps.setInt(9, pedido.getEmpresa().getRut());
            
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
