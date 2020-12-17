package Mail;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 //@author Anderson

public class VerifyCode extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession();
            User user= (User) session.getAttribute("authcode");
            
            String code = request.getParameter("authcode");
            String id_cuenta = request.getParameter("id_cuenta");

            if(code.equals(user.getCode())){
               out.println("Verification Completada");
               if(id_cuenta.equals("1")){
                   response.sendRedirect("RegistroCliente.jsp");
               }else if(id_cuenta.equals("2")){
                   response.sendRedirect("RegistroCliente2.jsp");
               }else{
                   response.sendRedirect("RegistroCliente3.jsp");
               }
            }
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
