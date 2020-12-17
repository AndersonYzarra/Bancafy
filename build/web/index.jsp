<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link href="css/style.css">
        <style>
            .card-title{
                color: #1E88E5;
            }
            .titulo{
                color: #1E88E5;
            }
            .img-cuentas{
                height: 100px;
                width: 100px;
                display:block;
                margin: auto;
                margin-top: 20px;
            }
        </style>
    </head>

    <body>
        
        <jsp:include page="navbar.jsp"/>
        
        <div class="container mt-4">
            <div class="card">
                <img src="img/Banner.jpg" alt=""/>
            </div>
        </div>
        <br>
    <center>
        <div class="container">  
            <h1 class="titulo text-center">Bienvenido a Bancafy </h1>
                <br>
            <div class="row ">
            
                <div class="col-sm">
                    <div class="card" style="width: 18rem;">
                            <img src="img/telefono-inteligente.png" class="img-cuentas" >
                    <div class="card-body text-center">
                        <h5 class="card-title color-blue">Abre tu cuenta digital</h5>
                        <p class="card-text text-center"><br>

                            <span class="fw-normal">Beneficio</span><br>
                            <span class="fw-light">Ahorra sin pagar mantenimiento</span><br>
                            <br>
                            <span class="fw-normal">Operaciones en ventanilla</span><br>
                            <span class="fw-light">Hasta 1 depósito en ventanilla</span><br>
                            <br>
                            <span class="fw-normal">Operaciones en Cajeros BCP y canales digitales</span><br>
                            <span class="fw-light">Ilimitado</span><br>
                            <br>
                            <span class="fw-normal">Mantenimiento</span><br>
                            <span class="fw-light">Sin costo</span><br>

                        </p>
                        <a href="Controlador?accion=digital" class="btn btn-warning">Abrela aquí</a>
                    </div>
                    </div>
                </div>
                
                <div class="col-sm">
                    <div class="card" style="width: 18rem;">
                        <img src="img/giftbox.png" class="img-cuentas">
                    <div class="card-body text-center">
                        <h5 class="card-title">Abre tu cuenta premio</h5>
                        <p class="card-text text-center"><br>

                            <span class="fw-normal">Beneficio</span><br>
                            <span class="fw-light">Podrás ganar 1 millón de soles</span><br>
                            <br>
                            <span class="fw-normal">Operaciones en ventanilla</span><br>
                            <span class="fw-light">6 depósitos y 6 retiros en ventanilla</span><br>
                            <br>
                            <span class="fw-normal">Operaciones en Cajeros BCP y canales digitales</span><br>
                            <span class="fw-light">Ilimitado</span><br>
                            <br>
                            <span class="fw-normal">Mantenimiento</span><br>
                            <span class="fw-light">Sin costo*</span><br>

                        </p>
                        <a href="Controlador?accion=premio" class="btn btn-warning">Abrela aquí</a>
                    </div>
                    </div>
                </div>
                
                <div class="col-sm">
                    <div class="card" style="width: 18rem;">
                        <img src="img/money-bag-with-dollar-symbol.png" class="img-cuentas">
                    <div class="card-body text-center">
                        <h5 class="card-title">Abre tu cuenta ilimitada</h5>
                        <p class="card-text text-center">

                            <span class="fw-normal">Beneficio</span><br>
                            <span class="fw-light">Operaciones ilimitadas  por todos los canales</span><br>
                            <br>
                            <span class="fw-normal">Operaciones en ventanilla</span><br>
                            <span class="fw-light">Operaciones Ilimitadas en ventanilla</span><br>
                            <br>
                            <span class="fw-normal">Operaciones en Cajeros BCP y canales digitales</span><br>
                            <span class="fw-light">Ilimitado</span><br>
                            <br>
                            <span class="fw-normal">Mantenimiento</span><br>
                            <span class="fw-light">S/ 12.00 o US$ 4.80 al mes</span><br>

                        </p>
                        <a href="Controlador?accion=ilimitada" class="btn btn-warning">Abrela aquí</a>
                    </div>
                    </div>
                </div>
            </div>
               
            <br>
            <p class="text-center fst-italic" style="font-size: 80%">Tarifario, condiciones y restricciones en www.viabcp.com <br>
                                              TEA REFERENCIAL: Cuentas en soles 0.123% / Cuentas en dólares: 0.123%<br>
                                              BCP Sede central. Centenario 156, La Molina 15026, Perú</p>
        </div>
        </center>
    </body>
    <jsp:include page="footer.jsp"/>
    
    <script>
  window.watsonAssistantChatOptions = {
      integrationID: "f66444a5-1f54-489a-ba3f-6a62dbadbb4b", // The ID of this integration.
      region: "us-south", // The region your integration is hosted in.
      serviceInstanceID: "905ee7e8-9802-4ad8-bbce-8d49cf3d19d6", // The ID of your service instance.
      onLoad: function(instance) { instance.render(); }
    };
  setTimeout(function(){
    const t=document.createElement('script');
    t.src="https://web-chat.global.assistant.watson.appdomain.cloud/loadWatsonAssistantChat.js";
    document.head.appendChild(t);
  });
</script>
</html>
