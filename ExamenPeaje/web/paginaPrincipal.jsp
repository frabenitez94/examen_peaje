<%-- 
    Document   : paginaPrincipal
    Created on : 05-12-2017, 10:34:56
    Author     : Francisco Benitez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap core CSS -->
    <link href="https://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="http://getbootstrap.com/docs/4.0/examples/starter-template/starter-template.css" rel="stylesheet">
        
        
    </head>
    <body>
        
        
            <form action="SIngresoEmpresa" name="formularioIngreso">
                <div class="page-header">
                    <h4>Datos Empresa</h4>  
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-sm">
                            <input type="text" name="rut" placeholder="RUT" maxlength="9" required>
                            <input type="text" name="nombre" placeholder="NOMBRE">
                            <input type="text" name="direccion" placeholder="DIRECCION">
                            <input type="text" name="compradoPor" placeholder="COMPRADO POR">
                        </div>
                        <div class="col-sm">
                            <input type="radio" name="optPago" value="Transferencia" checked> Transferencia<br>
                            <input type="radio" name="optPago" value="Pago en linea"> Pago en linea<br>
                            <input type="radio" name="optPago" value="Orden de compra"> Orden de comprea<br>
                        </div>
                        <div class="col-sm">
                            <input type="radio" name="optRetiro" value="Oficina" checked> Oficina<br>
                            <input type="radio" name="optRetiro" value="Envio Cliente"> Envio Cliente
                         </div>

                        
                    </div>
                </div>
                <table class="table table-striped table-dark">
                    <thead>
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">Carretera</th>
                        <th scope="col">Cantidad</th>
                        <th scope="col">    </th>
                      </tr>
                    </thead>
                    <tbody>
                        <tr>
                          <th scope="row">1</th>
                          <td>Ruta 68</td>
                          <td><input type="text" name="cantidadRuta68"></td></td>
                        </tr>
                        <tr>
                          <th scope="row">2</th>
                          <td>Ruta del Sol</td>
                          <td><input type="text" name="cantidadRutaDelSol"></td></td>
                        </tr>
                        <tr>
                          <th scope="row">3</th>
                          <td>Ruta Guardia Vieja</td>
                          <td><input type="text" name="cantidadRutaGuardiaVieja"></td>
                        </tr>
                        <tr>
                          <th scope="row">4</th>
                          <td>Troncal Sur</td>
                          <td><input type="text" name="cantidadTroncalSur"></td>
                        </tr>
                    </tbody>
                </table>
                
            
                
                <div class="col-sm">
                            <input type="submit" value="Enviar">
                </div>
                
            </form> 
        
        
        
        
    </body>
</html>
