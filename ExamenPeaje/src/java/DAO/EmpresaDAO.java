/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import conexion.Conexion;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.EmpresaCliente;

/**
 *
 * @author Francisco Benitez
 */
public class EmpresaDAO implements IEmpresa{

    PreparedStatement ps; //le cambio el nombre :D ! !   
    
    
    
    private static final String SQL_INSERT = "INSERT INTO empresa (rut,nombre,direccion) VALUES(?,?,?)";
    private static final String SQL_READ = "select *from empresa where rut = ?";
    private static final String SQL_READALL = "select *from empresa";
    
    
    
    private static final Conexion con = Conexion.getInstance();
    
    
    
    
    @Override
    public boolean Insert(EmpresaCliente empresa) {
        int aux=0;
        try {
           ps = con.getCnn().prepareStatement(SQL_INSERT);
           
           ps.setInt(1, empresa.getRut());
           ps.setString(2, empresa.getNombreEmpresa());
           ps.setString(3, empresa.getDireccion());
           
           aux = ps.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        if(aux>0){
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<EmpresaCliente> ReadAll() {
        ArrayList<EmpresaCliente> empresa  = null;
        
        try {
            empresa = new ArrayList<>();
            ps = con.getCnn().prepareStatement(SQL_READALL);
            ResultSet res = ps.executeQuery();
            
            while (res.next()) {                
                empresa.add(new EmpresaCliente(res.getInt(2), res.getString(3), res.getString(4)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return empresa;
        }

    @Override
    public EmpresaCliente Read(int rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
