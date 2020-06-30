package com.controlechamados.Interface.Persistence;
import java.util.*;
import com.controlechamados.Entity.Tecnico;
import org.springframework.data.repository.CrudRepository;

public interface RepoTecnicosImpl extends CrudRepository<Tecnico,Integer> {
    
     //HashMap<Integer,Tecnico> Tecnicos (int idtecnico);
     //HashMap<Integer,Tecnico>findall();

}