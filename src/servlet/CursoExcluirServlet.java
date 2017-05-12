package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursoDAO;
import model.Curso;

/**
 * Servlet implementation class CursoExcluirServlet
 */
public class CursoExcluirServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id_curso = request.getParameter("id_curso");
		
		Long id = Long.parseLong(id_curso);
		
		CursoDAO cursoDAO = new CursoDAO();
		
		try {
			cursoDAO.delete(Curso.class, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("Cursos.jsp");
		
	}

	
	
}
