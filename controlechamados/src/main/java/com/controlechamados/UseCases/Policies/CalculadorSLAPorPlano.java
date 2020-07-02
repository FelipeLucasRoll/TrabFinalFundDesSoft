package com.controlechamados.UseCases.Policies;

import java.util.Date;

import com.controlechamados.Entity.Chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadorSLAPorPlano extends SuperCalculadorSLA implements CalculadorSLA {

	@Autowired
	public CalculadorSLAPorPlano() {

	}

	public Chamado calculaSLA(Chamado chamado) {

		if (chamado.getCliente().getPlano().equals("Basic")) {

			chamado.setPrazoLimite(super.addDias(chamado.getHoraAbertura(),4));
		} else {
			chamado.setPrazoLimite(super.addDias(chamado.getHoraAbertura(),2));
		}

		return chamado;
	}

	@Override
	public Date addDias(Date datainicial, int dias) {
		// TODO Auto-generated method stub
		return super.addDias(datainicial, dias);
	}





}
