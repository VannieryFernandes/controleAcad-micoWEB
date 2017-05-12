package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import dao.EntidadeBase;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS )
public abstract class Usuario implements EntidadeBase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;//matricula
	
	private String nome;
	private String senha;
	
	
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
}
