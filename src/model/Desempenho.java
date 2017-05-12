package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import dao.EntidadeBase;

@Entity
public class Desempenho implements EntidadeBase {
	
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Turma turma;
	
	@ManyToOne
	private Aluno aluno;
	
	@OneToMany(mappedBy="desempenho")
	private Collection<Nota> notas;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Collection<Nota> getNotas() {
		return notas;
	}

	public void setNotas(Collection<Nota> notas) {
		this.notas = notas;
	}
	


}