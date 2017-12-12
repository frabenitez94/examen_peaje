/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Carretera;
import modelo.EmpresaCliente;
import modelo.Opciones;
import modelo.Pedido;
import DAO.CarreteraDAO;
import DAO.EmpresaDAO;
import DAO.PedidoDAO;
import java.util.ArrayList;
import modelo.Voucher;


/**
 *
 * @author Francisco Benitez
 */
@WebServlet(name = "SIngresoEmpresa", urlPatterns = {"/SIngresoEmpresa"})
public class SIngresoEmpresa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //variables y obj.
        ArrayList<EmpresaCliente> compruebaEmpresa = new ArrayList<>();
        int rut_login;
        String nombre_login;
        String direccion_login;
        String comprador_login;
        int opt_pago;
        int opt_retiro;
        int c_ruta68;
        int c_rutaSol;
        int c_rutaGuardaVieja;
        int c_troncalSur;
        
        Voucher voucher = new Voucher();
        CarreteraDAO c1DAO = new CarreteraDAO();
        Carretera Ruta68 = new Carretera();
        Carretera GuardaVieja = new Carretera();
        Carretera RutaSol = new Carretera();
        Carretera TroncalSur = new Carretera();
        EmpresaDAO empresaDAO = new EmpresaDAO();
        PedidoDAO pedidoDAO = new PedidoDAO();

        // traer objetos base datos
        
        compruebaEmpresa = empresaDAO.ReadAll();
        Ruta68 = c1DAO.read(1);
        RutaSol = c1DAO.read(2);
        GuardaVieja = c1DAO.read(3);
        TroncalSur = c1DAO.read(4);
        
        
        
        
        // Extraccion de datos. 
        
        rut_login = Integer.parseInt(request.getParameter("rut"));
        nombre_login = request.getParameter("nombre");
        direccion_login = request.getParameter("direccion");
        comprador_login = request.getParameter("comprador");
        
        opt_pago = Integer.parseInt(request.getParameter("optPago"));
        opt_retiro = Integer.parseInt(request.getParameter("optRetiro"));
        
        c_ruta68 = Integer.parseInt(request.getParameter("cantidadRuta68"));
        c_rutaGuardaVieja = Integer.parseInt(request.getParameter("cantidadRutaGuardiaVieja"));
        c_rutaSol = Integer.parseInt(request.getParameter("cantidadRutaDelSol"));
        c_troncalSur = Integer.parseInt(request.getParameter("cantidadTroncalSur"));
        
        // Modelo try, validaciones.. 
        try {
            EmpresaCliente empresaCliente = new EmpresaCliente(rut_login, direccion_login, nombre_login);
            if(compruebaEmpresa.contains(empresaCliente)){
                Pedido pedido = new Pedido(empresaCliente, opt_retiro, opt_pago, c_ruta68, c_rutaSol, c_troncalSur, c_rutaGuardaVieja,comprador_login);
                pedido.calculaTotal(Ruta68.getCostoCarretera(), TroncalSur.getCostoCarretera(), RutaSol.getCostoCarretera(), GuardaVieja.getCostoCarretera());
                pedidoDAO.Insertar(pedido);
            }else{
            Pedido pedido = new Pedido(empresaCliente, opt_retiro, opt_pago, c_ruta68, c_rutaSol, c_troncalSur, c_rutaGuardaVieja,comprador_login);
            pedido.calculaTotal(Ruta68.getCostoCarretera(), TroncalSur.getCostoCarretera(), RutaSol.getCostoCarretera(), GuardaVieja.getCostoCarretera());
            empresaDAO.Insert(empresaCliente);
            pedidoDAO.Insertar(pedido);
            }
        } catch (Exception ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        request.getRequestDispatcher("exito.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
