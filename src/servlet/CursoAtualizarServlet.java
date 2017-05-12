package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursoDAO;
import model.Curso;

/**
 * Servlet implementation class CursoAtualizarServlet
 */
public class CursoAtualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id_curso = request.getParameter("id_curso");
		String nome_curso = request.getParameter("nome_curso");
		String tipo_curso = request.getParameter("tipo_curso");
		
		Curso curso = new Curso();
		CursoDAO cursoDAO = new CursoDAO();
		
		if (id_curso.equals("")) {
			response.sendRedirect("CursoAtualizar.jsp");
			return;
		}
		
		curso.setId(Long.parseLong(id_curso));
		

		curso.setNome(nome_curso);
	

		curso.setTipo(tipo_curso);

		
		try {
			cursoDAO.update(curso);
			response.sendRedirect("Cursos.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
