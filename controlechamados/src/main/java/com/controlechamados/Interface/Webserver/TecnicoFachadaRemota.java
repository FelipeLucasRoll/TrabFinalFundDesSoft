package com.controlechamados.Interface.Webserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.controlechamados.Entity.*;
import com.controlechamados.UseCases.Services.ServicosTecnico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servtecnico")
public class TecnicoFachadaRemota {

	private ServicosTecnico servTecnico;

	/**
	 * 
	 * 
	 */
	@Autowired
	public TecnicoFachadaRemota(ServicosTecnico servicoTecnico) {
		this.servTecnico = servicoTecnico;
	}

	@GetMapping("/listachamados")
	public List<Chamado> getChamadosCliente(@RequestParam Integer idtec) throws Exception {
		Map<Integer, Chamado> chamadosdotecnico = servTecnico.listaDeChamados(idtec);
		List<Chamado> lista = new ArrayList<Chamado>(chamadosdotecnico.values());
		return lista;
	}

	@GetMapping("/listachamadosdto")
	public List<LinhaTabelaChamadosTecnicoDTO> getChamadosClienteDTO(@RequestParam Integer idtec) throws Exception {
		Map<Integer, Chamado> chamadosdotec = servTecnico.listaDeChamados(idtec);
		List<Chamado> lista = new ArrayList<Chamado>(chamadosdotec.values());
		List<LinhaTabelaChamadosTecnicoDTO> listaDTO = new ArrayList<LinhaTabelaChamadosTecnicoDTO>();
		for (int i = 0 ; i< lista.size();i++){
			//LinhaTabelaChamadosTecnicoDTO lin = new LinhaTabelaChamadosClienteDTO(lista.get(i));
			//listaDTO.add(lin);
		}
		return listaDTO;
	}


	@GetMapping("/listatecnicos")
	public List<Tecnico> getTecnicos() throws Exception {
		Map<Integer, Tecnico> clientes = servTecnico.listaDeTecnicos();
		List<Tecnico> lista = new ArrayList<Tecnico>(clientes.values());
		return lista;
	}

	@GetMapping("/dadosdotecnico")
	public Tecnico getClientePeloID(@RequestParam Integer idtec) throws Exception {
		Tecnico tecnico = servTecnico.BuscaDadosDoTecnico(idtec);
		return tecnico;
	}

	@GetMapping("/listahabilidades")
	public List<Habilidade> getListaDeTodasHabilidades() throws Exception {
		ArrayList<Habilidade> lista = new ArrayList<Habilidade>(servTecnico.listaDeHabilidades().values());
		return lista;
	}

//	@PostMapping("/persistenovochamado")
//	public ResponseNovoChamadoDTO postNovoChamadoDTO(@RequestParam Integer idcli, @RequestParam Integer habcat, @RequestParam String tit, @RequestParam String desc, @RequestParam Integer cau, @RequestParam Integer imp) throws Exception {
//		RequestNovoChamadoDTO requestDTO = new RequestNovoChamadoDTO(idcli, habcat, tit, desc, cau, imp);
//		Chamado chamadoaberto = servCliente.abrirChamado(requestDTO);
//		ResponseNovoChamadoDTO responseDTO = new ResponseNovoChamadoDTO(chamadoaberto);
//		return responseDTO;
//	}
	




}
