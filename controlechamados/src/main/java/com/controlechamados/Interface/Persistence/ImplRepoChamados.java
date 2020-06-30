package com.controlechamados.Interface.Persistence;

import java.util.*;

import com.controlechamados.Entity.Chamado;

public class ImplRepoChamados implements RepoChamados {

    private Map<Integer,Chamado> chamados;

    public ImplRepoChamados(){
        chamados = new HashMap<>();
        
        chamados.put(1010,Chamado.Builder.
        chamados.put(1020,Chamado.criaAlunoExistente(1020,"Zezinho Pato",5.0,6.0));
        chamados.put(1030,Chamado.criaAlunoExistente(1030,"Luizinho Pato",6.0,4.0));
        chamados.put(1011,Chamado.criaAlunoExistente(1011,"Lala Pato",9.0,0.0));
        chamados.put(1021,Chamado.criaAlunoExistente(1021,"Lele Pato",5.0,8.0));
        chamados.put(1031,Chamado.criaAlunoExistente(1031,"Lili Pato",4.0,5.0));
    }

    @Override
    public Map<Integer, Chamado> Chamados(int idchamado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<Integer, Chamado> findall() {
        // TODO Auto-generated method stub
        return null;
    }

 
    
}