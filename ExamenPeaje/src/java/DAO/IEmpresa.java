package DAO;

import java.util.ArrayList;
import modelo.EmpresaCliente;

/**
 *
 * @author Francisco Benitez
 */
public interface IEmpresa {
    
public boolean Insert(EmpresaCliente empresa);
 
//Traeme todo noma loco wom ! D;  
public ArrayList<EmpresaCliente> ReadAll();
//traeme la empresa porfi 
public EmpresaCliente Read(int rut);

// no tengo ganas de modificar, ni de eliminar por que tiene que hacerlo el mantenedor. no el cliente ! 
}
