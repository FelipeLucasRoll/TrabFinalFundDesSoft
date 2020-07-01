package com.controlechamados.Interface.Persistence;

import java.util.*;
import com.controlechamados.Entity.*;
import com.controlechamados.UseCases.Repository.RepoChamados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImplRepoChamados implements RepoChamados {

    private Map<Integer,Chamado> chamados;

    @Autowired
    public ImplRepoChamados() throws InterruptedException {
        chamados = new HashMap<Integer, Chamado>();
        Calendar calendar = Calendar.getInstance();



        Cliente teste = new Cliente(666, "ClienteTeste", "teste@teste.com", "abc123", "Basic");
        
        for(int i = 1000 ; i < 1005 ; i++){
            chamados.put(i,new Chamado.Builder().cliente(teste).chamado(i).horaAbertura(calendar.getTime()).titulo("teste").habilidade(new Habilidade(0, "habteste", 'H', false)).build());
            calendar.add(Calendar.MINUTE, 10);
 
       }
    }

    @Override
    public Map<Integer, Chamado> recuperaPorCliente(Integer idcli) {
        // TODO Auto-generated method stub
        Map<Integer, Chamado> result = new HashMap<Integer, Chamado>();
        for (Chamado c : chamados.values()) {
            if (c.getCliente().getIdcliente() == idcli){
                result.put(c.getIdchamado(), c);
            }
            // ...
        }
        System.out.println(result.values().toString());
        return result;
    }

    @Override
    public Map<Integer, Chamado> findall() {
        // TODO Auto-generated method stub
        return chamados;
    }

    @Override
    public Chamado addChamado(Chamado c) {
        // TODO Auto-generated method stub
        chamados.put(c.getIdchamado(), c);
        return c;
    }
 
    
}