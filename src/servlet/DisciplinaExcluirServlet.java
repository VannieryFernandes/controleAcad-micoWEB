package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DisciplinaDAO;
import model.Disciplina;

/**
 * Servlet implementation class DisciplinaExcluirServlet
 */
public class DisciplinaExcluirServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id_disciplina = request.getParameter("id_disciplina");
		
		Long id = Long.parseLong(id_disciplina);
		
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		try {
			disciplinaDAO.delete(Disciplina.class, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("Disciplinas.jsp");
		
	}

	
	
}
