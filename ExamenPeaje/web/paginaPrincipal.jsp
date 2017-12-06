<%-- 
    Document   : paginaPrincipal
    Created on : 05-12-2017, 10:34:56
    Author     : Francisco Benitez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        
        
        
        form {
            border-style: inset;
            border-radius: 5px;
            border-color: #275bec;
            background-color: #275bec;
            height: 200px;
            width: 15%;
            margin: 0% 35%;
            padding: 8px 15px;
        }
        h4{
            padding: 2px 2px;
            text-align: center;
            color: white;
        }
        input[type=text]{
            text-align: center;
            color: black;
            height: 20px;
            width: 100%;
            margin: 2px 0;
        }
        input[type=submit]{
            width: 100%;
            background-color: #275bec;
            color: #ffffff;
            border-bottom-color: #ffffff;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
            margin: 2px 0;
        }
        
        input[type=submit]:hover {
            background-color: #ffffff;
        }
        
        
        
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        
    </head>
    <body>
        
        <div >
            <form action="SIngresoEmpresa" name="formularioIngreso">
                <h4>Datos Empresa</h4>
                <input type="text" name="rut" placeholder="RUT" maxlength="9" required>
                <input type="text" name="nombre" placeholder="NOMBRE">
                <input type="text" name="direccion" placeholder="DIRECCION">
                <input type="text" name="compradoPor" placeholder="COMPRADO POR">
                <input type="submit" value="Enviar">
            </form> 
        </div>
        
        
        
    </body>
</html>
