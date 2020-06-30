package com.controlechamados.Interface.Persistence;
import java.util.Map;
import com.controlechamados.Entity.Chamado;
//import org.springframework.data.repository.CrudRepository;

public interface RepoChamados {//extends CrudRepository<Chamado, Integer> {
    
     Map<Integer,Chamado> Chamados (int idchamado);
     Map<Integer,Chamado>findall();

}