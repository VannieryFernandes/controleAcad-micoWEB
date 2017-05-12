package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfessorDAO;
import model.Professor;

/**
 * Servlet implementation class ProfessorExcluirServlet
 */
public class ProfessorExcluirServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id_professor = request.getParameter("id_professor");
		
		Long id = Long.parseLong(id_professor);
		
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		try {
			professorDAO.delete(Professor.class, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("Professores.jsp");
		
	}

	
	
}
