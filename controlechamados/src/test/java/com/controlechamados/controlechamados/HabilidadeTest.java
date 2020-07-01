package com.controlechamados.controlechamados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.controlechamados.Entity.Habilidade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HabilidadeTest {

    private Habilidade h;


    @BeforeEach
    public void setup(){
    
     h = new Habilidade(0, null, '0', false);
    
    }

    @Test
    public void testaIDHabilidade(){
        h.setIdhabilidade(1234);
        int status = h.getIdhabilidade();
        int s = 1234;
        assertEquals(s, status);
    }
    
    @Test
    public void testaNome(){
        h.setNome("Carlos");
        String status = h.getNome();
        String s = "jose";
        assertNotEquals(s, status);
    }
    
    
    
    @Test
    public void testaTipoHS(){
        h.setTipoHS('H');;
        char status = h.getTipoHS();
        char s = 'H';
        assertEquals(s, status);
    }
    
    @Test
    public void testaManager(){
        
        boolean status = true;
        h.setManager(status);
        assertTrue(status);
    }


}