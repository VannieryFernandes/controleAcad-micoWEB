package model;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import dao.EntidadeBase;

@Entity
public class Turma implements EntidadeBase {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Disciplina disciplina;
	
	@ManyToOne
	private Professor professor;
	
	@OneToMany(mappedBy="turma")
	private Collection<Desempenho> desempenho;
	
	private String semestre;
	private String ano;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Collection<Desempenho> getDesempenho() {
		return desempenho;
	}
	
	public void setDesempenho(Collection<Desempenho> desempenho) {
		this.desempenho = desempenho;
	}
	
	public String getSemestre() {
		return semestre;
	}
	
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	

}
