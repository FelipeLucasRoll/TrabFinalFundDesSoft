package com.controlechamados.Interface.Persistence;
import java.util.Map;
import com.controlechamados.Entity.Chamado;
import org.springframework.data.repository.CrudRepository;

public interface RepoChamadosImpl extends CrudRepository<String,Chamado> {
    
     Map<String,Chamado> Chamados (int idchamado);
     Map<String,Chamado>findall();

}