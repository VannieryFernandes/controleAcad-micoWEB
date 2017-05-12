package model;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import dao.EntidadeBase;


@Entity
public class Disciplina implements EntidadeBase {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToMany(mappedBy ="disciplinas")
	private Collection<Curso> curso;
	
	private String nome;
	
	private String area;
	
	@ManyToMany
	private Collection<Professor> professor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Collection<Curso> getCurso() {
		return curso;
	}

	public void setCurso(Collection<Curso> curso) {
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Collection<Professor> getProfessor() {
		return professor;
	}

	public void setProfessor(Collection<Professor> professor) {
		this.professor = professor;
	}
	

		
}