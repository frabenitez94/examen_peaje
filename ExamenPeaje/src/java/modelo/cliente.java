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
public class cliente {
    private int rut;
    private int dvRut;
    private String direccion;
    private String comprador;
    private String nombreEmpresa;

    public cliente() {
    }

    public cliente(int rut, int dvRut, String direccion, String comprado,String nombreEmpresa) {
        this.rut = rut;
        this.dvRut = dvRut;
        this.direccion = direccion;
        this.comprador = comprado;
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    
    
    public String getComprado() {
        return comprador;
    }

    public void setComprado(String comprado) throws Exception {
        if(comprado == null){
            throw new Exception("no se puede ingresar el dato vacio");
        }else{
            this.comprador = comprado;
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
        rutCompleto = Integer.toString(rut) + "-" +dvRut;
    }
    
    
  

}
