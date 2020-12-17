package Mail;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 //@author Anderson

@WebServlet(urlPatterns = {"/UserVerify"})
public class UserVerify extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        //feth form value
           String name = request.getParameter("username");
           String email = request.getParameter("useremail");
           String id_cuenta = request.getParameter("id_cuenta");
           
      	//create instance object of the SendEmail Class
           SendEmail sm = new SendEmail();
      	//get the 6-digit code
           String code = sm.getRandom();
      	//craete new user using all information
           User user = new User(name,email,code,id_cuenta);
        //llamar al método de envío de correo electrónico
           boolean test = sm.sendEmail(user);
      	//si correo electrónico se envió correctamente
           if(test){
               HttpSession session  = request.getSession();
               session.setAttribute("authcode", user);
               HttpSession session1  = request.getSession();
               
               if(id_cuenta.equals("1")){
                   session1.setAttribute("id_cuenta", "1");
               }else if(id_cuenta.equals("2")){
                   session1.setAttribute("id_cuenta", "2");
               }else{
                   session1.setAttribute("id_cuenta", "3");
               }
               
               //session.setAttribute("authcode", user);
               response.sendRedirect("verify.jsp");
           }else{
      		  out.println("Error al enviar correo de verificacion");
      	   }
           
        }
    }

      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

}
