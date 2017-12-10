
package DAO;

import java.util.ArrayList;
import modelo.Carretera;

/**
 *
 * @author Francisco Benitez
 */
public interface ICarretera {
    
    public ArrayList<Carretera> ReadALl();
    
    public Carretera read(int id);
    
    
}
