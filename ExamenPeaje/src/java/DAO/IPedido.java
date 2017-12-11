/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import modelo.Pedido;

/**
 *
 * @author Francisco Benitez
 */
public interface IPedido {
 
    public int Insertar(Pedido pedido);
    
    public boolean Eliminar(int idPedido); 
    
    public ArrayList<Pedido> LeerTodo(int rut); 
     
}
