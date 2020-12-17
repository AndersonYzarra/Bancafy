<%@page import="java.util.List"%>
<%@page import="Modelo.ClienteDAO"%>
<%@page import="Modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js"> </script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js"> </script>

        <title>Cliente</title>
    </head>
    <jsp:include page="navbar.jsp" />
    <body style="height: 100%;">
        <br>
        <div style="width: 100%;">
            <div class="container mt-4" style="width: 50%; float: left;">
            <div class="card">
                <div class="card-header">
                    <h4 class="text-center">Detallade del Cliente</h4>            
                </div>
                 
                <div class="card-body">
                    <form action="Controlador" action="UserVerify">
                        <label>Nombre</label>
                        <input value="${nombreusuario}" readonly="" class="form-control">
                        <label>DNI</label>
                        <input name="dni" value="${codigousuario}" readonly="" class="form-control">
                        <label>Correo</label>
                        <input value="${correousuario}" readonly="" class="form-control">
                        <label>Contraseña</label>
                        <input name="co" type="password" id="inpPassword" pattern="^[a-zA-Z0-9]{1,100}$"  title="Introduce correctamente el parametro de Contraseña" required class="form-control">
                        <br>
                        <div class="text-center">
                            <input class="btn btn-primary" onclick="validations2()" type="submit" name="accion" value="Actualizar datos">
                        </div> 
                        <a href="index.jsp">Regresar</a>
                    </form>
                        <div class="text-center">
                            <a class="btn btn-danger" href="Controlador?accion=BorrarCuenta&id=${codigousuario}" >Borrar cuenta</a>
                        </div>
                </div>
            </div>
        </div>
                        <div class="container mt-4" style="width: 50%; float: left;">
                        <div class="card">
                            <div class="card-header">
                                <h4 class="text-center">Cuentas</h4>            
                            </div>
                            
                            <%
                                int id = Integer.parseInt((String) request.getAttribute("dni"));
                                ClienteDAO usuario = new ClienteDAO();
                                List<Cliente> c = usuario.BuscarCliente(id);
                                for (Cliente e: c){
                            %>
                            <div style="margin-left: 25%;margin-bottom: 2%;margin-top: 2%;padding: 3% ;width: 50%;padding-left: 5%; background-color: #4D8DEA; color: white; border-radius: 4%;">
                                    <img src="https://stbcpzonasegura.viabcp.com/assets/img/logo.svg" style="width: 20%; margin-bottom: 2%;">
                                <p><%= e.getNombre()%> <%= e.getApellido() %></p>
                                <%
                                        int min1=10000000;
                                        int min2=10000000;
                                        int max1=99999999;
                                        int max2=99999999;
                                        int dia_min=1;
                                        int dia_max=31;
                                        int mes_min=1;
                                        int mes_max=12;
                                        int range1 = max1 - min1 + 1; 
                                        int range2 = max2 - min2 + 1;
                                        int range3 = dia_max - dia_min + 1;
                                        int range4 = mes_max - mes_min + 1;
                                        int rand1 = (int)(Math.random() * range1) + min1;
                                        int rand2 = (int)(Math.random() * range2) + min2;
                                        int rand3 = (int)(Math.random() * range3) + dia_min;
                                        int rand4 = (int)(Math.random() * range4) + mes_min;%> 
                                        <p><%=rand1%><%=rand2%></p>
                                <p><%=rand3%>/<%=rand4%></p>
                                <%
                                    String mj = "";
                                    if(e.getId_tipo()==1){
                                        mj ="Cueta Digital";
                                    }
                                    if(e.getId_tipo()==2){
                                        mj ="Cueta Premio";
                                    }
                                    if(e.getId_tipo()==3){
                                        mj ="Cueta Ilimitada";
                                    }
                                %>
                                <p><%= mj %></p>
                                </div>
                        <div class="text-center">
                            <a class="btn btn-danger" href="Controlador?accion=BorrarCliente&id_cli=<%= e.getId() %>" style="margin-bottom: 2%;" >Borrar cuenta</a>
                        </div>
                            <%}%>
        </div>        
        </div>
        </div>
        <script src="js/alertas.js" type="text/javascript"></script>
        
         <script>
            function validations2()
            {
               var nombr =document.getElementById('inpNombre').value;
               var dn = document.getElementById('inpDNI').value;
               var corre =document.getElementById('inpCorreo').value;
               var contra =document.getElementById('inpPassword').value;
               var nombrRGEX = /^([A-Z]{1}[a-z ]+[]?){1,3}$/;
               var dnRGEX = /^[0-9]{8}$/;
               var correRGEX = /^([a-z0-9_\.\+-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
               var contraRGEX = /^[a-zA-Z0-9]{1,100}$/;
               var nombrResult = nombrRGEX.test(nombr);
               var dnResult = dnRGEX.test(dn);
               var correResult = correRGEX.test(corre);
               var contraResult = contraRGEX.test(contra);
              
                if(nombrResult == false)
                {
                    swal("Oops...", "Introduce correctamente el parametro de Nombre", "error");
                    return false;
                }
                 if (dnResult == false) 
                {
                    swal("Oops...", "Introduce correctamente el parametro de DNI", "error");
                    
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
                   swal("Good job!", "Perfil Completado con Exito", "success");
                }
            }
            
        </script>
        
    </body>
    <br>
    
    <br>
</html>

