
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel="stylesheet" href="css/noticia.css"/>
        <title>JSP Page</title>
    </head>
    <jsp:include page="navbar.jsp" />
    <body>
        <header>
            <div class="bg_image">
                <div class="container">
                    <h2>Noticias</h2>
                    <span>Toda la información que necesitas en un solo lugar</span>
                </div>
            </div>
        </header>
        <section class="my-4">
            <div class="container">
                <h4>Te Puede Interesar</h4>
                <p>Te damos a conocer cómo solicitar nuestros productos en simples pasos</p>
                <div class="row">
                    <div class="card_sect">
                        <div class="imagen_card">
                            
                        </div>
                        <div class="container">
                            <h4>
                                Te enseñamos a usar nuestros Canales Digitales
                            </h4>
                            <p>
                                Agenda tu llamada con nuestros entrenadores digitales y te ayudarán en el uso de las aplicaciones Banca Móvil, Yape y Banca por Internet.
                            </p>
                        </div>
                    </div>
                    <div class="card_sect">
                        <div class="imagen_card img_2">
                            
                        </div>
                        <div class="container">
                            <h4>
                                Obtén tus Productos al instante
                            </h4>
                            <p>
                                Te mostramos cómo puedes obtener tus productos de manera segura y desde la comodidad de tu hogar.
                            </p>
                        </div>                        
                    </div>
                    <div class="card_sect">
                        <div class="imagen_card img_1">
                            
                        </div>  
                        <div class="container">
                            <h4>
                                Consejos para tu seguridad  
                            </h4>
                            <p>
                                Conoce los mejores tips y consejos para evitar ser víctima de fraude digital.   
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script src="js/alertas.js" type="text/javascript"></script>
    </body>
    <jsp:include page="footer.jsp" />
</html>
