package com.controlechamados.Entity;

import java.util.*;

public class Chamado {


	private Integer idchamado;
	private Cliente cliente;
	private Integer idtecnico;
	private String status;
	private Habilidade habilidade;
	private String titulo;
	private String descricao;
	private Date horaAbertura;
	private Date horaFechamento;
	private Date prazoLimite;
	private int prioridade;

	public static class Builder{

		private int idchamado = 0;
		private Cliente cliente = null;
		private int idcliente = 0;
		private int idtecnico = 0;
		private String status = "Aberto";
		private Habilidade habilidade = new Habilidade(0,"teste",'h',false);
		private String titulo;
		private String descricao = "";
		private Date horaabertura = new Date();
		private Date horafechamento = null;
		private Date prazolimite = null;
		private int prioridade = 1;
		
		public Builder(){
		}
	
		public Builder chamado(int idchamado){
			this.idchamado = idchamado;
			return this;
		}

		public Builder idChamado(int idc) { this.idchamado = idc;
			return this;
		}
		public Builder cliente(Cliente cli) { this.cliente = cli;
			return this;
		}
		public Builder idTecnico(int idt) { this.idtecnico = idt;
			return this;
		}
		public Builder status(String stat) { this.status = stat;
			return this;
		}
		public Builder habilidade(Habilidade hab) { this.habilidade = hab;
			return this;
		}
		public Builder titulo(String tit) { this.titulo = tit;
			return this;
		}
		public Builder descricao(String desc) {this.descricao = desc;
			return this;
		}
		public Builder horaAbertura(Date dataab) { this.horaabertura = dataab;
			return this;
		}
		public Builder horaFechamento(Date dataenc) { this.horafechamento = dataenc;
			return this;
		}
		public Builder prazoLimite(Date datasla) { this.prazolimite = datasla;
			return this;
		}
		public Builder prioridade(int pri) { this.prioridade = pri;
			return this;
		}

		public Chamado build(){
			return new Chamado(this);
		}

	}	

	private Chamado(Builder builder) {
		this.idchamado = new Integer(builder.idchamado);
		this.cliente = builder.cliente;
		this.idtecnico = new Integer(builder.idtecnico);
		this.status = builder.status;
		this.habilidade = builder.habilidade;
		this.titulo = builder.titulo;
		this.descricao = builder.descricao;
		this.horaAbertura = builder.horaabertura;
		this.horaFechamento = builder.horafechamento;
		this.prazoLimite = builder.prazolimite;
		this.prioridade = builder.prioridade;
	}
	
	public int getIdchamado() {
		return this.idchamado;
	}

	public void setIdchamado(int idchamado) {
		this.idchamado = idchamado;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getIdtecnico() {
		return this.idtecnico;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Habilidade getHabilidade() {
		return this.habilidade;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String tit) {
		this.titulo = tit;
	}

	public Date getHoraAbertura() {
		return this.horaAbertura;
	}

	public void setHoraAbertura(Date horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public Date getHoraFechamento() {
		return this.horaFechamento;
	}

	public void setHoraFechamento(Date horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public Date getPrazoLimite() {
		return this.prazoLimite;
	}

	public void setPrazoLimite(Date prazoLimite) {
		this.prazoLimite = prazoLimite;
	}
	
	public int getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public void setHabilidade(Habilidade habilidade) {
		this.habilidade = habilidade;
	}

	public Chamado(int idchamado, Cliente cliente, int idcliente, int idtecnico, String status, Habilidade habilidade, String descricao, Date horaAbertura, Date horaFechamento, Date prazoLimite, int prioridade) {
		this.idchamado = idchamado;
		this.cliente = cliente;
		this.idtecnico = idtecnico;
		this.status = status;
		this.habilidade = habilidade;
		this.descricao = descricao;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.prazoLimite = prazoLimite;
		this.prioridade = prioridade;
	}

}