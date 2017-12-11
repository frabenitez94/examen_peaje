
package DAO;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Carretera;

/**
 *
 * @author Francisco Benitez
 */
public class CarreteraDAO implements ICarretera{
    
    PreparedStatement ps;
    
    private static final String SQL_READALL = "select *from carretera";
    private static final String SQL_READ = "Select *from carretera where id = ?";
    
    
    private static final Conexion con = Conexion.getInstance();

    @Override
    public ArrayList<Carretera> ReadALl() {
        ArrayList<Carretera> carretera = null; 
        
        try {
            carretera = new ArrayList<>();
            ps = con.getCnn().prepareStatement(SQL_READALL);
            ResultSet res = ps.executeQuery();
            
            while (res.next()) {
                carretera.add(new Carretera(res.getInt(1), res.getString(2),res.getInt(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarreteraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  carretera;
    }
    

    @Override
    public Carretera read(int id) {
        Carretera carretera = new Carretera();
        
        try {
            ps = con.getCnn().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            
            if (res.next()) {
                carretera = new Carretera(res.getInt(1), res.getString(2), res.getInt(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarreteraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carretera;
    }

    
    
    
   
    
    
}
