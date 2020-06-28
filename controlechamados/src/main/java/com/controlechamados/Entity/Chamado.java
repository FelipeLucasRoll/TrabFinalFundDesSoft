package com.controlechamados.Entity;
import java.util.Date;
import java.util.List;

public class Chamado {

	private int idchamado;

	private int idcliente;

	private int idtecnico;

	private String status;

	private List<Habilidade> habilidades;

	private String descricao;

	private Date datetime;

	public int getIdCliente() {
		return 0;
	}

	public int getIdTecnico() {
		return 0;
	}

	public void getStatus() {

	}

	public List<Habilidade> getHabilidades() {
		return null;
	}

	public String getDescricao() {
		return null;
	}

	public Date getDateTime() {
		return null;
	}

	public void setIdCliente() {

	}

	public void setIdTecnico() {

	}

	public void setStatus() {

	}

	public void setHabilidades() {

	}

	public void setDescricao() {

	}

}
