package com.controlechamados.UseCases.Repository;
import java.util.*;
import com.controlechamados.Entity.Tecnico;
//import org.springframework.data.repository.CrudRepository;

public interface RepoTecnicos {//extends CrudRepository<Tecnico,Integer> {
    
     HashMap<Integer,Tecnico> Tecnicos (int idtecnico);
     HashMap<Integer,Tecnico>findall();

}