package com.controlechamados.Interface.Persistence;
import java.util.*;

import com.controlechamados.Entity.*;
import com.controlechamados.UseCases.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImplRepoClientes implements RepoClientes  {

    private Map<Integer,Cliente> clientes;

    @Autowired
    public ImplRepoClientes() throws InterruptedException {
        clientes = new HashMap<Integer, Cliente>();
        Calendar calendar = Calendar.getInstance();

        for(int i = 1 ; i < 15 ; i++){
            clientes.put(i,new Cliente(i, "ClienteNumero "+i+" ", "teste@teste.com", "abc"+i+i+i, "Basic"));
            calendar.add(Calendar.MINUTE, 10);
       }
        for(int i = 15 ; i < 25 ; i++){
            clientes.put(i,new Cliente(i, "ClienteNumero "+i+" ", "teste@teste.com", "abc"+i+i+i, "Premium"));
            calendar.add(Calendar.MINUTE, 10);
       }

    }

    @Override
    public Cliente buscaPeloIdCliente(Integer idcli) {
        // TODO Auto-generated method stub
        return clientes.get(idcli);
    }

    @Override
    public Map<Integer, Cliente> findall() {
        // TODO Auto-generated method stub
        return this.clientes;
    }
    
}