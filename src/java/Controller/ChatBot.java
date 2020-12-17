package Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@author Anderson

@WebServlet(name = "ChatBot", urlPatterns = {"/ChatBot"})
public class ChatBot extends HttpServlet {
    
    private int hitCount; 
    
    @Override
	public void init() { hitCount = 0;}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         hitCount++; 
         String respuesta = request.getParameter("respuesta");
         String resultado = "";
         int c = 24;
         
        switch (hitCount) {
            case 1:
                respuesta = "Pregunta 1: <br><br>¿Qué tan probable es que recomiendes esta empresa a tus amigos o colegas?";
                break;
            case 2:
                respuesta = "Pregunta 2: <br><br>En general, ¿qué tan satisfecho/a o insatisfecho/a está con Bancafy?";
                break;
            case 3:
                respuesta = "Pregunta 3: <br><br>¿Qué tan bien nuestros servicios satisface(n) sus necesidades?";
                break;
            case 4:
                respuesta = "Pregunta 4: <br><br>¿Cómo calificaría la calidad del servicio?";
                break;
            case 5:
                respuesta = "Pregunta 5: <br><br> ¿Cómo calificaría la utilidad de nuestros servicios?";
                break;
            case 6:
                respuesta = "Pregunta 6: <br><br>¿Qué tan receptivos hemos sido ante sus preguntas o inquietudes acerca de nuestros productos?";
                break;
            case 7:
                respuesta = "Pregunta 7: <br><br>¿Qué tan probable es que usted vuelva a usar alguno de nuestros servicios?";
                break;
            case 8:
                respuesta = "Pregunta 8: <br><br>¿Está satisfecho con la forma en que nuestro sistema atendió su consulta?";
                break;
            case 9:
                respuesta = "Pregunta 9: <br><br>¿Considera que el servio es comodo?";
                break;
            case 10:
                respuesta = "Pregunta 10: <br><br>¿Compartiria en redes sociales el servivio brindado?";
                break;
            default:
                respuesta ="Gracias por realizar esta pequeña encuesta!";
                resultado ="Tu resultado es : "+c+"<br>Si su puntaje es mayor a 15 nos estara dando motivos para sguir creciendo y mejorar el servicio que le ofrecemos :D.";
                
                break;
        }
 
        request.setAttribute("resu", resultado);
        request.setAttribute("res", respuesta);
        RequestDispatcher rd = request.getRequestDispatcher("chatbot.jsp");
        rd.forward(request, response);     
    }
    
    @Override
    public void destroy() { } 

}
