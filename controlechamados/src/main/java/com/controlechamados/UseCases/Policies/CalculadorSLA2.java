package com.controlechamados.UseCases.Policies ;



import com.controlechamados.Entity.Chamado;

public class CalculadorSLA2 extends SuperCalculadorSLA {

	
	public Chamado organizaChamados(Chamado chamado) {
	
		if(chamado.getCliente().getDatanasc().compareTo("01.01.1990") < 0){

			chamado.setPrazoLimite(super.addDias(1));
		}
		else {
			chamado.setPrazoLimite(super.addDias(2));
		}

		return chamado;
	}

}
