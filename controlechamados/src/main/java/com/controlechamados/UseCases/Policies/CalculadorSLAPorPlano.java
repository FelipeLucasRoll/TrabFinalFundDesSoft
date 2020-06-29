package com.controlechamados.UseCases.Policies ;

import java.util.Date;

import com.controlechamados.Entity.Chamado;

public class CalculadorSLAPorPlano extends SuperCalculadorSLA {

	public CalculadorSLAPorPlano(Date data) {
		super(data);

	}

	public Chamado plano(Chamado chamado) {

		if(chamado.getCliente().getPlano().equals("Basic")){

			chamado.setPrazoLimite(super.addDias(1));
		}
		else {
			chamado.setPrazoLimite(super.addDias(2));
		}

		return chamado;
	}





}
