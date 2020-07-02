package com.controlechamados.controlechamados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.controlechamados.Entity.Habilidade;
import com.controlechamados.Entity.Tecnico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TecnicoTest {
    private Tecnico t;
    private List<Habilidade> habilidades;
    //private Habilidade h;

    @BeforeEach
    public void setup() {

        t = new Tecnico(0, null, null, null, null, habilidades, 0);
        habilidades = new ArrayList<Habilidade>();
       // h = new Habilidade(10, "Limpeza", 'H');
    }

    @Test
    public void testaIDTecnico() {
        t.setIdtecnico(123);
        int status = t.getIdtecnico();
        int s = 123;
        assertEquals(s, status);
    }

    @Test
    public void testaNome() {
        t.setNome("Roberto");
        String status = t.getNome();
        String s = "Maria";
        assertNotEquals(s, status);
    }

    @Test
    public void testaCpf() {
        t.setCpf("123");
        String status = t.getCpf();
        String s = "123";
        assertEquals(s, status);
    }

    @Test
    public void testaLogin() {
        t.setLogin("rr1234");
        String status = t.getLogin();
        String s = "rr1234";
        assertEquals(status, s);
    }

    @Test
    public void testaSenha() {
        t.setSenha("012345");
        String status = t.getSenha();
        String s = "012345";
        assertEquals(status, s);
    }

    @Test
    public void testaAvaliacao() {
        t.setAvaliacao(9.6);
        double s = 10;
        double status = t.getAvaliacao();
        assertTrue(status < s);
    }

    @Test
    public void testaHabilidades() {
    t.setHabilidades(habilidades);
    List<Habilidade> s = new ArrayList<>();
    s.add(new Habilidade(10, "Limpeza", 'H'));
    List<Habilidade> status = t.getHabilidades();
    assertNotEquals(status,s);
}


}