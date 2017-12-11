/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import conexion.Conexion;
import java.util.ArrayList;
import modelo.EmpresaCliente;

/**
 *
 * @author Francisco Benitez
 */
public class EmpresaDAO implements IEmpresa{

    PreparedStatement ps; //le cambio el nombre :D ! !   
    
    
    
    private static final String SQL_INSERT = "INSERT INTO empresa (rut,nombre,direccion,comprador) VALUES(?,'?','?','?')";
    private static final String SQL_READ = "select *from empresa";
    private static final String SQL_READALL = "select *from where rut = ?";
    
    
    private static final Conexion con = Conexion.getInstance();
    
    
    
    
    @Override
    public int Insert(EmpresaCliente empresa) {
        int aux = 0;
        try {
           ps = con.getCnn().prepareStatement(SQL_READ);
           
           ps.setInt(1, empresa.getRut());
           ps.setString(2, empresa.getNombreEmpresa());
           ps.setString(3, empresa.getDireccion());
           ps.setString(4, empresa.getComprador());
           
           aux = ps.executeUpdate();
           
        } catch (Exception exep) {
        }
       return aux;
    }

    @Override
    public ArrayList<EmpresaCliente> ReadAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmpresaCliente Read(int rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
