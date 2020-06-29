package com.controlechamados.controlechamados;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.controlechamados.Entity.Chamado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ControlechamadosApplicationTests {

	@Test
	void contextLoads() {
	}

	@BeforeEach
	public void setup(){
    Chamado c = new Chamado("ok");
	}


	@Test
	public void testaStatus(){
    String status = c.getStatus();
    String s = "ok";
    assertEquals(s, status);
	}



}
