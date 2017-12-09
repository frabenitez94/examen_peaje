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
        
        
        
        //variables.
        int rut_login = 0;
        String nombre_login = null;
        String direccion_login = null;
        String comprador_login = null;
        
        int opt_pago = 0;
        int opt_retiro = 0;
        
        int c_ruta68 = 0;
        int c_rutaSol = 0;
        int c_rutaGuardaVieja = 0;
        int c_troncalSur = 0;
        
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
            EmpresaCliente empresaCliente = new EmpresaCliente(rut_login, direccion_login, comprador_login, nombre_login);
            
            Carretera ruta68 = new Carretera(1,c_ruta68);
            Carretera rutaSol = new Carretera(1,c_rutaSol);
            Carretera rutaGuardaVieja = new Carretera(1,c_rutaGuardaVieja);
            Carretera troncalSur = new Carretera(4, c_troncalSur);
            
            
            
        } catch (Exception e) {
        }
        
        
        
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
