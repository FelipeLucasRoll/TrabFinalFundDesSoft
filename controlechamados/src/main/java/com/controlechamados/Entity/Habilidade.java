package com.controlechamados.Entity;

import java.util.*;
import javax.persistence.*;


@Entity
public class Habilidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idhabilidade")
	private Integer idhabilidade;
	private String nome;
	private char tipoHS;
	private boolean manager;
	//@ManyToMany(targetEntity=Habilidade.class)
	//private List<Tecnico> tecnicos;


	public Habilidade(int idhabilidade, String nome, char tipoHS, boolean manager) {
		this.idhabilidade = idhabilidade;
		this.nome = nome;
		this.tipoHS = tipoHS;
		this.manager = manager;
	}




	public String getNome() {
		return null;
	}

	public char getTipoHS() {
		return 0;
	}

	public boolean getManager() {
		return false;
	}

	public void setNome() {

	}

	public void setTipoHS() {

	}

	public void setManager() {

	}

}
