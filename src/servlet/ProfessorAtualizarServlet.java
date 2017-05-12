package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfessorDAO;
import model.Professor;

/**
 * Servlet implementation class ProfessorAtualizarServlet
 */
public class ProfessorAtualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id_professor = request.getParameter("id_professor");
		String nome_professor = request.getParameter("nome_professor");
		String areaAtuacao_professor = request.getParameter("areaAtuacao_professor");
		String titulacao_professor = request.getParameter("titulacao_professor");
		
		Professor professor = new Professor();
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		if (id_professor.equals("")) {
			response.sendRedirect("ProfessorAtualizar.jsp");
			return;
		}
		
		professor.setId(Long.parseLong(id_professor));
		
		professor.setNome(nome_professor);
		
		Professor prof = professorDAO.read(Professor.class, Long.parseLong(id_professor));
		
		professor.setSenha( prof.getSenha() );
		
		professor.setAreaAtuacao(areaAtuacao_professor);
		
		professor.setTitulacao(titulacao_professor);

		
		try {
			professorDAO.update(professor);
			response.sendRedirect("Professores.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
