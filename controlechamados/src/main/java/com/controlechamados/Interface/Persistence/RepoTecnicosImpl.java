package com.controlechamados.Interface.Persistence;
import java.util.Map;
import com.controlechamados.Entity.Tecnico;
import org.springframework.data.repository.CrudRepository;

public interface RepoTecnicosImpl extends CrudRepository<String,Tecnico> {
    
     Map<String,Tecnico> Tecnicos (int idtecnico);
     Map<String,Tecnico>findall();



}