package br.com.artorys.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mensagem")
public class ServletMensagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ServletMensagem() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Por favor, realize login para comprar');");
		out.println("</script>");
		request.getRequestDispatcher("/front/home.html").include(request, response);
	}

}
