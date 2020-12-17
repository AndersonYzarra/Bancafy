  <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verify Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
     <jsp:include page="navbar.jsp" />
        <body>
           <br>
           <br>
           <br>
           <br>
           <br>
    
     <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info text-center">
                    <h4 class="text-white">Se ha enviado un correo de confirmacion.</h4>
                </div>
                <div class="card-body">
                    <form action="VerifyCode"  method="POST">
                        <input  name="id_cuenta" hidden="" value="${id_cuenta}">
                        <label>Codigo de confirmación:</label>
                        <input type="text" name="authcode" class="form-control" >
                        <br>
                        <div class="row justify-content-center h-100">
                            <input type="submit" value="Verificar" class="btn btn-success">
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
            <br>
            <br>
            <br>
            <br>
    </body>
    <jsp:include page="footer.jsp" />
</html>

  
