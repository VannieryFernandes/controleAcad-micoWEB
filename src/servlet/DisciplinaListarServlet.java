package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DisciplinaDAO;
import model.Disciplina;


/**
 * Servlet implementation class DisciplinaListarServlet
 */
public class DisciplinaListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		List<Disciplina> disciplinas = disciplinaDAO.getPesquisa("Disciplina", "nome", pesquisa);
		
		request.setAttribute("disciplinasLista", disciplinas);
		request.getRequestDispatcher("Disciplinas.jsp").forward(request, response);

	}

}
