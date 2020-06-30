package com.controlechamados.UseCases.Policies;
import com.controlechamados.Entity.Chamado;
import org.springframework.stereotype.Component;

@Component
public class CalculadorSLAPorPrioridade extends SuperCalculadorSLA {
	
	public CalculadorSLAPorPrioridade() {
		
	}

	public Chamado calculaSLA(Chamado chamado) {
	
		if(chamado.getPrioridade() > 3){

			chamado.setPrazoLimite(super.addDias(1));
		}
		else {
			chamado.setPrazoLimite(super.addDias(3));
		}

		return chamado;
	}

}
