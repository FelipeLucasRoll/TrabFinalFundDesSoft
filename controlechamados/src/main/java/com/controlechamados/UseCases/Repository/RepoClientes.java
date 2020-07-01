package com.controlechamados.UseCases.Repository;
import java.util.Map;
import com.controlechamados.Entity.Cliente;
//import org.springframework.data.repository.CrudRepository;

public interface RepoClientes {//extends CrudRepository<Cliente, Integer> {
    
     Cliente buscaPeloIdCliente(Integer idcli);
     Map<Integer,Cliente>findall();

}
