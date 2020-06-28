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


	public Chamado(int idchamado, int idcliente, int idtecnico, String status, List<Habilidade> habilidades, String descricao, Date datetime) {
		this.idchamado = idchamado;
		this.idcliente = idcliente;
		this.idtecnico = idtecnico;
		this.status = status;
		this.habilidades = habilidades;
		this.descricao = descricao;
		this.datetime = datetime;
	}


	





	public Chamado(String s) {

		this.status = s;

	}

	public int getIdCliente() {
		return 0;
	}

	public int getIdTecnico() {
		return 0;
	}

	public String getStatus() {
		return status;

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
