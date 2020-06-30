package com.controlechamados.Interface.Persistence;
import java.util.Map;
import com.controlechamados.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface RepoClientes extends CrudRepository<Cliente, Integer> {
    
     Map<Integer,Cliente> Clientes (int idcliente);
     Map<Integer,Cliente>findall();

}
