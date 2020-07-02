package com.controlechamados.Entity;

//import java.util.*;
//import javax.persistence.*;


//@Entity
public class Habilidade {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name = "idhabilidade")
	private Integer idhabilidade;
	private String nome;
	private char tipoHS;
	
	//@ManyToMany(targetEntity=Habilidade.class)
	//private List<Tecnico> tecnicos;


	public Habilidade(int idhabilidade, String nome, char tipoHS) {
		this.idhabilidade = idhabilidade;
		this.nome = nome;
		this.tipoHS = tipoHS;
		
	}



	public int getIdhabilidade() {
		return this.idhabilidade;
	}

	public void setIdhabilidade(int idhabilidade) {
		this.idhabilidade = idhabilidade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getTipoHS() {
		return this.tipoHS;
	}

	public void setTipoHS(char tipoHS) {
		this.tipoHS = tipoHS;
	}





}
