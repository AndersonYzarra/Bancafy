package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>index</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\">\n");
      out.write("        <style>\n");
      out.write("            .card-title{\n");
      out.write("                color: #1E88E5;\n");
      out.write("            }\n");
      out.write("            .titulo{\n");
      out.write("                color: #1E88E5;\n");
      out.write("            }\n");
      out.write("            .img-cuentas{\n");
      out.write("                height: 100px;\n");
      out.write("                width: 100px;\n");
      out.write("                display:block;\n");
      out.write("                margin: auto;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("            <img src=\"img/slider.png\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">  \n");
      out.write("            <h1 class=\"titulo text-center\">Bienvenido a Bancafy Usuario</h1>\n");
      out.write("                <br>\n");
      out.write("            <div class=\"row \">\n");
      out.write("            \n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                            <img src=\"img/telefono-inteligente.png\" class=\"img-cuentas\" >\n");
      out.write("                    <div class=\"card-body text-center\">\n");
      out.write("                        <h5 class=\"card-title color-blue\">Abre tu cuenta digital</h5>\n");
      out.write("                        <p class=\"card-text text-center\"><br>\n");
      out.write("\n");
      out.write("                            <span class=\"fw-normal\">Beneficio</span><br>\n");
      out.write("                            <span class=\"fw-light\">Ahorra sin pagar mantenimiento</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Operaciones en ventanilla</span><br>\n");
      out.write("                            <span class=\"fw-light\">Hasta 1 depósito en ventanilla</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Operaciones en Cajeros BCP y canales digitales</span><br>\n");
      out.write("                            <span class=\"fw-light\">Ilimitado</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Mantenimiento</span><br>\n");
      out.write("                            <span class=\"fw-light\">Sin costo</span><br>\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"Controlador?accion=digital\" class=\"btn btn-warning\">Abrela aquí</a>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                        <img src=\"img/giftbox.png\" class=\"img-cuentas\">\n");
      out.write("                    <div class=\"card-body text-center\">\n");
      out.write("                        <h5 class=\"card-title\">Abre tu cuenta premio</h5>\n");
      out.write("                        <p class=\"card-text text-center\"><br>\n");
      out.write("\n");
      out.write("                            <span class=\"fw-normal\">Beneficio</span><br>\n");
      out.write("                            <span class=\"fw-light\">Podrás ganar 1 millón de soles</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Operaciones en ventanilla</span><br>\n");
      out.write("                            <span class=\"fw-light\">6 depósitos y 6 retiros en ventanilla</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Operaciones en Cajeros BCP y canales digitales</span><br>\n");
      out.write("                            <span class=\"fw-light\">Ilimitado</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Mantenimiento</span><br>\n");
      out.write("                            <span class=\"fw-light\">Sin costo*</span><br>\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"Controlador?accion=premio\" class=\"btn btn-warning\">Abrela aquí</a>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                        <img src=\"img/money-bag-with-dollar-symbol.png\" class=\"img-cuentas\">\n");
      out.write("                    <div class=\"card-body text-center\">\n");
      out.write("                        <h5 class=\"card-title\">Abre tu cuenta ilimitada</h5>\n");
      out.write("                        <p class=\"card-text text-center\">\n");
      out.write("\n");
      out.write("                            <span class=\"fw-normal\">Beneficio</span><br>\n");
      out.write("                            <span class=\"fw-light\">Operaciones ilimitadas  por todos los canales</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Operaciones en ventanilla</span><br>\n");
      out.write("                            <span class=\"fw-light\">Operaciones Ilimitadas en ventanilla</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Operaciones en Cajeros BCP y canales digitales</span><br>\n");
      out.write("                            <span class=\"fw-light\">Ilimitado</span><br>\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"fw-normal\">Mantenimiento</span><br>\n");
      out.write("                            <span class=\"fw-light\">S/ 12.00 o US$ 4.80 al mes</span><br>\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"Controlador?accion=ilimitada\" class=\"btn btn-warning\">Abrela aquí</a>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("            <br>\n");
      out.write("            <p class=\"text-center fst-italic\">Tarifario, condiciones y restricciones en www.viabcp.com <br>\n");
      out.write("                                              TEA REFERENCIAL: Cuentas en soles 0.123% / Cuentas en dólares: 0.123%<br>\n");
      out.write("                                              BCP Sede central. Centenario 156, La Molina 15026, Perú</p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("  window.watsonAssistantChatOptions = {\n");
      out.write("      integrationID: \"f66444a5-1f54-489a-ba3f-6a62dbadbb4b\", // The ID of this integration.\n");
      out.write("      region: \"us-south\", // The region your integration is hosted in.\n");
      out.write("      serviceInstanceID: \"905ee7e8-9802-4ad8-bbce-8d49cf3d19d6\", // The ID of your service instance.\n");
      out.write("      onLoad: function(instance) { instance.render(); }\n");
      out.write("    };\n");
      out.write("  setTimeout(function(){\n");
      out.write("    const t=document.createElement('script');\n");
      out.write("    t.src=\"https://web-chat.global.assistant.watson.appdomain.cloud/loadWatsonAssistantChat.js\";\n");
      out.write("    document.head.appendChild(t);\n");
      out.write("  });\n");
      out.write("</script>\n");
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
