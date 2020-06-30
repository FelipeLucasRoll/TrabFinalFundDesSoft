package com.controlechamados.Entity;

import java.util.*;
//import javax.persistence.*;




//@Entity(name = "Cliente")
//@Table(name = "clientes")
public class Cliente {

	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name = "idcliente")
	private Integer idcliente;
	private String nome;
	private String cpf;
	private String datanasc;
	private String telefone;
	private String email;
	private String login;
	private String senha;
	private String plano;
	//@OneToMany(mappedBy="cliente", targetEntity=Chamado.class)
	//@OneToMany(
	//	mappedBy = "cliente",
    //    cascade = CascadeType.ALL,
    //    orphanRemoval = true
	//)
    private List<Chamado> chamados;




	public Cliente(int idcliente, String nome, String cpf, String email, String senha, String plano) {
		this.idcliente = new Integer(idcliente);
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = null;
		this.email = email;
		this.senha = senha;
		this.plano = plano;
		//this.datanasc = datanasc;
		//this.login = login;
	}


	public List<Chamado> addChamadoNaListaDoCliente(Chamado chamado){
		List<Chamado> lista = getChamados();
		lista.add(chamado);
		chamado.setCliente(this);
		return lista;
	}

	public String getNome() {
		return null;
	}

	public String getCpf() {
		return null;
	}

	//public String getDatanasc() {
	//	return null;
	//}

	public String getTelefone() {
		return null;
	}

	public String getEmail() {
		return null;
	}

	//public String getLogin() {
	//	return null;
	//}

	public String getSenha() {
		return null;
	}

	public String getPlano() {
		return null;
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setNome() {}

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
	//public void setDatanasc(String datanasc) {
	//	this.datanasc = datanasc;
	//}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//public void setLogin(String login) {
	//	this.login = login;
	//}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}

}
