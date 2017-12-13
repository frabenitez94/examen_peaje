<%-- 
    Document   : voucher
    Created on : 12-12-2017, 14:38:40
    Author     : Francisco Benitez
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <div class="container">
            <%@include file="index.html" %>
            
            <span class="border border-primary">
                
               
                <h3>Pedido:<span class="badge badge-secondary"><c:out value="${pedido.id}"></c:out></span></h3>
                
                 <table class="table table-striped table-dark">
                    <thead>
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">Carretera</th>
                        <th scope="col">Cantidad</th>
                      </tr>
                    </thead>
                    <tbody>
                        <tr>
                          <th scope="row">1</th>
                          <td>Ruta 68</td>
                          <td><c:out value="${pedido.cRuta68}"></c:out></td></td>
                        </tr>
                        <tr>
                          <th scope="row">2</th>
                          <td>Ruta del Sol</td>
                          <td><c:out value="${pedido.cRutaSol}"></c:out></td></td>
                        </tr>
                        <tr>
                          <th scope="row">3</th>
                          <td>Ruta Guardia Vieja</td>
                          <td><c:out value="${pedido.cGuardaVieja}"></c:out></td>
                        </tr>
                        <tr>
                          <th scope="row">4</th>
                          <td>Troncal Sur</td>
                          <td><c:out value="${pedido.cTroncalSur}"></c:out></td>
                        </tr>
                    </tbody>
                </table>
                        <h3>Total:<span class="badge badge-secondary"><c:out value="${pedido.total}"></c:out></span></h3>
                        <br>
                        <h3>Tipo Pago:<span class="badge badge-secondary"><c:out value="${pedido.tipoPago}"></c:out></span></h3>
                        <br>
                        <h3>Tipo Retiro:<span class="badge badge-secondary"><c:out value="${pedido.tipoRetiro}"></c:out></span></h3>
            </span>
        </div>
    </body>
</html>
