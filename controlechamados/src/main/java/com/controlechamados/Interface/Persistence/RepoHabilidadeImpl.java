package com.controlechamados.Interface.Persistence;
import java.util.Map;
import com.controlechamados.Entity.Habilidade;
import org.springframework.data.repository.CrudRepository;

public interface RepoHabilidadeImpl extends CrudRepository<Habilidade,Integer> {
    
     //Map<Integer,Habilidade> habilidades (int idhabilidade);
     //Map<Integer,Habilidade>findall();

}