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
public class EmpresaCliente {
    private int rut;
    private String direccion;
    private String nombreEmpresa;

    public EmpresaCliente() {
    }

    public EmpresaCliente(int rut, String direccion, String nombreEmpresa) throws Exception {
        setRut(rut);
        setDireccion(direccion);
        setNombreEmpresa(nombreEmpresa);
    }
    
        public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa){
            this.nombreEmpresa = nombreEmpresa;
    }
    public int getRut() {
        
        return rut;
    }

    public void setRut(int rut) throws Exception {
        if(rut > 0 && rut < 999999999 ){
        this.rut = rut;
        }else{
           throw new Exception("no puedes ingresar un dato menor a 0 ni un dato mayor a los los 9 digitos y si termina en k remplacelo por un 1");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    
}
