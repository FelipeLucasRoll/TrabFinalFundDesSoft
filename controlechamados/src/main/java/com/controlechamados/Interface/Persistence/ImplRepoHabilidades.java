package com.controlechamados.Interface.Persistence;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.controlechamados.Entity.Habilidade;
import com.controlechamados.UseCases.Repository.RepoHabilidade;

import org.springframework.beans.factory.annotation.Autowired;

public class ImplRepoHabilidades implements RepoHabilidade {

    private Map<Integer,Habilidade> listahabilidades;

    @Autowired
    public ImplRepoHabilidades() throws InterruptedException {
        listahabilidades = new HashMap<Integer, Habilidade>();
        for(int i = 1 ; i <= 20 ; i+=4){
            listahabilidades.put(i,new Habilidade(i  , "Hardware Not Manager", 'h', false));
            listahabilidades.put(i,new Habilidade(i+1, "Hardware Manager", 'h', true));
            listahabilidades.put(i,new Habilidade(i+2, "Software Not Manager", 's', false));
            listahabilidades.put(i,new Habilidade(i+3, "Software Manager", 's', true));
       }
    }


    @Override
    public Map<Integer, Habilidade> findall() {
        // TODO Auto-generated method stub
        return listahabilidades;
    }

    @Override
    public Habilidade buscaPeloIdHabilidade(Integer idcli) {
        // TODO Auto-generated method stub
        return listahabilidades.get(idcli);
    }

    @Override
    public Habilidade addHabilidade(Habilidade hab) {
        // TODO Auto-generated method stub
        Integer id = hab.getIdhabilidade();
        return listahabilidades.put(id, hab);
    }
    
}