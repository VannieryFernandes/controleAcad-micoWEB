package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.UsuarioDAO;
import model.Usuario;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		Usuario usuario = usuarioDAO.efetuarLogin(username, password);
		
		if(usuario != null) {
			request.getSession().setAttribute("user", usuario.getNome());
			response.sendRedirect("Cursos.jsp");
		} else {
			response.sendRedirect("Login.jsp");
		}
		
	}

}
