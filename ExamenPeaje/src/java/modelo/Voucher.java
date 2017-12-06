/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Reveco
 */
public class Voucher {
    private int numeroPedido;
    private int totalAPagar;
    private Carretera carretera;

    public Voucher() {
    }
    
    public Voucher(int numeroPedido, int totalAPagar, Carretera carretera) {
        this.numeroPedido = numeroPedido;
        this.totalAPagar = totalAPagar;
        this.carretera = carretera;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) throws Exception {
        if(numeroPedido <= 0){
            throw new Exception("no puede ser menor a 0");
        }else{
        this.numeroPedido = numeroPedido;
        }
    }

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(int totalAPagar) throws Exception {
        if(totalAPagar <= 0){
            throw new Exception("el total no puede ser menor a 0");
        }else{
        this.totalAPagar = totalAPagar;
        }
    }

    public Carretera getCarretera() {
        return carretera;
    }

    public void setCarretera(Carretera carretera) {
        this.carretera = carretera;
    }

    @Override
    public String toString() {
        return "Voucher{" + "numeroPedido=" + numeroPedido + ", totalAPagar=" + totalAPagar + ", carretera=" + carretera + '}';
    }

    
    
    
}
