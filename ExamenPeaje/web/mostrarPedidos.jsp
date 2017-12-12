<%-- 
    Document   : mostrarPedidos
    Created on : 12-12-2017, 14:38:32
    Author     : Francisco Benitez
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar pedidos</title>
    </head>
    <body>
        
        <div class="container">
        
        <%@include file="index.html" %>
         <div class="form-group">
            <label for="exampleFormControlSelect1">Empresa: </label>
            <form action="SConsultaMostrar">
                    <select name="rut" class="form-control" id="exampleFormControlSelect1">
                        <c:forEach var="empresa" items="${listaEmpresa}">
                            <option value="${empresa.rut}"><c:out value="${empresa.nombre}"></c:out></option>
                        </c:forEach>
                    </select>
                    <div class="col-sm">
                        <br><button class="btn btn-lg btn-primary btn-block" type="submit">Consultar</button>
                        </div>
                </form>
            </div>
        
        <table class="table table-striped table-dark">
                    <thead>
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">Pedido</th>
                        <th scope="col">Total</th>
                      </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <c:forEach var="pedido" items="${listaPedido}">
                          <th scope="row">${pedido.id}</th>
                          <td>${pedido.Descripcion}</td>
                          <td>${pedido.total}</td></td>
                          </c:forEach>
                        </tr>
                    </tbody>
                </table>
        </div>
        
    </body>
</html>
