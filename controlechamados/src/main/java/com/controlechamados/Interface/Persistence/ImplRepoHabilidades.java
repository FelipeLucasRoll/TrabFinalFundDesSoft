package com.controlechamados.Interface.Persistence;

import java.util.HashMap;
import java.util.Map;
import com.controlechamados.Entity.Habilidade;
import com.controlechamados.UseCases.Repository.RepoHabilidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImplRepoHabilidades implements RepoHabilidade {

    private Map<Integer,Habilidade> listahabilidades;

    @Autowired
    public ImplRepoHabilidades() throws InterruptedException {
        listahabilidades = new HashMap<Integer, Habilidade>();

        //for(int i = 1 ; i <= 20 ; i+=4){
            listahabilidades.put(1,new Habilidade(1  , "Computador Nao Liga", 'h'));
            listahabilidades.put(2,new Habilidade(2, "Monitor Nao Liga", 'h'));
            listahabilidades.put(3,new Habilidade(3, "Nao Conecta Internet", 'h'));
            listahabilidades.put(4,new Habilidade(4, "Windows Nao Inicia", 's'));
            listahabilidades.put(5,new Habilidade(5, "Microsoft Office Nao Abre", 's'));
            listahabilidades.put(6,new Habilidade(6, "AntiVirus Desatualizado", 's'));
       //}
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