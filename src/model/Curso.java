package model;


import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import dao.EntidadeBase;


@Entity
public class Curso implements EntidadeBase {
	
	@Id
	@GeneratedValue
	private Long id;//matricula
	
	@Column(nullable = false)
	private String nome;
	
	private String tipo;
	
	@ManyToMany(mappedBy="curso")
	private Collection<Professor> professores;
	
	@ManyToMany
	private Collection<Aluno> alunos;

	@ManyToMany
	private Collection<Disciplina> disciplinas;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Collection<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(Collection<Professor> professores) {
		this.professores = professores;
	}

	public Collection<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Collection<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Collection<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	

}
