package com.controlechamados.Interface.Webserver;

import java.util.*;
import com.controlechamados.Entity.Chamado;
import com.controlechamados.UseCases.Services.ServicosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servcliente")
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
		//List<LinhaTabelaChamadosClienteDTO> listaDTO = new ArrayList<LinhaTabelaChamadosClienteDTO>();
		//for (Chamado c : lista){
		//	LinhaTabelaChamadosClienteDTO lin = new LinhaTabelaChamadosClienteDTO(c);
		//	listaDTO.add(c);
		//}
		//return listaDTO;
		return lista;
	}

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



}
