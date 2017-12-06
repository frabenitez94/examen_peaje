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
    public int cantidadCarretera;
    public int costoCarretera;

    public Carretera() {
    }

    public Carretera(int idCarretera, String nombreCarretera, int cantidadCarretera, int costoCarretera) throws Exception {
        this.idCarretera = idCarretera;
        this.nombreCarretera = nombreCarretera;
        setCantidadCarretera(cantidadCarretera);
        this.costoCarretera = costoCarretera;
    }

    public int getCostoCarretera() {
        return costoCarretera;
    }

    public void setCostoCarretera(int costoCarretera) {
        this.costoCarretera = costoCarretera;
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
        return "Carretera{" + "idCarretera=" + idCarretera + ", nombreCarretera=" + nombreCarretera + ", cantidadCarretera=" + cantidadCarretera + ", costoCarretera=" + costoCarretera + '}';
    }    
}
