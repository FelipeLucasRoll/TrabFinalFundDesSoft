package com.controlechamados.Interface.Persistence;

import java.util.*;

import com.controlechamados.Entity.Chamado;
import com.controlechamados.Entity.Cliente;
import com.controlechamados.UseCases.Repository.RepoChamados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImplRepoChamados implements RepoChamados {

    private Map<Integer,Chamado> chamados;

    @Autowired
    public ImplRepoChamados(){
        chamados = new HashMap<Integer, Chamado>();

        Cliente teste = new Cliente(666, "ClienteTeste", "077.027.430-77", "teste@teste.com", "abc123", "Basic");
        
        for(int i = 1000 ; i < 1020 ; i++){
            chamados.put(i,new Chamado.Builder().cliente(teste).build());


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
        return result;
    }

    //@Override
    //public Map<Integer, Chamado> Chamados(int idchamado) {
    //    // TODO Auto-generated method stub
    //    return null;
    //}

    //@Override
    //public Map<Integer, Chamado> findall() {
    //    // TODO Auto-generated method stub
    //    return chamados;
    //}


 
    
}