package com.controlechamados.controlechamados;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.controlechamados.Entity.Chamado;
import com.controlechamados.Entity.Cliente;
import com.controlechamados.Entity.Chamado.Builder;
import com.controlechamados.UseCases.Policies.CalculadorSLAPorPlano;

public class CalculadorSLAPorPlanoTeste {
    private CalculadorSLAPorPlano  c;
    private Date data;
    private Chamado ch;
    private Cliente cl;
    private Builder b;


    @BeforeEach
    public void setup(){
        b = new Builder();
        c = new CalculadorSLAPorPlano();
        data = new Date();
        cl = new Cliente(0, null, null, null, null);
        //ch = new Chamado(0, null, 0, 0, null, null, null, data, data, data, 0);
        ch = new Chamado(b);
    }

    
    @Test
    public void testaPlanoBasic(){
        
       cl.setPlano("Basic");
       ch.setCliente(cl);
       Date s = new Date(data.getTime() + TimeUnit.DAYS.toMillis(4)) ;
       Chamado c2 = c.calculaSLA(ch);
       Date status = c2.getPrazoLimite();
       assertEquals(s,status);
        
      
    }
    
    @Test
    public void testaPlanoPremium(){
        
        cl.setPlano("Premium");
        ch.setCliente(cl);
        Date s = new Date(data.getTime() + TimeUnit.DAYS.toMillis(2)) ;
        Chamado c2 = c.calculaSLA(ch);
        Date status = c2.getPrazoLimite();
        assertEquals(s,status);
        
      
    }
    

}