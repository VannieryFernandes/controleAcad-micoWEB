package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import dao.EntidadeBase;

@Entity
public class Nota implements EntidadeBase {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String unidade;
	private double nota;
	private double peso;
	
	@ManyToOne
	private Desempenho desempenho;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Desempenho getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(Desempenho desempenho) {
		this.desempenho = desempenho;
	}
	
	

}