package com.controlechamados.Interface.Webserver;
import com.controlechamados.UseCases.Services.ServicosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta_aluno")
public class ClienteFachadaRemota {

	private ServicosCliente servCliente;

	@Autowired
	public ClienteFachadaRemota(ServicosCliente servicoCliente) {
		this.servCliente = servicoCliente;
	}

	public DadosChamadoCli getDadosChamado(String cpf) {
		return null;
	}

	public DadosAvaliacaoCli getAvaliacao(String cpf) {
		return null;
	}

}
