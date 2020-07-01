package com.controlechamados.UseCases.Services;

import java.util.List;
import java.util.Map;

import com.controlechamados.Entity.Chamado;
import com.controlechamados.UseCases.Repository.*;
//import com.controlechamados.UseCases.Repository.RepoChamados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class ServicosCliente {
	private RepoChamados cadChamados;


	@Autowired
	public ServicosCliente(RepoChamados repositorio){
		this.cadChamados = repositorio;
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

}
