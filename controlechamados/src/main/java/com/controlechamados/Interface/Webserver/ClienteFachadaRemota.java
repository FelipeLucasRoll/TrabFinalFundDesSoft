package com.controlechamados.Interface.Webserver;

import java.util.*;
import com.controlechamados.Entity.Chamado;
import com.controlechamados.Entity.Cliente;
import com.controlechamados.UseCases.Services.ServicosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/servcliente",consumes = "*")
public class ClienteFachadaRemota {

	private ServicosCliente servCliente;

	@Autowired
	public ClienteFachadaRemota(ServicosCliente servicoCliente) {
		this.servCliente = servicoCliente;
	}

	@GetMapping("/listachamados")
	public List<Chamado> getChamadosCliente(@RequestParam Integer idcli) throws Exception {
		Map<Integer, Chamado> chamadosdocliente = servCliente.listaDeChamados(idcli);
		List<Chamado> lista = new ArrayList<Chamado>(chamadosdocliente.values());
		return lista;
	}

	@CrossOrigin
	@GetMapping("/listachamadosdto")
	public List<LinhaTabelaChamadosClienteDTO> getChamadosClienteDTO(@RequestParam Integer idcli) throws Exception {
		Map<Integer, Chamado> chamadosdocliente = servCliente.listaDeChamados(idcli);
		List<Chamado> lista = new ArrayList<Chamado>(chamadosdocliente.values());
		List<LinhaTabelaChamadosClienteDTO> listaDTO = new ArrayList<LinhaTabelaChamadosClienteDTO>();
		for (int i = 0 ; i< lista.size();i++){
			LinhaTabelaChamadosClienteDTO lin = new LinhaTabelaChamadosClienteDTO(lista.get(i));
			listaDTO.add(lin);
		}
		return listaDTO;
	}


	@GetMapping("/listaclientes")
	public List<Cliente> getClientes() throws Exception {
		Map<Integer, Cliente> clientes = servCliente.listaDeClientes();
		List<Cliente> lista = new ArrayList<Cliente>(clientes.values());
		return lista;
	}

	@GetMapping("/dadosdocliente")
	public Cliente getClientePeloID(@RequestParam Integer idcli) throws Exception {
		Cliente cliente = servCliente.BuscaDadosDoCLiente(idcli);
		return cliente;
	}

	@PostMapping("/persistenovochamado")
	public ResponseNovoChamadoDTO postNovoChamadoDTO(@RequestParam Integer idcli, @RequestParam Integer habcat, @RequestParam String tit, @RequestParam String desc, @RequestParam Integer cau, @RequestParam Integer imp) throws Exception {
		RequestNovoChamadoDTO requestDTO = new RequestNovoChamadoDTO(idcli, habcat, tit, desc, cau, imp);
		Chamado chamadoaberto = servCliente.abrirChamado(requestDTO);
		ResponseNovoChamadoDTO responseDTO = new ResponseNovoChamadoDTO(chamadoaberto);
		return responseDTO;
	}


}
