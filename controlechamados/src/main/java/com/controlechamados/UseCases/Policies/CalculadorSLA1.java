package com.controlechamados.UseCases.Policies ;

import com.controlechamados.Entity.Chamado;

public class CalculadorSLA1 extends SuperCalculadorSLA {



	public Chamado organizaChamados(final Chamado chamado) {

		if(chamado.getCliente().getPlano().equals("Basic")){

			chamado.setPrazoLimite(super.addDias(1));
		}
		else {
			chamado.setPrazoLimite(super.addDias(2));
		}

		return chamado;
	}





}
