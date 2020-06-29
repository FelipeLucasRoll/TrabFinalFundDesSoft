package com.controlechamados.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidade {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

	private int idhabilidade;

	private String nome;

	private char tipoHS;

	private boolean manager;




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
