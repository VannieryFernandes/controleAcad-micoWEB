package model;


import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Professor extends Usuario {
	
	private String areaAtuacao;
	private String titulacao;
	
	@ManyToMany
	private Collection<Curso> curso;
	
	@ManyToMany(mappedBy="professor")
	private Collection<Disciplina> disciplina;
	
	@OneToMany(mappedBy="professor")
	private Collection<Turma> turmas;
	

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public Collection<Curso> getCurso() {
		return curso;
	}

	public void setCurso(Collection<Curso> curso) {
		this.curso = curso;
	}

	public Collection<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Collection<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public Collection<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(Collection<Turma> turmas) {
		this.turmas = turmas;
	}

	

}