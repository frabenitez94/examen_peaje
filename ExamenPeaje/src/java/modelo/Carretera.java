
package modelo;

/**
 *
 * @author Reveco
 */
public class Carretera {
    private int idCarretera;
    private String nombreCarretera;
    private int costoCarretera;

    
    public Carretera(){
    }

    public Carretera(int idCarretera, String nombreCarretera, int costoCarretera) {
        setIdCarretera(idCarretera);
        setNombreCarretera(nombreCarretera);
        setCostoCarretera(costoCarretera);
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


/*
    public void setCantidadCarretera(int cantidadCarretera) throws Exception {
        if(cantidadCarretera < 0){
            throw new Exception("no puede ser menor a cero");
        }else{
            this.cantidadCarretera = cantidadCarretera;
        }
    }
*/

    @Override
    public String toString() {
        return "Carretera{" + "idCarretera=" + idCarretera + ", nombreCarretera=" + nombreCarretera + ", costoCarretera=" + costoCarretera + '}';
    }
   
}
