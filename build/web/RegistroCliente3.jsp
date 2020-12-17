<%-- 
    Document   : RegistroCliente
    Created on : 2/12/2020, 05:53:18
    Author     : Anderson
--%>

<%@page import="Modelo.ClienteCRUD"%>
<%@page import="Modelo.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <title>Cliente</title>
    </head>
     <style>
        .card{
            width: 100%;
            max-width: 500px;
            margin: auto;
        }
        .card-header{
            background-color: #3c3939 !important;
            color: #fff;
        }
    </style>
    
    <jsp:include page="navbar.jsp" />
    <body>
        <br>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <h4 class="text-center">Apertura de cuenta Ilimitada</h4>            
                </div>
                <div class="card-body">
                    <form action="Controlador" action="UserVerify">
                        <label>Nombre</label>
                        <input type="text" id="inpNombre" pattern="^([A-Z]{1}[a-z ]+[]?){1,3}$"  title="Error al Introducir correctamente el parametro de Nombre" required name="nombre" class="form-control">
                        <label>Apellido</label>
                        <input type="text" id="inpApellido" pattern="^([A-Z]{1}[a-z ]+[]?){1,3}$"  title="Error al Introducir correctamente el parametro de Apellido" required name="apellido" class="form-control">
                        <label>DNI</label>
                        <input type="text" id="inpDNI" pattern="^[0-9]{8}$"  title="Error al Introducir correctamente el parametro de DNI" required name="dni" class="form-control">
                        <label>Correo</label>
                        <input type="text" id="inpCorreo" pattern="^([a-z0-9_\.\+-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$"  title="Error al Introducir correctamente el parametro de Correo Electronico" required  name="correo" class="form-control">
                        <label>Direccion</label>
                        <input type="text" id="inpDireccion" pattern="^([a-zA-Z0-9 ]+[]?){1,100}$"  title="Error al Introducir correctamente el parametro de Direccion" required  name="direccion" class="form-control">
                        <label>Telefono</label>
                        <input type="text" id="inpTelefono" pattern="^[9]+[0-9]{8}$"  title="Error al Introducir correctamente el parametro de Telefono" required  name="telefono" class="form-control">
                        <label>Ocupacion</label>
                        <input type="text" id="inpOcupacion" pattern="^([a-zA-Z ]+[]?){1,100}$"  title="Error al Introducir correctamente el parametro de Ocupacion" required name="ocupacion" class="form-control">
                        <br>
                        <div class="text-center">
                            <input class="btn btn-primary" type="submit" name="accion" value="Crear cuenta ilimitada">
                        </div>   
                        <a href="Controlador?accion=Usuario">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
        <script src="js/alertas.js" type="text/javascript"></script>
    </body>
    <br>
    <br>
    <jsp:include page="footer.jsp" />
</html>
