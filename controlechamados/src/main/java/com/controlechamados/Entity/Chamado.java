package com.controlechamados.Entity;

import java.util.*;
import javax.persistence.*;


@Entity(name = "Chamado")
@Table(name = "chamados")
public class Chamado {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idchamado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcliente")
	private Cliente cliente;
	//private int idcliente;
	private Integer idtecnico;
	private String status;
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "idhabilidade")
	private Habilidade habilidade;
	private String descricao;
	private Date horaAbertura;
	private Date horaFechamento;
	private Date prazoLimite;
	private int prioridade;

	public static class Builder{

		private int idchamado = 0;
		private Cliente cliente = null;
		//private int idcliente = 0;
		private int idtecnico = 0;
		private String status = "Aberto";
		private Habilidade habilidade = new Habilidade(0,"teste",'h',false);
		private String descricao = "";
		private Date horaAbertura = null;
		private Date horaFechamento = null;
		private Date prazoLimite = null;
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
		public Builder descricao(int id) { this.idchamado = id;
			return this;
		}
		public Builder horaAbertura(int id) { this.idchamado = id;
			return this;
		}
		public Builder horaAbertura(int id) { this.idchamado = id;
			return this;
		}
		public Builder horaAbertura(int id) { this.idchamado = id;
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
		//this.idcliente = builder.idcliente;
		this.idtecnico = new Integer(builder.idtecnico);
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

	//public int getIdcliente() {
	//	return this.idcliente;
	//}

	//public void setIdcliente(int idcliente) {
	//	this.idcliente = idcliente;
	//}

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
	public void setHabilidade(Habilidade habilidade) {
		this.habilidade = habilidade;
	}


}