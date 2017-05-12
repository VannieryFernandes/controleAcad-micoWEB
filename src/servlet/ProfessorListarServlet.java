package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfessorDAO;
import model.Professor;


/**
 * Servlet implementation class ProfessorListarServlet
 */
public class ProfessorListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		List<Professor> professores = professorDAO.getPesquisa("Professor", "nome", pesquisa);
		
		request.setAttribute("professoresLista", professores);
		request.getRequestDispatcher("Professores.jsp").forward(request, response);

	}

}
