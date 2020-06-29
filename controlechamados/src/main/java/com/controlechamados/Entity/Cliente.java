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

	public void setNome() {

	}

	public void setCpf() {

	}

	public void setDatanasc() {

	}

	public void setTelefone() {

	}

	public void setEmail() {

	}

	public void setLogin() {

	}

	public void setSenha() {

	}

	public void setPlano() {

	}

}
