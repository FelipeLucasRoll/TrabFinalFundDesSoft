package com.controlechamados.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)

	private int idcliente;

	private String nome;

	private String cpf;

	private String datanasc;

	private String telefone;

	private String email;

	private String login;

	private String senha;

	private String plano;




	public Cliente(int idcliente, String nome, String cpf, String datanasc, String telefone, String email, String login, String senha, String plano) {
		this.idcliente = idcliente;
		this.nome = nome;
		this.cpf = cpf;
		this.datanasc = datanasc;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.plano = plano;
	}




	public String getNome() {
		return null;
	}

	public String getCpf() {
		return null;
	}

	public String getDatanasc() {
		return null;
	}

	public String getTelefone() {
		return null;
	}

	public String getEmail() {
		return null;
	}

	public String getLogin() {
		return null;
	}

	public String getSenha() {
		return null;
	}

	public String getPlano() {
		return null;
	}


	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}

}
