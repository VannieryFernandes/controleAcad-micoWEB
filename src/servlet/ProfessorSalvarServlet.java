package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfessorDAO;
import model.Professor;

/**
 * Servlet implementation class ProfessorSalvarServlet
 */
public class ProfessorSalvarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome_professor = request.getParameter("nome_professor");
		String senha_professor = request.getParameter("senha_professor");
		String areaAtuacao_professor = request.getParameter("areaAtuacao_professor");
		String titulacao_professor = request.getParameter("titulacao_professor");
		
		Professor professor = new Professor();
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		professor.setNome(nome_professor);

		professor.setSenha(senha_professor);
		
		professor.setAreaAtuacao(areaAtuacao_professor);
		
		professor.setTitulacao(titulacao_professor);
		
		try {
			professorDAO.create(professor);
			response.sendRedirect("Professores.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
