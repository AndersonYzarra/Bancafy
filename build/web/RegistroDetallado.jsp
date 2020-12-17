<%-- 
    Document   : RegistroDetallado
    Created on : 13/12/2020, 03:27:53 AM
    Author     : ADMIN
--%>

<%@page import="Modelo.Usuario"%>
<%@page import="Modelo.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Detallado</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link href="../css/estilos_login.css" rel="stylesheet" type="text/css"/>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js"> </script>
    </head>
    <nav>
        <img style="width: 8%; margin: 1%; margin-left: 5%;" src="img/logo-1.png">
    </nav>
    <body style="width: 100%; margin-left: 0px; margin-top: 0px; height: 100%; font-family: 'Montserrat', sans-serif;">
        <span>
        <div style="width: 50%; float: left; background: #002D87; height: 100%; color: white; padding-left: 9%; padding-right: 8%;padding-top: 5%;">
            <h1 style="font-size: 350%; font-weight: bold;">Abre tu cuenta web con nosotros</h1>
            <p>¡Ábrela en sencillos pasos! Solo ingresando tus datos</p>
            <div style="width: 100%;  margin-top: 10%;">
                <div style="width: 20%; float: left;">
                    <img style="width: 50%; margin-left: 10%;" src="https://interbank.pe/halcon-renovacion-theme/images/halcon/form-framework/icon/cero-costo.png">
                </div>
                <div style="width: 70%;">
                    <h5 style="color: #ff7800;">Cero Costo</h5>
                    <p style="font-size: 90%;">Sin costos adicionales.</p>
                </div>
            </div>
            <div style="width: 100%; margin-top: 8%;">
                <div style="width: 20%; float: left; margin-top: 3%;">
                    <img style="width: 50%; margin-left: 10%;" src="https://interbank.pe/halcon-renovacion-theme/images/halcon/form-framework/icon/cajero.png">
                </div>
                <div style="width: 100%;">
                    <h5 style="color: #ff7800; ">Cajeros Global Net</h5>
                    <p style="font-size: 90%;">Realiza tus operaciones sin costo en la red una vez apertures la cuenta que deseas.</p>
                </div>
            </div>
        </div>
        </span>
        <div style="width: 50%; float: right; background-color: #f7f7f7;height: 100%; padding-top: 7%;">
            <form action="Controlador"  style="width: 80%; margin-left: 15%;">
                        <h3>Ingresa tus datos </h3>
                        <div style="width: 50%; float: left; margin-top: 10%;">
                        <label style="padding-bottom: 3%; color: #a6a6a6;">DNI</label>
                        <input type="text" id="inpDNI" pattern="^[0-9]{8}$"  title="Introduce correctamente el parametro de DNI" required  name="DNI" class="form-control" style="width: 50%; border-color: #e8e8e8;">
                        <br><label style="padding-bottom: 3%; color: #a6a6a6;">Nombre</label>
                        <input type="text" id="inpNombre" pattern="^([A-Z]{1}[a-z ]+[]?){1,3}$"  title="Introduce correctamente el parametro de Nombre" required name="nombre" class="form-control" style="width: 80%; border-color: #e8e8e8;">
                        </div><div style="width: 50%; float: right;  margin-top: 5.5%;">
                        <br><label style="padding-bottom: 3%; color: #a6a6a6;">Correo</label>
                        <input type="text" id="inpCorreo" pattern="^([a-z0-9_\.\+-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$"  title="Introduce correctamente el parametro de Correo Electronico" required name="correo" class="form-control" style="width: 80%; border-color: #e8e8e8;">
                        <br><label style="padding-bottom: 3%; color: #a6a6a6;">Contraseña</label>
                        <input name="co" type="password" id="inpPassword" pattern="^[a-zA-Z0-9]{1,100}$"  title="Introduce correctamente el parametro de Contraseña" required class="form-control" style="width: 80%; border-color: #e8e8e8;">
                        </div><br><br>
                        <button type="submit" onclick="validations2()" value="Registrar" name="accion" class="btn btn-primary btn-block btn-lg" style="background-color: #ff7800; border-width: 0px; margin-top: 10%;">Registrar</button>
            </form>
        </div>
        <script>
            function validations2()
            {
               var dn = document.getElementById('inpDNI').value;
               var nombr =document.getElementById('inpNombre').value;
               var corre =document.getElementById('inpCorreo').value;
               var contra =document.getElementById('inpPassword').value;
               var dnRGEX = /^[0-9]{8}$/;
               var nombrRGEX = /^([A-Z]{1}[a-z ]+[]?){1,3}$/;
               var correRGEX = /^([a-z0-9_\.\+-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
               var contraRGEX = /^[a-zA-Z0-9]{1,100}$/;
               var dnResult = dnRGEX.test(dn);
               var nombrResult = nombrRGEX.test(nombr);
               var correResult = correRGEX.test(corre);
               var contraResult = contraRGEX.test(contra);
              
                 if (dnResult == false) 
                {
                    swal("Oops...", "Introduce correctamente el parametro de DNI", "error");
                    
                    return false;
                }
                  if(nombrResult == false)
                {
                    swal("Oops...", "Introduce correctamente el parametro de Nombre", "error");
                    return false;
                }
                  if(correResult == false)
                {
                    swal("Oops...", "Introduce correctamente el parametro de Correo Electronico", "error");
                    return false;
                }
                  if(contraResult == false)
                {
                    swal("Oops...", "Introduce correctamente el parametro de Contraseña", "error");
                    return false;
                }
                else
                {
                   swal("Good job!", "Registro Detallado Completado con Exito", "success");
                }
            }
            
        </script>
    </body>
</html>


