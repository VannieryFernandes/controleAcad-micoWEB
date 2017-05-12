package model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import dao.EntidadeBase;


@Entity
public class Aluno extends Usuario implements EntidadeBase {
	
	@ManyToMany(mappedBy ="alunos")
	private Collection<Curso> curso;
	
	@OneToMany(mappedBy="aluno")
	private Collection<Desempenho> desempenhos;

	@Temporal(TemporalType.DATE)
	private Date dataVínculo;
	

	public Collection<Curso> getCurso() {
		return curso;
	}

	public void setCurso(Collection<Curso> curso) {
		this.curso = curso;
	}

	public Collection<Desempenho> getDesempenhos() {
		return desempenhos;
	}

	public void setDesempenhos(Collection<Desempenho> desempenhos) {
		this.desempenhos = desempenhos;
	}

	public Date getDataVínculo() {
		return dataVínculo;
	}

	public void setDataVínculo(Date dataVínculo) {
		this.dataVínculo = dataVínculo;
	}
	
	
	
}
