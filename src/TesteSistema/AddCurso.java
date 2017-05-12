package TesteSistema;

import dao.CursoDAO;
import model.Curso;

public class AddCurso {
	
	public static void main(String[] args) throws Exception {
		
		Curso curso = new Curso();
		CursoDAO cursoDAO = new CursoDAO();
	
		curso.setNome("SPI");
		curso.setTipo("TI");
		
		//salva
		cursoDAO.create(curso);
		
		//deleta
		//cursoDAO.delete(Curso.class, 2L);
		
		//encontra
		System.out.println("Esse curso é " + cursoDAO.read(Curso.class, 1L).getNome());
		
		curso.setId(2L);
		curso.setNome("CC");
		
		//atualiza
		cursoDAO.update(curso);
		
	}

}
