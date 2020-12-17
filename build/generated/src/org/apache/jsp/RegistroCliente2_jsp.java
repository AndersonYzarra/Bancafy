package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.ClienteCRUD;
import Modelo.ClienteDAO;

public final class RegistroCliente2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Cliente</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("     <style>\n");
      out.write("        .card{\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 500px;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        .card-header{\n");
      out.write("            background-color: #3c3939 !important;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <h4 class=\"text-center\">Apertura de cuenta Premio</h4>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"Controlador\" action=\"UserVerify\">\n");
      out.write("                        <label>Nombre</label>\n");
      out.write("                        <input type=\"text\" id=\"inpNombre\" pattern=\"^([A-Z]{1}[a-z ]+[]?){1,3}$\"  title=\"Error al Introducir correctamente el parametro de Nombre\" required name=\"nombre\" class=\"form-control\">\n");
      out.write("                        <label>Apellido</label>\n");
      out.write("                        <input type=\"text\" id=\"inpApellido\" pattern=\"^([A-Z]{1}[a-z ]+[]?){1,3}$\"  title=\"Error al Introducir correctamente el parametro de Apellido\" required name=\"apellido\" class=\"form-control\">\n");
      out.write("                        <label>DNI</label>\n");
      out.write("                        <input type=\"text\" id=\"inpDNI\" pattern=\"^[0-9]{8}$\"  title=\"Error al Introducir correctamente el parametro de DNI\" required name=\"dni\" class=\"form-control\">\n");
      out.write("                        <label>Correo</label>\n");
      out.write("                        <input type=\"text\" id=\"inpCorreo\" pattern=\"^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$\"  title=\"Error al Introducir correctamente el parametro de Correo Electronico\" required  name=\"correo\" class=\"form-control\">\n");
      out.write("                        <label>Direccion</label>\n");
      out.write("                        <input type=\"text\" id=\"inpDireccion\" pattern=\"^([a-zA-Z0-9 ]+[]?){1,100}$\"  title=\"Error al Introducir correctamente el parametro de Direccion\" required  name=\"direccion\" class=\"form-control\">\n");
      out.write("                        <label>Telefono</label>\n");
      out.write("                        <input type=\"text\" id=\"inpTelefono\" pattern=\"^[9]+[0-9]{8}$\"  title=\"Error al Introducir correctamente el parametro de Telefono\" required  name=\"telefono\" class=\"form-control\">\n");
      out.write("                        <label>Ocupacion</label>\n");
      out.write("                        <input type=\"text\" id=\"inpOcupacion\" pattern=\"^([a-zA-Z ]+[]?){1,100}$\"  title=\"Error al Introducir correctamente el parametro de Ocupacion\" required name=\"ocupacion\" class=\"form-control\">\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"Crear cuenta premio\">\n");
      out.write("                        </div>   \n");
      out.write("                        <a href=\"Controlador?accion=Usuario\">Regresar</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/alertas.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</html>\n");
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
