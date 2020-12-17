package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PreRegistro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js\"> </script>\n");
      out.write("    <style>\n");
      out.write("        .capcha{ height: 60px;  \n");
      out.write("                weight: 60px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("       \n");
      out.write("        <form action=\"UserVerify\" method=\"post\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <br>\n");
      out.write("            <br>\n");
      out.write("             <br>\n");
      out.write("             \n");
      out.write("              <br>\n");
      out.write("               <br>\n");
      out.write("               \n");
      out.write("               <div class=\"container mt-4 col-lg-4\">\n");
      out.write("            <div class=\"card border-info\">\n");
      out.write("                <div class=\"card-header bg-info text-center\">\n");
      out.write("                    <h4 class=\"text-white\">Verificacion de Email</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"UserVerify\" method=\"POST\">\n");
      out.write("                        <input hidden=\"\" name=\"id_cuenta\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSimple}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        \n");
      out.write("                        <label>Codigo Capcha:</label> \n");
      out.write("                        <img class=\"capcha\" src=\"img/captcha.png\" hidden=\"\" alt=\"\"/>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" id=\"inpCapcha\"   title=\"Error al Introducir el Capcha\" required name=\"username\" class=\"form-control\" >\n");
      out.write("                        <label>Correo Electronico:</label>\n");
      out.write("                        <input type=\"text\" id=\"inpCorreo\"   title=\"Error al Introducir el Correo Electronico\" required name=\"useremail\" class=\"form-control\" >\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"row justify-content-center h-100\">\n");
      out.write("                            <input type=\"submit\" onclick=\"validations2()\" value=\"Registrar\" class=\"btn btn-success\">\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"text-info\" href=\"index.jsp\">Regresar</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("           <br>\n");
      out.write("            <br>\n");
      out.write("             <br>\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("        </form>\n");
      out.write("     \n");
      out.write("                        <script>\n");
      out.write("            function validations2()\n");
      out.write("            {\n");
      out.write("               var capch = document.getElementById('inpCapcha').value;\n");
      out.write("               var corre=document.getElementById('inpCorreo').value;\n");
      out.write("               var capchRGEX = /^[7]+[d]+[7]+[y]+[g]+[y]$/;\n");
      out.write("               var correRGEX = /^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\n");
      out.write("               var capchResult = capchRGEX.test(capch);\n");
      out.write("               var correResult = correRGEX.test(corre);\n");
      out.write("              \n");
      out.write("                 if (capchResult == false) \n");
      out.write("                {\n");
      out.write("                    swal(\"Oops...\", \"Error al Introducir el Capcha\", \"error\");\n");
      out.write("                    \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                  if(correResult == false)\n");
      out.write("                {\n");
      out.write("                    swal(\"Oops...\", \"Error al Introducir el Correo Electronico\", \"error\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                   swal(\"Good job!\", \"Pre Registro correcto\", \"success\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\n');
      out.write('\n');
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
