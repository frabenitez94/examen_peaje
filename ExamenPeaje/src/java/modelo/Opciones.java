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
public class Opciones {
    private String opcionDePago;
    private String opcionDeRetiro;

    public Opciones() {
    }

    public Opciones(String opcionDePago, String opcionDeRetiro) {
        this.opcionDePago = opcionDePago;
        this.opcionDeRetiro = opcionDeRetiro;
    }

    public String getOpcionDePago() {
        return opcionDePago;
    }

    public void setOpcionDePago(String opcionDePago) throws Exception {
        if(this.opcionDePago == null){
            throw new Exception("tienes que ingresar una opcion");
        }else{
        this.opcionDePago = opcionDePago;
        }
    }

    public String getOpcionDeRetiro() {
        return opcionDeRetiro;
    }

    public void setOpcionDeRetiro(String opcionDeRetiro) throws Exception {
        if(opcionDeRetiro == null){
            throw new Exception("tienes que ingresar una opcion");
        }else{
        this.opcionDeRetiro = opcionDeRetiro;
        }
    }

    @Override
    public String toString() {
        return "Opciones{" + "opcionDePago=" + opcionDePago + ", opcionDeRetiro=" + opcionDeRetiro + '}';
    }

    
}   
    

