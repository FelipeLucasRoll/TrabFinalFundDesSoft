package com.controlechamados.UseCases.Policies ;



import com.controlechamados.Entity.Chamado;

public class CalculadorSLA2 extends SuperCalculadorSLA {

	
	public Chamado organizaChamados(Chamado chamado) {
		return chamado;
	}


}
