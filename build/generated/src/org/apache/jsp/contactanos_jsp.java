package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactanos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/styles.csss\">\n");
      out.write("          <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("    <!-- Website Title -->\n");
      out.write("    <title>Contacto</title>\n");
      out.write("    \n");
      out.write("    <!-- Styles -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Raleway:400,400i,600,700,700i&amp;subset=latin-ext\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"css/fontawesome-all.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/swiper.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/4cff7af942.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<link href=\"css/magnific-popup.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    <!-- end of preloader -->\n");
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("  <!-- About -->\n");
      out.write("    <div id=\"about\" class=\"basic-4\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h2>About The Team</h2>\n");
      out.write("                    <p class=\"p-heading p-large\">Meat our team of specialized marketers and business developers which will help you research new products and launch them in new emerging markets</p>\n");
      out.write("                </div> <!-- end of col -->\n");
      out.write("            </div> <!-- end of row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    \n");
      out.write("                    <!-- Team Member -->\n");
      out.write("                    <div class=\"team-member\">\n");
      out.write("                        <div class=\"image-wrapper\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/team-member-1.svg\" alt=\"alternative\">\n");
      out.write("                        </div> <!-- end of image-wrapper -->\n");
      out.write("                        <p class=\"p-large\"><strong>Lacy Whitelong</strong></p>\n");
      out.write("                        <p class=\"job-title\">Business Developer</p>\n");
      out.write("                        <span class=\"social-icons\">\n");
      out.write("                            <span class=\"fa-stack\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fas fa-circle fa-stack-2x facebook\"></i>\n");
      out.write("                                    <i class=\"fab fa-facebook-f fa-stack-1x\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"fa-stack\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fas fa-circle fa-stack-2x twitter\"></i>\n");
      out.write("                                    <i class=\"fab fa-twitter fa-stack-1x\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                        </span> <!-- end of social-icons -->\n");
      out.write("                    </div> <!-- end of team-member -->\n");
      out.write("                    <!-- end of team member -->\n");
      out.write("\n");
      out.write("                    <!-- Team Member -->\n");
      out.write("                    <div class=\"team-member\">\n");
      out.write("                        <div class=\"image-wrapper\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/team-member-2.svg\" alt=\"alternative\">\n");
      out.write("                        </div> <!-- end of image wrapper -->\n");
      out.write("                        <p class=\"p-large\"><strong>Chris Brown</strong></p>\n");
      out.write("                        <p class=\"job-title\">Online Marketer</p>\n");
      out.write("                        <span class=\"social-icons\">\n");
      out.write("                            <span class=\"fa-stack\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fas fa-circle fa-stack-2x facebook\"></i>\n");
      out.write("                                    <i class=\"fab fa-facebook-f fa-stack-1x\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"fa-stack\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fas fa-circle fa-stack-2x twitter\"></i>\n");
      out.write("                                    <i class=\"fab fa-twitter fa-stack-1x\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                        </span> <!-- end of social-icons -->\n");
      out.write("                    </div> <!-- end of team-member -->\n");
      out.write("                    <!-- end of team member -->\n");
      out.write("\n");
      out.write("                    <!-- Team Member -->\n");
      out.write("                    <div class=\"team-member\">\n");
      out.write("                        <div class=\"image-wrapper\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/team-member-3.svg\" alt=\"alternative\">\n");
      out.write("                        </div> <!-- end of image wrapper -->\n");
      out.write("                        <p class=\"p-large\"><strong>Sheila Zimerman</strong></p>\n");
      out.write("                        <p class=\"job-title\">Software Engineer</p>\n");
      out.write("                        <span class=\"social-icons\">\n");
      out.write("                            <span class=\"fa-stack\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fas fa-circle fa-stack-2x facebook\"></i>\n");
      out.write("                                    <i class=\"fab fa-facebook-f fa-stack-1x\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"fa-stack\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fas fa-circle fa-stack-2x twitter\"></i>\n");
      out.write("                                    <i class=\"fab fa-twitter fa-stack-1x\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                        </span> <!-- end of social-icons -->\n");
      out.write("                    </div> <!-- end of team-member -->\n");
      out.write("                    <!-- end of team member -->\n");
      out.write("\n");
      out.write("                    <!-- Team Member -->\n");
      out.write("                    <div class=\"team-member\">\n");
      out.write("                        <div class=\"image-wrapper\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/team-member-4.svg\" alt=\"alternative\">\n");
      out.write("                        </div> <!-- end of image wrapper -->\n");
      out.write("                        <p class=\"p-large\"><strong>Mary Villalonga</strong></p>\n");
      out.write("                        <p class=\"job-title\">Product Manager</p>\n");
      out.write("                        <span class=\"social-icons\">\n");
      out.write("                            <span class=\"fa-stack\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fas fa-circle fa-stack-2x facebook\"></i>\n");
      out.write("                                    <i class=\"fab fa-facebook-f fa-stack-1x\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"fa-stack\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fas fa-circle fa-stack-2x twitter\"></i>\n");
      out.write("                                    <i class=\"fab fa-twitter fa-stack-1x\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </span>\n");
      out.write("                        </span> <!-- end of social-icons -->\n");
      out.write("                    </div> <!-- end of team-member -->\n");
      out.write("                    <!-- end of team member -->\n");
      out.write("\n");
      out.write("                </div> <!-- end of col -->\n");
      out.write("            </div> <!-- end of row -->\n");
      out.write("        </div> <!-- end of container -->\n");
      out.write("    </div> <!-- end of basic-4 -->\n");
      out.write("    <!-- end of about -->\n");
      out.write("    </body>\n");
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
