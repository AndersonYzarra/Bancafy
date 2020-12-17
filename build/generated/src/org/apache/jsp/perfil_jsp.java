package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Modelo.ClienteDAO;
import Modelo.Cliente;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"height: 100%\">\n");
      out.write(" <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js\"> </script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js\"> </script>\n");
      out.write("\n");
      out.write("        <title>Cliente</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("    <body style=\"height: 100%;\">\n");
      out.write("        <br>\n");
      out.write("        <div style=\"width: 100%;\">\n");
      out.write("            <div class=\"container mt-4\" style=\"width: 50%; float: left;\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <h4 class=\"text-center\">Detallade del Cliente</h4>            \n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"Controlador\" action=\"UserVerify\">\n");
      out.write("                        <label>Nombre</label>\n");
      out.write("                        <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombreusuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\" class=\"form-control\">\n");
      out.write("                        <label>DNI</label>\n");
      out.write("                        <input name=\"dni\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${codigousuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\" class=\"form-control\">\n");
      out.write("                        <label>Correo</label>\n");
      out.write("                        <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${correousuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\" class=\"form-control\">\n");
      out.write("                        <label>Contraseña</label>\n");
      out.write("                        <input name=\"co\" type=\"password\" id=\"inpPassword\" pattern=\"^[a-zA-Z0-9]{1,100}$\"  title=\"Introduce correctamente el parametro de Contraseña\" required class=\"form-control\">\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <input class=\"btn btn-primary\" onclick=\"validations2()\" type=\"submit\" name=\"accion\" value=\"Actualizar datos\">\n");
      out.write("                        </div> \n");
      out.write("                        <a href=\"index.jsp\">Regresar</a>\n");
      out.write("                    </form>\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <a class=\"btn btn-danger\" href=\"Controlador?accion=BorrarCuenta&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${codigousuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >Borrar cuenta</a>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                        <div class=\"container mt-4\" style=\"width: 50%; float: left;\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <h4 class=\"text-center\">Cuentas</h4>            \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            ");

                                int id = Integer.parseInt((String) request.getAttribute("dni"));
                                ClienteDAO usuario = new ClienteDAO();
                                List<Cliente> c = usuario.BuscarCliente(id);
                                for (Cliente e: c){
                            
      out.write("\n");
      out.write("                                <div style=\"margin-left: 25%;margin-bottom: 2%;margin-top: 2%;padding: 3% ;width: 50%;padding-left: 5%; background-color: blue; color: white; border-radius: 4%;\">\n");
      out.write("                                    <img src=\"https://stbcpzonasegura.viabcp.com/assets/img/logo.svg\" style=\"width: 20%; margin-bottom: 2%;\">\n");
      out.write("                                <p>");
      out.print( e.getNombre());
      out.write(' ');
      out.print( e.getApellido() );
      out.write("</p>\n");
      out.write("                                ");

                                        int min1=10000000;
                                        int min2=10000000;
                                        int max1=99999999;
                                        int max2=99999999;
                                        int dia_min=1;
                                        int dia_max=31;
                                        int mes_min=1;
                                        int mes_max=12;
                                        int range1 = max1 - min1 + 1; 
                                        int range2 = max2 - min2 + 1;
                                        int range3 = dia_max - dia_min + 1;
                                        int range4 = mes_max - mes_min + 1;
                                        int rand1 = (int)(Math.random() * range1) + min1;
                                        int rand2 = (int)(Math.random() * range2) + min2;
                                        int rand3 = (int)(Math.random() * range3) + dia_min;
                                        int rand4 = (int)(Math.random() * range4) + mes_min;
      out.write(" \n");
      out.write("                                        <p>");
      out.print(rand1);
      out.print(rand2);
      out.write("</p>\n");
      out.write("                                <p>");
      out.print(rand3);
      out.write('/');
      out.print(rand4);
      out.write("</p>\n");
      out.write("                                ");

                                    String mj = "";
                                    if(e.getId_tipo()==1){
                                        mj ="Cueta Digital";
                                    }
                                    if(e.getId_tipo()==2){
                                        mj ="Cueta Premio";
                                    }
                                    if(e.getId_tipo()==3){
                                        mj ="Cueta Ilimitada";
                                    }
                                
      out.write("\n");
      out.write("                                <p>");
      out.print( mj );
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <a class=\"btn btn-danger\" href=\"Controlador?accion=BorrarCliente&id_cli=");
      out.print( e.getId() );
      out.write("\" style=\"margin-bottom: 2%;\" >Borrar cuenta</a>\n");
      out.write("                        </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("        </div>        \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/alertas.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("         <script>\n");
      out.write("            function validations2()\n");
      out.write("            {\n");
      out.write("               var nombr =document.getElementById('inpNombre').value;\n");
      out.write("               var dn = document.getElementById('inpDNI').value;\n");
      out.write("               var corre =document.getElementById('inpCorreo').value;\n");
      out.write("               var contra =document.getElementById('inpPassword').value;\n");
      out.write("               var nombrRGEX = /^([A-Z]{1}[a-z ]+[]?){1,3}$/;\n");
      out.write("               var dnRGEX = /^[0-9]{8}$/;\n");
      out.write("               var correRGEX = /^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\n");
      out.write("               var contraRGEX = /^[a-zA-Z0-9]{1,100}$/;\n");
      out.write("               var nombrResult = nombrRGEX.test(nombr);\n");
      out.write("               var dnResult = dnRGEX.test(dn);\n");
      out.write("               var correResult = correRGEX.test(corre);\n");
      out.write("               var contraResult = contraRGEX.test(contra);\n");
      out.write("              \n");
      out.write("                if(nombrResult == false)\n");
      out.write("                {\n");
      out.write("                    swal(\"Oops...\", \"Introduce correctamente el parametro de Nombre\", \"error\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                 if (dnResult == false) \n");
      out.write("                {\n");
      out.write("                    swal(\"Oops...\", \"Introduce correctamente el parametro de DNI\", \"error\");\n");
      out.write("                    \n");
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
      out.write("                   swal(\"Good job!\", \"Perfil Completado con Exito\", \"success\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("</html>\n");
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
