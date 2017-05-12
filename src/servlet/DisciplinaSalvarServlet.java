package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DisciplinaDAO;
import model.Disciplina;

/**
 * Servlet implementation class DisciplinaSalvarServlet
 */
public class DisciplinaSalvarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome_disciplina = request.getParameter("nome_disciplina");
		String area_disciplina = request.getParameter("area_disciplina");
		
		Disciplina disciplina = new Disciplina();
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		disciplina.setNome(nome_disciplina);
		disciplina.setArea(area_disciplina);
		
		try {
			disciplinaDAO.create(disciplina);
			response.sendRedirect("Disciplinas.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
