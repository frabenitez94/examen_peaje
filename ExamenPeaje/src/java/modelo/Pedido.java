
package modelo;

/**
 *
 * @author frabe_000
 */
public class Pedido {
    
    private int id;
    private EmpresaCliente empresa;
    private int tipoRetiro;
    private int tipoPago;
    private int idpc;
    private int cRutaSol;
    private int cRuta68;
    private int cTroncalSur;
    private int cGuardaVieja;

    public Pedido(EmpresaCliente empresa, int tipoRetiro, int tipoPago
            ,int cRuta68 ,int cRutaSol ,int cTroncalSur, int cGuardaVieja) {
        setRutEmpresa(empresa);
        setTipoPago(tipoPago);
        setTipoRetiro(tipoRetiro);
        setcRuta68(cRuta68);
        setcRutaSol(cRutaSol);
        setcTroncalSur(cTroncalSur);
        setcGuardaVieja(cGuardaVieja);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmpresaCliente getRutEmpresa() {
        return empresa;
    }

    public void setRutEmpresa(EmpresaCliente empresa) {
        this.empresa = empresa;
    }

    public int getTipoRetiro() {
        return tipoRetiro;
    }

    public void setTipoRetiro(int tipoRetiro) {
        this.tipoRetiro = tipoRetiro;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getIdpc() {
        return idpc;
    }

    public void setIdpc(int idpc) {
        this.idpc = idpc;
    }

    public EmpresaCliente getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaCliente empresa) {
        this.empresa = empresa;
    }

    public int getcRutaSol() {
        return cRutaSol;
    }

    public void setcRutaSol(int cRutaSol) {
        this.cRutaSol = cRutaSol;
    }

    public int getcRuta68() {
        return cRuta68;
    }

    public void setcRuta68(int cRuta68) {
        this.cRuta68 = cRuta68;
    }

    public int getcTroncalSur() {
        return cTroncalSur;
    }

    public void setcTroncalSur(int cTroncalSur) {
        this.cTroncalSur = cTroncalSur;
    }

    public int getcGuardaVieja() {
        return cGuardaVieja;
    }

    public void setcGuardaVieja(int cGuardaVieja) {
        this.cGuardaVieja = cGuardaVieja;
    }
    
    
    
}
