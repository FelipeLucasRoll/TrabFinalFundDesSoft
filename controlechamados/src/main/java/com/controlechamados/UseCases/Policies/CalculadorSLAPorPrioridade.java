package com.controlechamados.UseCases.Policies ;



import java.util.Date;

import com.controlechamados.Entity.Chamado;

public class CalculadorSLAPorPrioridade extends SuperCalculadorSLA {

	public CalculadorSLAPorPrioridade(Date data) {
		super(data);
	}

	public Chamado calculaSLA(Chamado chamado) {
	
		if(chamado.getPrioridade() <= 1){

			chamado.setPrazoLimite(super.addDias(1));
		}
		else {
			chamado.setPrazoLimite(super.addDias(3));
		}

		return chamado;
	}

}
