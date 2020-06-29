package com.controlechamados.Entity;
import java.util.Date;
import java.util.List;

public class Chamado {


	private int idchamado;

	private Cliente cliente;

	private int idcliente;

	private int idtecnico;

	private String status;

	private List<Habilidade> habilidades;

	private String descricao;

	private Date horaAbertura;

	private Date horaFechamento;

	private Date prazoLimite;

	private int prioridade;




	public Chamado(int idchamado, Cliente cliente, int idcliente, int idtecnico, String status, List<Habilidade> habilidades, String descricao, Date horaAbertura, Date horaFechamento, Date prazoLimite) {
		this.idchamado = idchamado;
		this.cliente = cliente;
		this.idcliente = idcliente;
		this.idtecnico = idtecnico;
		this.status = status;
		this.habilidades = habilidades;
		this.descricao = descricao;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.prazoLimite = prazoLimite;
	}
	



	public Chamado(String s) {

		this.status = s;

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

	public List<Habilidade> getHabilidades() {
		return this.habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
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
