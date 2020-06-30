package com.controlechamados.Interface.Persistence;

import java.util.*;

import com.controlechamados.Entity.Chamado;
import com.controlechamados.Entity.Cliente;

public class ImplRepoChamados implements RepoChamados {

    private Map<Integer,Chamado> chamados;

    public ImplRepoChamados(){
        chamados = new HashMap<Integer, Chamado>();

        Cliente teste = new Cliente(666, "ClienteTeste", "077.027.430-77", "teste@teste.com", "abc123", "Basic");
        
        for(int i = 1000 ; i < 1020 ; i++){
            chamados.put(i,new Chamado.Builder().cliente(teste).build());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie)
            {}

        }
    }

    @Override
    public Map<Integer, Chamado> recuperaPorCliente(Cliente cli) {
        // TODO Auto-generated method stub
        Map<Integer, Chamado> result = new HashMap<Integer, Chamado>();
        for (Chamado c : chamados.values()) {
            if (c.getCliente().getIdcliente() == cli.getIdcliente()){
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