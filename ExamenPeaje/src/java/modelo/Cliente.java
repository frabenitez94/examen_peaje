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
public class Cliente {
    private int rut;
    private int dvRut;
    private String direccion;
    private String comprador;
    private String nombreEmpresa;

    public Cliente() {
    }

    public Cliente(int rut, int dvRut, String direccion, String comprado,String nombreEmpresa) throws Exception {
        setRut(rut) ;
        setDvRut(dvRut);
        setDireccion(direccion);
        setComprador(comprador);
        setNombreEmpresa(nombreEmpresa);
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) throws Exception {
        if(comprador == null){
            throw new Exception("no se puede ingresar el dato vacio");
        }else{
            this.comprador = comprador;
        }
        this.comprador = comprador;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) throws Exception {
        if(nombreEmpresa == null){
            throw  new Exception("no se puede dejar vacio ");
        }else{
        this.nombreEmpresa = nombreEmpresa;
        }
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) throws Exception {
        if(rut > 0 && rut < 99999999 ){
        this.rut = rut;
        }else{
           throw new Exception("no puedes ingresar un dato menor a 0 ni un dato mayor a los 8 digitos");
        }
    }

    public int getDvRut() {
        return dvRut;
    }

    public void setDvRut(int dvRut) throws Exception {
        if(dvRut < 0 && dvRut >9){
        this.dvRut = dvRut;
        }else{
            throw new Exception("solo ingrese su dv de 1 a 9 si su dv termina en k remplazala por un 1");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws Exception {
        if(direccion == null){
            throw new Exception("debes ingresar un dato");
        }else{
        this.direccion = direccion;
        }
    }

    @Override
    public String toString() {
        return "cliente{" + "rut=" + rut + ", dvRut=" + dvRut + ", direccion=" + direccion + ", comprado=" + comprador + '}';
    }
    
    
    
    public void RutCompleto( String rutCompleto)
    { 
        rutCompleto = Integer.toString(rut)+dvRut;
    }
    
    
  

}
