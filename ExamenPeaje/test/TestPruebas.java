import DAO.EmpresaDAO;
import modelo.EmpresaCliente;

/**
 *
 * @author Francisco Benitez
 */
public class TestPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        
        EmpresaCliente empresa = new EmpresaCliente(186693477, "vicuña mackena", "Francisco", "Litio SPA");
        
        EmpresaDAO empresadao = new EmpresaDAO();
        
      empresadao.Insert(empresa);
        
    }
    
}
