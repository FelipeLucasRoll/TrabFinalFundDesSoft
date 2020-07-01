package com.controlechamados.UseCases.Repository;
import java.util.Map;
import com.controlechamados.Entity.*;

//import org.springframework.data.repository.CrudRepository;

public interface RepoChamados {//extends CrudRepository<Chamado, Integer> {
     Map<Integer,Chamado>  recuperaPorCliente(Integer idcli);
     Map<Integer,Chamado>findall();
     Chamado addChamado(Chamado c);

}