package com.controlechamados.UseCases.Services;

import java.util.Map;
import com.controlechamados.Entity.*;
import com.controlechamados.UseCases.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicosTecnico {

	private RepoChamados cadChamados;
	private RepoTecnicos cadtecnicos;
	private RepoHabilidade cadHabil;
	
	@Autowired
	public ServicosTecnico(RepoChamados repochamados,RepoTecnicos repotec, RepoHabilidade repohabil){
		this.cadChamados = repochamados;
		this.cadtecnicos = repotec;
		this.cadHabil = repohabil;
	}

	public Chamado atenderChamado() {
		return null;
	}

	public boolean autenticarLogin() {
		return false;
	}

	public Map<Integer, Habilidade> listaDeHabilidades() {
		return cadHabil.findall();
	}

	public Map<Integer, Tecnico> listaDeTecnicos() {
		return cadtecnicos.findall();
	}

	public Tecnico BuscaDadosDoTecnico(Integer idtec) {
		return null;
	}

	public Map<Integer, Chamado> listaDeChamados(Integer idtec) {
		return null;
	}

}
