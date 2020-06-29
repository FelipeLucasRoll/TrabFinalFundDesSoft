package com.controlechamados.Interface.Persistence;
import java.util.Map;
import com.controlechamados.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface RepoClientesImpl extends CrudRepository<String,Cliente> {
    
     Map<String,Cliente> Clientes (int idcliente);
     Map<String,Cliente>findall();

}
