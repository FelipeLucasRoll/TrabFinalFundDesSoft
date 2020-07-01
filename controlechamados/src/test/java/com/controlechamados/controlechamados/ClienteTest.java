package com.controlechamados.controlechamados;

import com.controlechamados.Entity.Cliente;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class ClienteTest {
    private Cliente c;
    
 @BeforeEach
public void setup(){

 c = new Cliente(0, null, null, null, null, null, null, null, null);

}



@Test
public void testaIDCliente(){
    c.setIdcliente(123);
    int status = c.getIdcliente();
    int s = 123;
    assertEquals(s, status);
}

@Test
public void testaNome(){
    c.setNome("Roberto");
    String status = c.getNome();
    String s = "Maria";
    assertNotEquals(s, status);
}



@Test
public void testaCpf(){
    c.setCpf("123");
    String status = c.getCpf();
    String s = "123";
    assertEquals(s, status);
}

@Test
public void testaDataNasc(){
    c.setDatanasc("01/01/1991");
    String status = c.getDatanasc();
    String s = "01/01/1991";
    assertEquals(status,s);
}

@Test
public void testaTelefone(){
    c.setTelefone("33445566");
    String status = c.getTelefone();
    String s = "33445566";
    assertEquals(status,s);
}

@Test
public void testaEmail(){
    c.setEmail("r@hotmail.com");
    String status = c.getEmail();
    String s = "rr@hotmail.com";
    assertNotEquals(status,s);
}

@Test
public void testaLogin(){
    c.setLogin("rr1234");
    String status = c.getLogin();
    String s = "rr1234";
    assertEquals(status,s);
}

@Test
public void testaSenha(){
    c.setSenha("012345");
    String status = c.getSenha();
    String s = "012345";
    assertEquals(status,s);
}

@Test
public void testaPlano(){
    c.setPlano("Basic");
    String status = c.getPlano();
    String s = "Basic";
    assertEquals(status,s);
}


}