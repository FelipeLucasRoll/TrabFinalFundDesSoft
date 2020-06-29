package com.controlechamados.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tecnico {
	
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)


	private int idtecnico;

	private String nome;

	private String cpf;

	private String login;

	private String senha;

	private List<Habilidade> habilidades;

	private double avaliacao;



	public Tecnico(int idtecnico, String nome, String cpf, String login, String senha, List<Habilidade> habilidades, double avaliacao) {
		this.idtecnico = idtecnico;
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.habilidades = habilidades;
		this.avaliacao = avaliacao;
	}



	public String getNome() {
		return null;
	}

	public String getCpf() {
		return null;
	}

	public String getLogin() {
		return null;
	}

	public String getSenha() {
		return null;
	}

	public List<Habilidade> getHabilidades() {
		return null;
	}

	public double getAvaliacao() {
		return 0;
	}

	public void setNome() {

	}

	public void setCpf() {

	}

	public void setLogin() {

	}

	public void setSenha() {

	}

	public void setHabilidades() {

	}

	public void setAvaliacao() {

	}

}
