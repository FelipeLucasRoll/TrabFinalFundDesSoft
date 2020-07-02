package com.controlechamados.UseCases.Policies;

import com.controlechamados.Entity.Chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadorSLAPorPrioridade extends SuperCalculadorSLA implements CalculadorSLA{
	
	@Autowired
	public CalculadorSLAPorPrioridade() {
		
	}

	public Chamado calculaSLA(Chamado chamado) {
	
		if(chamado.getPrioridade() > 3){
			chamado.setPrazoLimite(super.addDias(chamado.getHoraAbertura(),1));
		}
		else {
			chamado.setPrazoLimite(super.addDias(chamado.getHoraAbertura(),3));
		}

		return chamado;
	}

}
