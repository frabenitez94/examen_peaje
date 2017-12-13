<%-- 
    Document   : mostrarPedidos
    Created on : 12-12-2017, 14:38:32
    Author     : Francisco Benitez
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            <form action="SConsultaPedido">
                
                    <select name="rut" class="form-control" id="exampleFormControlSelect1">
                        <c:forEach var="empresas" items="${listaEmpresa}">
                    
                                <option value="${empresas.rut}"><c:out value="${empresas.nombreEmpresa}"></c:out></option><br>
                        
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
                        <th scope="col">Comprador</th>
                        <th scope="col">Total</th>
                      </tr>
                    </thead>
                    <tbody>
                         <c:if test="${not empty listaPedido}">
                                 
                                    <c:forEach var="pedido" items="${listaPedido}">
                         <tr>
                            
                                        <th scope="row">
                                            <c:out value="${pedido.id}"></c:out>
                                        </th>
                                        <td><%--id pedido --%>
                                            <c:out value="${pedido.comprador}"></c:out>
                                        </td>
                                        <td><%-- total --%>
                                            <c:out value="${pedido.total}"></c:out>
                                        </td></td><br>
                                    </c:forEach>
                                
                            
                        </tr>
                        </c:if>
                                
                        </tbody>
                    </table>
                                <c:if test="${empty listaPedidos}">
                                    <h3>La empresa no tiene pedidos :<span class="badge badge-secondary">null</span></h3>
                                </c:if>
         
        </div>
        
    </body>
</html>
