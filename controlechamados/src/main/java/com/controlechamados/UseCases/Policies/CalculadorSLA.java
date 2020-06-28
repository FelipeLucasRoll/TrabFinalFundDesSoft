package com.controlechamados.UseCases.Policies;

import java.util.List;

import com.controlechamados.Entity.Chamado;


interface CalculadorSLA {

    public List<Chamado> organizaChamados(Chamado chamado);

}