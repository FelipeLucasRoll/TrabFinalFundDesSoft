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
	//private String login;
	private String senha;
	private String plano;
	//@OneToMany(mappedBy="cliente", targetEntity=Chamado.class)
	//@OneToMany(
	//	mappedBy = "cliente",
    //    cascade = CascadeType.ALL,
    //    orphanRemoval = true
	//)
    private List<Chamado> chamados;




	public Cliente(int idcliente, String nome, String email, String senha, String plano) {
		this.idcliente = idcliente;
		this.nome = nome;
		//this.cpf = cpf;
		//this.datanasc = null;
		this.telefone = null;
		this.email = email;
		//this.login = null;
		this.senha = senha;
		this.plano = plano;
	}

	public List<Chamado> addChamadoNaListaDoCliente(Chamado chamado){
		List<Chamado> lista = getChamados();
		lista.add(chamado);
		chamado.setCliente(this);
		return lista;
	}

	
	private List<Chamado> getChamados() {
		return chamados;
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
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

	public String getDatanasc() {
		return this.datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPlano() {
		return this.plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

}
