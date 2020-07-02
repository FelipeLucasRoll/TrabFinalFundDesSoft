package com.controlechamados.Interface.Persistence;

import java.util.HashMap;
import java.util.Map;
import com.controlechamados.Entity.Tecnico;
import com.controlechamados.UseCases.Repository.RepoTecnicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImplRepoTecnicos implements RepoTecnicos {

    private Map<Integer,Tecnico> tecnicos;

    @Autowired
    public ImplRepoTecnicos() throws InterruptedException {
        tecnicos = new HashMap<Integer, Tecnico>();
    }

    @Override
    public HashMap<Integer, Tecnico> findall() {
        // TODO Auto-generated method stub
        return null;
    }
    
}