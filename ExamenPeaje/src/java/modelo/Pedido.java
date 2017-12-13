
package modelo;

/**
 *
 * @author frabe_000
 */
public class Pedido {
    
    private int id;
    private String comprador;
    private String tipoRetiro;
    private String tipoPago;
    private int cRutaSol;
    private int cRuta68;
    private int cTroncalSur;
    private int cGuardaVieja;
    private int total;
    private EmpresaCliente empresa;

    public Pedido(EmpresaCliente empresa, String tipoRetiro, String tipoPago
            ,int cRuta68 ,int cRutaSol ,int cTroncalSur, int cGuardaVieja, String comprador) {
        setTipoPago(tipoPago);
        setTipoRetiro(tipoRetiro);
        setcRuta68(cRuta68);
        setcRutaSol(cRutaSol);
        setcTroncalSur(cTroncalSur);
        setcGuardaVieja(cGuardaVieja);
        setTotal(total);
        setEmpresa(empresa);
        setComprador(comprador);
    }
    public Pedido(int id, String comprador,String tipoRetiro, String tipoPago
            ,int cRuta68 ,int cRutaSol ,int cTroncalSur, int cGuardaVieja,int total) {
        setId(id);
        setTipoPago(tipoPago);
        setTipoRetiro(tipoRetiro);
        setcRuta68(cRuta68);
        setcRutaSol(cRutaSol);
        setcTroncalSur(cTroncalSur);
        setcGuardaVieja(cGuardaVieja);
        setTotal(total);
        setComprador(comprador);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getTipoRetiro() {
        return tipoRetiro;
    }

    public void setTipoRetiro(String tipoRetiro) {
        this.tipoRetiro = tipoRetiro;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
    
    
    public void calculaTotal(int valorRuta68, int valorTroncalSur, int valorSol, int valorGuardaVieja){
        int c1,c2,c3,c4;
        c1 = cGuardaVieja;
        c2 = cRuta68;
        c3 = cTroncalSur;
        c4 = cRutaSol;
        
        total = (valorGuardaVieja*c1+valorRuta68*c2+valorTroncalSur*c3+valorSol*c4);
        
    }
    
}
