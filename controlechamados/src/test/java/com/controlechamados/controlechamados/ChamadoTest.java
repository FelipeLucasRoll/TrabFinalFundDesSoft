package com.controlechamados.controlechamados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.controlechamados.Entity.Chamado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChamadoTest {
    private Chamado c;
    
@BeforeEach
public void setup(){



}


@Test
public void testaStatus(){
    String status = c.getStatus();
    String s = "ok";
    assertEquals(s, status);
}

}