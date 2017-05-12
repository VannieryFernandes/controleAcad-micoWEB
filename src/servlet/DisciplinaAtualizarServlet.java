package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DisciplinaDAO;
import model.Disciplina;

/**
 * Servlet implementation class CursoAtualizarServlet
 */
public class DisciplinaAtualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id_disciplina = request.getParameter("id_disciplina");
		String area_disciplina = request.getParameter("area_disciplina");
		String nome_disciplina = request.getParameter("nome_disciplina");
		
		Disciplina disciplina = new Disciplina();
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		if (id_disciplina.equals("")) {
			response.sendRedirect("DisciplinaAtualizar.jsp");
			return;
		}
		
		disciplina.setId(Long.parseLong(id_disciplina));
		
		disciplina.setArea(area_disciplina);
		
		disciplina.setNome(nome_disciplina);

		try {
			disciplinaDAO.update(disciplina);
			response.sendRedirect("Disciplinas.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
