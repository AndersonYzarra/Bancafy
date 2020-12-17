package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calendario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ul {\n");
      out.write("            list-style-type: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            font-family: \"Lato\", sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper {\n");
      out.write("            background-color: #dfe6e9;\n");
      out.write("            width: 100vw;\n");
      out.write("            height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .calendar {\n");
      out.write("            margin: auto;\n");
      out.write("            width: 600px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 0px 0px 15px 4px rgba(0, 0, 0, 0.2);\n");
      out.write("       \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .month {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 40px 30px;\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #2ecc71;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .weekdays {\n");
      out.write("            background-color: #27ae60;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 7px 0;\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .days {\n");
      out.write("            font-weight: 300;\n");
      out.write("            padding: 10px 0;\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .weekdays div,\n");
      out.write("        .days div {\n");
      out.write("            text-align: center;\n");
      out.write("            width: 14.28%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .days div {\n");
      out.write("            padding: 10px 0;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            transition: all 0.4s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .prev_date {\n");
      out.write("            color: #999;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .today {\n");
      out.write("            background-color: #27ae60;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .days div:hover {\n");
      out.write("            cursor: pointer;\n");
      out.write("            background-color: #dfe6e9\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .prev,\n");
      out.write("        .next {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            font-size: 23px;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.1);\n");
      out.write("            transition: all 0.4s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .prev:hover,\n");
      out.write("        .next:hover {\n");
      out.write("            cursor: pointer;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #month {\n");
      out.write("            font-size: 30px;\n");
      out.write("            font-weight: 500;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navUser.jsp", out, false);
      out.write("\n");
      out.write(" \n");
      out.write("<body onload=\"renderDate()\">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"calendar\">\n");
      out.write("            <div class=\"month\">\n");
      out.write("                <div class=\"prev\" onclick=\"moveDate('prev')\">\n");
      out.write("                    <span>&#10094;</span>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <h2 id=\"month\"></h2>\n");
      out.write("                    <p id=\"date_str\"></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"next\" onclick=\"moveDate('next')\">\n");
      out.write("                    <span>&#10095;</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"weekdays\">\n");
      out.write("                <div>Sun</div>\n");
      out.write("                <div>Mon</div>\n");
      out.write("                <div>Tue</div>\n");
      out.write("                <div>Wed</div>\n");
      out.write("                <div>Thu</div>\n");
      out.write("                <div>Fri</div>\n");
      out.write("                <div>Sat</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"days\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        var dt = new Date();\n");
      out.write("        function renderDate() {\n");
      out.write("            dt.setDate(1);\n");
      out.write("            var day = dt.getDay();\n");
      out.write("            var today = new Date();\n");
      out.write("            var endDate = new Date(\n");
      out.write("                dt.getFullYear(),\n");
      out.write("                dt.getMonth() + 1,\n");
      out.write("                0\n");
      out.write("            ).getDate();\n");
      out.write("\n");
      out.write("            var prevDate = new Date(\n");
      out.write("                dt.getFullYear(),\n");
      out.write("                dt.getMonth(),\n");
      out.write("                0\n");
      out.write("            ).getDate();\n");
      out.write("            var months = [\n");
      out.write("                \"January\",\n");
      out.write("                \"February\",\n");
      out.write("                \"March\",\n");
      out.write("                \"April\",\n");
      out.write("                \"May\",\n");
      out.write("                \"June\",\n");
      out.write("                \"July\",\n");
      out.write("                \"August\",\n");
      out.write("                \"September\",\n");
      out.write("                \"October\",\n");
      out.write("                \"November\",\n");
      out.write("                \"December\"\n");
      out.write("            ]\n");
      out.write("            document.getElementById(\"month\").innerHTML = months[dt.getMonth()];\n");
      out.write("            document.getElementById(\"date_str\").innerHTML = dt.toDateString();\n");
      out.write("            var cells = \"\";\n");
      out.write("            for (x = day; x > 0; x--) {\n");
      out.write("                cells += \"<div class='prev_date'>\" + (prevDate - x + 1) + \"</div>\";\n");
      out.write("            }\n");
      out.write("            console.log(day);\n");
      out.write("            for (i = 1; i <= endDate; i++) {\n");
      out.write("                if (i == today.getDate() && dt.getMonth() == today.getMonth()) cells += \"<div class='today'>\" + i + \"</div>\";\n");
      out.write("                else\n");
      out.write("                    cells += \"<div>\" + i + \"</div>\";\n");
      out.write("            }\n");
      out.write("            document.getElementsByClassName(\"days\")[0].innerHTML = cells;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function moveDate(para) {\n");
      out.write("            if(para == \"prev\") {\n");
      out.write("                dt.setMonth(dt.getMonth() - 1);\n");
      out.write("            } else if(para == 'next') {\n");
      out.write("                dt.setMonth(dt.getMonth() + 1);\n");
      out.write("            }\n");
      out.write("            renderDate();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" \n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    ");
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
