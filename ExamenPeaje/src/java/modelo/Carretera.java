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
public class Carretera {
    private int idCarretera;
    private String nombreCarretera;
    private int cantidadCarretera;

    public Carretera() {
    }

    public Carretera(int idCarretera, String nombreCarretera, int cantidadCarretera) {
        this.idCarretera = idCarretera;
        this.nombreCarretera = nombreCarretera;
        setCantidadCarretera(cantidadCarretera);
    }

    public int getIdCarretera() {
        return idCarretera;
    }

    public void setIdCarretera(int idCarretera) {
        this.idCarretera = idCarretera;
    }

    public String getNombreCarretera() {
        return nombreCarretera;
    }

    public void setNombreCarretera(String nombreCarretera) {
        this.nombreCarretera = nombreCarretera;
    }

    public int getCantidadCarretera() {
        return cantidadCarretera;
    }

    public void setCantidadCarretera(int cantidadCarretera) throws Exception {
        if(cantidadCarretera <= 0){
            throw new Exception("no puede ser menor a uno");
        }else{
            this.cantidadCarretera = cantidadCarretera;
        }
    }

    @Override
    public String toString() {
        return "Carretera{" + "idCarretera=" + idCarretera + ", nombreCarretera=" + nombreCarretera + ", cantidadCarretera=" + cantidadCarretera + '}';
    }
    
    
}
