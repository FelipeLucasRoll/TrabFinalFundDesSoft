package com.controlechamados.controlechamados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.controlechamados.Entity.Chamado;
import com.controlechamados.Entity.Chamado.Builder;
import com.controlechamados.UseCases.Policies.CalculadorSLAPorPrioridade;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadorSLAPorPrioridadeTeste {
    
    private CalculadorSLAPorPrioridade c;
    private Date data;
    private Chamado ch;
    private Builder b;
 

@BeforeEach
public void setup(){

    b = new Builder();
    c = new CalculadorSLAPorPrioridade();
    data = new Date();
    //ch = new Chamado(0, null, 0, 0, null, null, null, data, data, data, 0);
    ch = new Chamado(b);
}
   


@Test
public void testaPrioridadeMaior3(){
    
    ch.setPrioridade(4);
    Date s = new Date(data.getTime() + TimeUnit.DAYS.toMillis(1)) ;
    Chamado c2 = c.calculaSLA(ch);
    Date status = c2.getPrazoLimite();
    assertEquals(status,s);
    
  
}

@Test
public void testaPrioridadeMenor3(){
    
    ch.setPrioridade(3);
    Date s = new Date(data.getTime() + TimeUnit.DAYS.toMillis(3)) ;
    Chamado c2 = c.calculaSLA(ch);
    Date status = c2.getPrazoLimite();
    assertEquals(status,s);
    
  
}
    
}