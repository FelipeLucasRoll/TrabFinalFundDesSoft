package com.controlechamados.UseCases.Policies;


import com.controlechamados.Entity.Chamado;
import org.springframework.stereotype.Component;

@Component
public class CalculadorSLAPorPlano extends SuperCalculadorSLA implements InterfaceCalculaSLA {

	public CalculadorSLAPorPlano() {
		
	}

	public Chamado calculaSLA(Chamado chamado) {

		if(chamado.getCliente().getPlano().equals("Basic")){

			chamado.setPrazoLimite(super.addDias(4));
		}
		else {
			chamado.setPrazoLimite(super.addDias(2));
		}

		return chamado;
	}





}
