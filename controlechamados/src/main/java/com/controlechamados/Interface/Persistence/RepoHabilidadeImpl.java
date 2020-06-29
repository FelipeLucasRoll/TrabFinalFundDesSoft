package com.controlechamados.Interface.Persistence;
import java.util.Map;
import com.controlechamados.Entity.Habilidade;
import org.springframework.data.repository.CrudRepository;

public interface RepoHabilidadeImpl extends CrudRepository<String,Habilidade> {
    
     Map<String,Habilidade> habilidades (int idhabilidade);
     Map<String,Habilidade>findall();

}