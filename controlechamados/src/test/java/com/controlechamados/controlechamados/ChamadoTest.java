package com.controlechamados.controlechamados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import com.controlechamados.Entity.Chamado;
import com.controlechamados.Entity.Cliente;
import com.controlechamados.Entity.Habilidade;
import com.controlechamados.Entity.Chamado.Builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChamadoTest {
    private Chamado c;
    private Date data;
    private Builder b;
    private Habilidade h;
    private Cliente cl;
    
@BeforeEach
public void setup(){

    b = new Builder();
    h = new Habilidade(1, "Limpeza", 'H');
    cl = new Cliente(123, "a", "a", "a", "a");
   // c = new Chamado(0, null, 0, 0, null, null, null, data, data, data, 0);
    c = new Chamado(b);
    
    data = new Date();

}

@Test
public void testaIDChamado(){
    c.setIdchamado(1234);
    int status = c.getIdchamado();
    int s = 1234;
    assertEquals(s, status);
}

@Test
public void testaCliente(){
    c.setCliente(cl);
    Cliente status = c.getCliente();
    assertNotNull(status);
}


//@Test
//public void testaIDCliente(){
//    c.setIdcliente(1234);
//    int status = c.getIdcliente();
//    int s = 12334;
//    assertNotEquals(s, status);
//}

@Test
public void testaHabilidade(){
  c.setHabilidade(h);
  Habilidade status = c.getHabilidade();
   assertNotNull(status);
}

@Test
public void testaTitulo(){
  c.setTitulo("A");
  String status = c.getTitulo();
   String s = "A";
   assertEquals(s, status);
}



@Test
public void testaIDTecnico(){
  c.setIdtecnico(1234);
  int status = c.getIdtecnico();
   int s = 1234;
   assertEquals(s, status);
}


@Test
public void testaStatus(){
    c.setStatus("ok");
    String status = c.getStatus();
    String s = "ok";
    assertEquals(s, status);
}


@Test
public void testaDescricao(){
    c.setDescricao("ok");
    String status = c.getDescricao();
    String s = "oi";
    assertNotEquals(s, status);
}



@Test
public void testaHoraAbertura(){
    c.setHoraAbertura(data);
    Date status = c.getHoraAbertura();
    Date s = data;
    assertEquals(s, status);
}

@Test
public void testaHoraFechamento(){
    c.setHoraFechamento(data);
    Date status = c.getHoraFechamento();
    Date s = data;
    assertEquals(s, status);
}

@Test
public void testaPrazoLimite(){
    c.setPrazoLimite(data);
    Date status = c.getPrazoLimite();
    Date s = data;
    assertEquals(s, status);
}

@Test
public void testaPrioridade(){
c.setPrioridade(3);
int s = c.getPrioridade();
int status = 1;
assertTrue(status < s);




}


}