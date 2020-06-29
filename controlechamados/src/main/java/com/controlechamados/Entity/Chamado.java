package com.controlechamados.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chamado {

	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int idchamado;
	private Cliente cliente;
	private int idcliente;
	private int idtecnico;
	private String status;
	private Habilidade habilidade;
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
		private String status = "";
		private Habilidade habilidade = null;
		private String descricao = "";
		private Date horaAbertura = null;
		private Date horaFechamento = null;
		private Date prazoLimite = null;
		private int prioridade = 0;
		
		public Builder(){
		}
	
		public Builder chamado(int idchamado){
			this.idchamado = idchamado;
			return this;
		}
	
		public Chamado build(){
			return new Chamado(this);
		}

	}	

	private Chamado(Builder builder) {
		this.idchamado = builder.idchamado;
		this.cliente = builder.cliente;
		this.idcliente = builder.idcliente;
		this.idtecnico = builder.idtecnico;
		this.status = builder.status;
		this.habilidade = builder.habilidade;
		this.descricao = builder.descricao;
		this.horaAbertura = builder.horaAbertura;
		this.horaFechamento = builder.horaFechamento;
		this.prazoLimite = builder.prazoLimite;
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

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getIdtecnico() {
		return this.idtecnico;
	}

	public void setIdtecnico(int idtecnico) {
		this.idtecnico = idtecnico;
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

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidade = habilidade;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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


}