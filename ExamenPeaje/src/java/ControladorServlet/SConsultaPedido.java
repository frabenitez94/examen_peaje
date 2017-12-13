/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorServlet;

import DAO.EmpresaDAO;
import DAO.PedidoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.EmpresaCliente;
import modelo.Pedido;

/**
 *
 * @author Francisco Benitez
 */
@WebServlet(name = "SConsultaPedido", urlPatterns = {"/SConsultaPedido"})
public class SConsultaPedido extends HttpServlet {

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
        
            int rut = Integer.parseInt(request.getParameter("rut"));
        
          //HttpSession miSession = request.getSession(true);
            EmpresaDAO empresadao = new EmpresaDAO();
            PedidoDAO pedidoDAO = new PedidoDAO();
            ArrayList<EmpresaCliente> listaEmpresa = new ArrayList();
            ArrayList<Pedido> listaPedido = new ArrayList();

            try {
               listaEmpresa.addAll(empresadao.ReadAll());
               listaPedido.addAll(pedidoDAO.LeerTodo(rut));
               // request.getSession().setAttribute("listaEmpresa", listaEmpresa);
               // RequestDispatcher r = request.getRequestDispatcher("mostrarPedidos.jsp");
               //r.forward(request, response);

               request.setAttribute("listaEmpresa", listaEmpresa);
               request.setAttribute("listaPedido", listaPedido);

            } catch (Exception ex) {
                request.getSession().setAttribute("mensaje", ex);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        request.getRequestDispatcher("mostrarPedidos.jsp").forward(request, response);
        
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
