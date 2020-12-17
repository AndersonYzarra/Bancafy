package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class chatbot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Merienda+One\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("            \n");
      out.write("            <style>\n");
      out.write("                .text1{\n");
      out.write("                    color: #C15111;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("    \n");
      out.write("  <div class=\"row content pl-4\">\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("       <div class=\"container mt-4 ml-4\">\n");
      out.write("                <div class=\"card ml-4\" >\n");
      out.write("                    <div class=\"card-body\"><br>\n");
      out.write("        <h1>Hola, soy Bancabototra vez!</h1>\n");
      out.write("        <p>A continuacion pulsa Empezar y selecciona la opcion adecuada para cada pregunta:</p>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"ChatBot\">\n");
      out.write("            \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"respuesta\">Opciones</label>\n");
      out.write("                <select name=\"valor\" class=\"form-control\" id=\"respuesta\">\n");
      out.write("                  <option value=\"1\">Positivo</option>\n");
      out.write("                  <option value=\"2\">Neutro</option>\n");
      out.write("                  <option value=\"3\">Negativo</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("            <br>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\" name=\"respuesta\" value=\"Enviar\">Enviar</button>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <p>");
out.print(request.getAttribute("resu"));
      out.write("</p>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\" value=\"Enviar\">Empezar</button>\n");
      out.write("        </form>\n");
      out.write("                 </div> \n");
      out.write("              </div> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-9\">\n");
      out.write("      <div class=\"container mt-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        \n");
      out.write("                        <h4 class=\"text1\">");
out.print(request.getAttribute("res"));
      out.write(" </h4>\n");
      out.write("                        <img src=\"img/bot.jpg\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("        <br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("   \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
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
