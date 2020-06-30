package com.controlechamados.UseCases.Services;

import java.util.List;
import com.controlechamados.Entity.Chamado;
import com.controlechamados.Interface.Persistence.RepoChamados;
//import com.controlechamados.UseCases.Repository.RepoChamados;

import org.springframework.stereotype.*;

@Service
public class ServicosCliente {


	private RepoChamados cadChamados;


	public List<Chamado> listaDeChamados(){
        List<Chamado> chamados = (List<Chamado>) cadChamados.findAll();
		if (chamados == null){
            throw new IllegalArgumentException("Aluno nao encontrado");
        }else{
            return chamados;
        }
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
