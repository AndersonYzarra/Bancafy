<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Merienda+One">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
            <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
            
            <style>
                .text1{
                    color: #C15111;
                }
            </style>
    </head>
    <body>
        
        <jsp:include page="navbar.jsp" />
        
    
  <div class="row content pl-4">
    <div class="col-sm-3">
       <div class="container mt-4 ml-4">
                <div class="card ml-4" >
                    <div class="card-body"><br>
        <h1>Hola, soy Bancabototra vez!</h1>
        <p>A continuacion pulsa Empezar y selecciona la opcion adecuada para cada pregunta:</p>
        
        <form method="post" action="ChatBot">
            
              <div class="form-group">
                <label for="respuesta">Opciones</label>
                <select name="valor" class="form-control" id="respuesta">
                  <option value="1">Positivo</option>
                  <option value="2">Neutro</option>
                  <option value="3">Negativo</option>
                </select>
              </div>
            <br>
            <button type="submit" class="btn btn-primary" name="respuesta" value="Enviar">Enviar</button>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <p><%out.print(request.getAttribute("resu"));%></p>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <button type="submit" class="btn btn-primary" value="Enviar">Empezar</button>
        </form>
                 </div> 
              </div> 
        </div>
    </div>
    <div class="col-sm-9">
      <div class="container mt-4">
                <div class="card">
                    <div class="card-body">
                        
                        <h4 class="text1"><%out.print(request.getAttribute("res"));%> </h4>
                        <img src="img/bot.jpg">
                        
                    </div>
                </div>
       </div>
    </div>
  </div>

<br>
        <br>
        <jsp:include page="footer.jsp" />   

        
        
    </body>
</html>
