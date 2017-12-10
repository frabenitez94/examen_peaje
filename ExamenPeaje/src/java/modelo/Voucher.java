/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Reveco
 */
public class Voucher {
    private Pedido pedido;
    private int total;

    public Voucher() {
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void calculaTotal(int valorRuta68, int valorTroncalSur, int valorSol, int valorGuardaVieja){
        int c1,c2,c3,c4;
        c1 = pedido.getcGuardaVieja();
        c2 = pedido.getcRuta68();
        c3 = pedido.getcTroncalSur();
        c4 = pedido.getcRutaSol();
        
        total = (valorGuardaVieja*c1+valorRuta68*c2+valorTroncalSur*c3+valorSol*c4);
    }
}
