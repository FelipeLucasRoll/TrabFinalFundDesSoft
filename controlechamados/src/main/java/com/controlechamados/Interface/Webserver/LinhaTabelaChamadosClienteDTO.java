package com.controlechamados.Interface.Webserver;
import java.util.Date;
import com.controlechamados.Entity.Chamado;

public class LinhaTabelaChamadosClienteDTO {

    private Integer numchamado;
    private String titulo;
    private String nometecnico;
    private Date dataabertura;
    private int prioridade;
    private Date prazoSLA;
    private String habilidadecategoria;


    

    public LinhaTabelaChamadosClienteDTO(Chamado c){
        this.numchamado = new Integer(c.getIdchamado());
        this.titulo = c.getTitulo();
        this.nometecnico = "nenhum";
        this.dataabertura = c.getHoraAbertura();
        this.prioridade = c.getPrioridade();
        this.prazoSLA = c.getPrazoLimite();
        this.habilidadecategoria = c.getHabilidade().getNome();
    }
    
}