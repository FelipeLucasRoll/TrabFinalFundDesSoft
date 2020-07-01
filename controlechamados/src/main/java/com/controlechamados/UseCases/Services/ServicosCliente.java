package com.controlechamados.UseCases.Services;

import java.util.List;
import java.util.Map;

import com.controlechamados.Entity.*;
import com.controlechamados.UseCases.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class ServicosCliente {
	private RepoChamados cadChamados;
	private RepoClientes cadClientes;


	@Autowired
	public ServicosCliente(RepoChamados repositoriochamados,RepoClientes cadClientes){
		this.cadChamados = repositoriochamados;
		this.cadClientes = cadClientes;
	}

	public Map<Integer, Chamado> listaDeChamados(Integer idcli) throws Exception {
        Map<Integer, Chamado> chamados = cadChamados.recuperaPorCliente(idcli);
		if (chamados == null){
            throw new IllegalArgumentException("Erro Na Consulta");
        }
			
		return chamados;
        
	}
	
	public Chamado abrirChamado() {
		return null;
	}

	public double avaliarTecnico() {
		return 0;
	}

	public List<Chamado> listarChamadosCliente() {
		return null;
	}

	public boolean autenticarLogin() {
		return false;
	}

	public boolean cadastrarCliente() {
		return false;
	}

	public Map<Integer, Cliente> listaDeClientes() {
		Map<Integer, Cliente> clientes = cadClientes.findall();
		return clientes;
	}

	public Cliente BuscaDadosDoCLiente(Integer idcli) {
		return this.cadClientes.buscaPeloIdCliente(idcli);
	}

}
