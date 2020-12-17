<%-- 
    Document   : PreRegistro
    Created on : 13/12/2020, 06:47:58
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js"> </script>
    <style>
        .capcha{ height: 60px;  
                weight: 60px;
        }
    </style>
    </head>
    <body>
    <jsp:include page="navbar.jsp" />
    
       
        <form action="UserVerify" method="post">
            
            
           <br>
            <br>
             <br>
             
              <br>
               <br>
               
               <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info text-center">
                    <h4 class="text-white">Verificacion de Email</h4>
                </div>
                <div class="card-body">
                    <form action="UserVerify" method="POST">
                        <input hidden="" name="id_cuenta" value="${idSimple}">
                        
                        <label>Codigo Capcha:</label> 
                        <img class="capcha" src="img/captcha.png" alt=""/>
                        <br>
                        <br>
                        <input type="text" id="inpCapcha"   title="Error al Introducir el Capcha" required name="username" class="form-control" >
                        <label>Correo Electronico:</label>
                        <input type="text" id="inpCorreo"   title="Error al Introducir el Correo Electronico" required name="useremail" class="form-control" >
                        <br>
                        <div class="row justify-content-center h-100">
                            <input type="submit" onclick="validations2()" value="Registrar" class="btn btn-success">
                        </div>
                        <a class="text-info" href="index.jsp">Regresar</a>
                    </form>
                </div>
            </div>
        </div>

           <br>
            <br>
             <br>
              <br>
              
        </form>
     
                        <script>
            function validations2()
            {
               var capch = document.getElementById('inpCapcha').value;
               var corre=document.getElementById('inpCorreo').value;
               var capchRGEX = /^[7]+[d]+[7]+[y]+[g]+[y]$/;
               var correRGEX = /^([a-z0-9_\.\+-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
               var capchResult = capchRGEX.test(capch);
               var correResult = correRGEX.test(corre);
              
                 if (capchResult == false) 
                {
                    swal("Oops...", "Error al Introducir el Capcha", "error");
                    
                    return false;
                }
                  if(correResult == false)
                {
                    swal("Oops...", "Error al Introducir el Correo Electronico", "error");
                    return false;
                }
                else
                {
                   swal("Good job!", "Pre Registro correcto", "success");
                }
            }
            
        </script>
    </body>
    
    <jsp:include page="footer.jsp" />

