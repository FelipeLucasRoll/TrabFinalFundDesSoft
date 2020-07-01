package com.controlechamados.UseCases.Repository;
import java.util.Map;
import com.controlechamados.Entity.Habilidade;
//import org.springframework.data.repository.CrudRepository;

public interface RepoHabilidade {//extends CrudRepository<Habilidade,Integer> {
    
     Map<Integer,Habilidade>findall();

}