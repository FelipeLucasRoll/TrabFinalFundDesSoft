package com.controlechamados.Entity;
import java.util.*;
//import javax.persistence.*;


//@Entity
public class Tecnico {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idtecnico;
	private String nome;
	private String cpf;
	private String login;
	private String senha;
//	@ManyToMany(targetEntity=Habilidade.class)
	private List<Habilidade> habilidades;
	private double avaliacao;



	public Tecnico(Integer idtecnico, String nome, String cpf, String login, String senha, List<Habilidade> habilidades, double avaliacao) {
		this.idtecnico = idtecnico;
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.habilidades = habilidades;
		this.avaliacao = avaliacao;
	}



	public int getIdtecnico() {
		return this.idtecnico;
	}

	public void setIdtecnico(int idtecnico) {
		this.idtecnico = idtecnico;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Habilidade> getHabilidades() {
		return this.habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public double getAvaliacao() {
		return this.avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

}
