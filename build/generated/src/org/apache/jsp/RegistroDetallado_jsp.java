package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Usuario;
import Modelo.UsuarioDAO;

public final class RegistroDetallado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"height: 100%\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro Detallado</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"../css/estilos_login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js\"> </script>\n");
      out.write("    </head>\n");
      out.write("    <nav>\n");
      out.write("        <img style=\"width: 8%; margin: 1%; margin-left: 5%;\" src=\"img/logo-1.png\">\n");
      out.write("    </nav>\n");
      out.write("    <body style=\"width: 100%; margin-left: 0px; margin-top: 0px; height: 100%; font-family: 'Montserrat', sans-serif;\">\n");
      out.write("        <span>\n");
      out.write("        <div style=\"width: 50%; float: left; background: #002D87; height: 100%; color: white; padding-left: 9%; padding-right: 8%;padding-top: 5%;\">\n");
      out.write("            <h1 style=\"font-size: 350%; font-weight: bold;\">Abre tu cuenta web con nosotros</h1>\n");
      out.write("            <p>¡Ábrela en sencillos pasos! Solo ingresando tus datos</p>\n");
      out.write("            <div style=\"width: 100%;  margin-top: 10%;\">\n");
      out.write("                <div style=\"width: 20%; float: left;\">\n");
      out.write("                    <img style=\"width: 50%; margin-left: 10%;\" src=\"https://interbank.pe/halcon-renovacion-theme/images/halcon/form-framework/icon/cero-costo.png\">\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width: 70%;\">\n");
      out.write("                    <h5 style=\"color: #ff7800;\">Cero Costo</h5>\n");
      out.write("                    <p style=\"font-size: 90%;\">Sin costos adicionales.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 100%; margin-top: 8%;\">\n");
      out.write("                <div style=\"width: 20%; float: left; margin-top: 3%;\">\n");
      out.write("                    <img style=\"width: 50%; margin-left: 10%;\" src=\"https://interbank.pe/halcon-renovacion-theme/images/halcon/form-framework/icon/cajero.png\">\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width: 100%;\">\n");
      out.write("                    <h5 style=\"color: #ff7800; \">Cajeros Global Net</h5>\n");
      out.write("                    <p style=\"font-size: 90%;\">Realiza tus operaciones sin costo en la red una vez apertures la cuenta que deseas.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </span>\n");
      out.write("        <div style=\"width: 50%; float: right; background-color: #f7f7f7;height: 100%; padding-top: 7%;\">\n");
      out.write("            <form action=\"Controlador\"  style=\"width: 80%; margin-left: 15%;\">\n");
      out.write("                        <h3>Ingresa tus datos </h3>\n");
      out.write("                        <div style=\"width: 50%; float: left; margin-top: 10%;\">\n");
      out.write("                        <label style=\"padding-bottom: 3%; color: #a6a6a6;\">DNI</label>\n");
      out.write("                        <input type=\"text\" id=\"inpDNI\" pattern=\"^[0-9]{8}$\"  title=\"Introduce correctamente el parametro de DNI\" required  name=\"DNI\" class=\"form-control\" style=\"width: 50%; border-color: #e8e8e8;\">\n");
      out.write("                        <br><label style=\"padding-bottom: 3%; color: #a6a6a6;\">Nombre</label>\n");
      out.write("                        <input type=\"text\" id=\"inpNombre\" pattern=\"^([A-Z]{1}[a-z ]+[]?){1,3}$\"  title=\"Introduce correctamente el parametro de Nombre\" required name=\"nombre\" class=\"form-control\" style=\"width: 80%; border-color: #e8e8e8;\">\n");
      out.write("                        </div><div style=\"width: 50%; float: right;  margin-top: 5.5%;\">\n");
      out.write("                        <br><label style=\"padding-bottom: 3%; color: #a6a6a6;\">Correo</label>\n");
      out.write("                        <input type=\"text\" id=\"inpCorreo\" pattern=\"^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$\"  title=\"Introduce correctamente el parametro de Correo Electronico\" required name=\"correo\" class=\"form-control\" style=\"width: 80%; border-color: #e8e8e8;\">\n");
      out.write("                        <br><label style=\"padding-bottom: 3%; color: #a6a6a6;\">Contraseña</label>\n");
      out.write("                        <input name=\"co\" type=\"password\" id=\"inpPassword\" pattern=\"^[a-zA-Z0-9]{1,100}$\"  title=\"Introduce correctamente el parametro de Contraseña\" required class=\"form-control\" style=\"width: 80%; border-color: #e8e8e8;\">\n");
      out.write("                        </div><br><br>\n");
      out.write("                        <button type=\"submit\" onclick=\"validations2()\" value=\"Registrar\" name=\"accion\" class=\"btn btn-primary btn-block btn-lg\" style=\"background-color: #ff7800; border-width: 0px; margin-top: 10%;\">Registrar</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function validations2()\n");
      out.write("            {\n");
      out.write("               var dn = document.getElementById('inpDNI').value;\n");
      out.write("               var nombr =document.getElementById('inpNombre').value;\n");
      out.write("               var corre =document.getElementById('inpCorreo').value;\n");
      out.write("               var contra =document.getElementById('inpPassword').value;\n");
      out.write("               var dnRGEX = /^[0-9]{8}$/;\n");
      out.write("               var nombrRGEX = /^([A-Z]{1}[a-z ]+[]?){1,3}$/;\n");
      out.write("               var correRGEX = /^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\n");
      out.write("               var contraRGEX = /^[a-zA-Z0-9]{1,100}$/;\n");
      out.write("               var dnResult = dnRGEX.test(dn);\n");
      out.write("               var nombrResult = nombrRGEX.test(nombr);\n");
      out.write("               var correResult = correRGEX.test(corre);\n");
      out.write("               var contraResult = contraRGEX.test(contra);\n");
      out.write("              \n");
      out.write("                 if (dnResult == false) \n");
      out.write("                {\n");
      out.write("                    swal(\"Oops...\", \"Introduce correctamente el parametro de DNI\", \"error\");\n");
      out.write("                    \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                  if(nombrResult == false)\n");
      out.write("                {\n");
      out.write("                    swal(\"Oops...\", \"Introduce correctamente el parametro de Nombre\", \"error\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                  if(correResult == false)\n");
      out.write("                {\n");
      out.write("                    swal(\"Oops...\", \"Introduce correctamente el parametro de Correo Electronico\", \"error\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                  if(contraResult == false)\n");
      out.write("                {\n");
      out.write("                    swal(\"Oops...\", \"Introduce correctamente el parametro de Contraseña\", \"error\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                   swal(\"Good job!\", \"Registro Detallado Completado con Exito\", \"success\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
