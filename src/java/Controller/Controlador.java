package Controller;

import Modelo.ClienteDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 //@author Anderson
 
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    String regCliente = "RegistroCliente.jsp";
    String preRegistro = "PreRegistro.jsp";
    String acceso = "";

    UsuarioDAO usu = new UsuarioDAO();
    ClienteDAO cli = new ClienteDAO();

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        boolean login = false;
        
        switch (accion) {
            
            case "Ingresar": {
                String dni = request.getParameter("DNI");
                String pass = request.getParameter("Contrasena");
                Usuario usuario = usu.ValidarUsuario(dni, pass);
                if (usuario != null) {
                    request.setAttribute("alert", "loginexito");
                    HttpSession sesion = request.getSession();
                    sesion.setAttribute("nombreusuario", usuario.getNombre());
                    sesion.setAttribute("codigousuario", dni);
                    sesion.setAttribute("correousuario", usuario.getCorreo());
                    response.sendRedirect("index.jsp");

                } else {
                    request.setAttribute("alert", "loginerror");
                    request.getRequestDispatcher("Login.jsp").forward(request, response);
                }
                login = true;
                break;
            }
            
            case "digital":{
            HttpSession ses = request.getSession();
            ses.setAttribute("idSimple", "1");
            acceso = preRegistro;
            break;
            }
            
            case "premio":{
            HttpSession ses = request.getSession();
            ses.setAttribute("idSimple", "2");
            acceso = preRegistro;
            break;
            }
            
            case "ilimitada":{
            HttpSession ses = request.getSession();
            ses.setAttribute("idSimple", "3");
            acceso = preRegistro;
            break;
            }
            
            case "Crear cuenta simple": {
                int dni = Integer.parseInt(request.getParameter("dni"));
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String correo = request.getParameter("correo");
                String direccion = request.getParameter("direccion");
                int telefono = Integer.parseInt(request.getParameter("telefono"));
                String ocupacion = request.getParameter("ocupacion");
                    cli.RegistrarCliente(dni, nombre, apellido, correo, direccion, telefono, ocupacion, 1);
                    acceso = "index.jsp";
                break;
            }
            
            case "Crear cuenta premio": {
                int dni = Integer.parseInt(request.getParameter("dni"));
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String correo = request.getParameter("correo");
                String direccion = request.getParameter("direccion");
                int telefono = Integer.parseInt(request.getParameter("telefono"));
                String ocupacion = request.getParameter("ocupacion");
                    cli.RegistrarCliente(dni, nombre, apellido, correo, direccion, telefono, ocupacion, 2);
                    acceso = "index.jsp";
                break;
            }
            
            case "Crear cuenta ilimitada": {
                int dni = Integer.parseInt(request.getParameter("dni"));
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String correo = request.getParameter("correo");
                String direccion = request.getParameter("direccion");
                int telefono = Integer.parseInt(request.getParameter("telefono"));
                String ocupacion = request.getParameter("ocupacion");
                    cli.RegistrarCliente(dni, nombre, apellido, correo, direccion, telefono, ocupacion, 3);
                    acceso = "index.jsp";
                break;
            }
            
            case "Registrar": {
                String dni = request.getParameter("DNI");
                String nombre = request.getParameter("nombre");
                String correo = request.getParameter("correo");
                String con = request.getParameter("co");
                usu.RegistrarUsuario(dni, nombre, correo, con);
                acceso = "Login.jsp";
                break;
            }
            
            case "Actualizar datos": {
                try {
                    int dni = Integer.parseInt(request.getParameter("dni"));
                    String contra = request.getParameter("co");
                    usu.EditarUsuario(dni,contra);
                    System.out.println(contra);
                    acceso = "index.jsp";
                    request.setAttribute("alert", "exitogenerico");

                } catch (Exception e) {
                    System.out.println("ERROR " + e.getMessage());
                    request.setAttribute("alert", "errorgenerico");
                    acceso = "perfil.jsp";
                }

                break;
            }
            case "BorrarCuenta":{
                try {
                    String dni = request.getParameter("id");
                    usu.EliminarUsuario(dni);
                    acceso = "Login.jsp";
                } catch (Exception e) {
                    System.out.println("ERROR " + e.getMessage());
                    request.setAttribute("alert", "errorgenerico");
                    acceso = "perfil.jsp";
                }
                break;
            }
            case "per":{
                acceso = "perfil.jsp";
                request.setAttribute("dni", request.getParameter("dni"));
                break;
            }
            case "BorrarCliente":{
                try {
                    int id = Integer.parseInt(request.getParameter("id_cli"));
                    cli.EliminarCliente(id);
                    acceso = "index.jsp";
                } catch (Exception e) {
                    System.out.println("ERROR " + e.getMessage());
                    request.setAttribute("alert", "errorgenerico");
                    acceso = "index.jsp";
                }
                break;
            }
        }
        
        if (login == false) {
            RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
            dispatcher.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
