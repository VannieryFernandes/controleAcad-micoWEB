package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursoDAO;
import model.Curso;


/**
 * Servlet implementation class CursoListarServlet
 */
public class CursoListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		CursoDAO cursoDAO = new CursoDAO();
		
		List<Curso> cursos = cursoDAO.getPesquisa("Curso", "nome", pesquisa);
		
		request.setAttribute("cursosLista", cursos);
		request.getRequestDispatcher("Cursos.jsp").forward(request, response);

	}

}
