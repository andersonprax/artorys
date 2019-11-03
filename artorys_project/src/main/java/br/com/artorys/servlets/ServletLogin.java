package br.com.artorys.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artorys.modelo.Cliente;
import br.com.artorys.servicos.UsuarioServico;

@WebServlet(urlPatterns = "/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		cliente.setSenha(senha);
		cliente.setEmail(nome);

		if (UsuarioServico.verificaEmail(cliente)) {
			if (UsuarioServico.verificaSenha(cliente)) {
				
				request.getRequestDispatcher("/front/homelogin.html").include(request, response);
			}
		} else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Email ou senha incorretos');");
			out.println("</script>");
			request.getRequestDispatcher("/front/home.html").include(request, response);
		}
	}
	
	

}
