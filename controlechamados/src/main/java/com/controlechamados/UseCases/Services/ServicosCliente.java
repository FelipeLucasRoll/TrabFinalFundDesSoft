package com.controlechamados.UseCases.Services;

import java.util.*;


import com.controlechamados.Entity.*;
import com.controlechamados.Interface.Webserver.RequestNovoChamadoDTO;
import com.controlechamados.UseCases.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class ServicosCliente {
	private RepoChamados cadChamados;
	private RepoClientes cadClientes;
	//private RepoHabilidade cadHabil;
	


	@Autowired
	public ServicosCliente(RepoChamados repochamados,RepoClientes repoclientes){//, RepoHabilidade repohabil){
		this.cadChamados = repochamados;
		this.cadClientes = repoclientes;
		//this.cadHabil = repohabil;
	}

	public Map<Integer, Chamado> listaDeChamados(Integer idcli) throws Exception {
        Map<Integer, Chamado> chamados = cadChamados.recuperaPorCliente(idcli);
		if (chamados == null){
            throw new IllegalArgumentException("Erro Na Consulta");
        }
			
		return chamados;
        
	}
	
	
	public Chamado abrirChamado(RequestNovoChamadoDTO requestDTO) {
		String desc = requestDTO.getDescricao();
		String tit = requestDTO.getTitulo();
		Cliente c = BuscaDadosDoCLiente(requestDTO.getIdCliente());
		Random rand = new Random();
		int idchamado = rand.nextInt(10000);
		Integer idhabcat = requestDTO.getHabilidadeCategoria();
		//Habilidade habcat = cadHabil.buscaPeloIdHabilidade(idhabcat);
		Chamado chamadoaberto = new Chamado.Builder().chamado(idchamado).cliente(c).descricao(desc).titulo(tit).build();// habilidade(habcat).build(); //.build();//
		chamadoaberto = this.cadChamados.addChamado(chamadoaberto);
		return chamadoaberto;
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
