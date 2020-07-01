package com.controlechamados.Interface.Webserver;

import java.util.Date;
import com.controlechamados.Entity.Chamado;

public class ResponseNovoChamadoDTO {

    private Integer numchamado;
    private String titulo;
    private String nometecnico;
    private Date dataabertura;
    private int prioridade;
    private Date prazoSLA;
    private String habilidadecategoria;
    private String descricao;

   public ResponseNovoChamadoDTO(Chamado c){
        this.numchamado = new Integer(c.getIdchamado());
        this.titulo = c.getTitulo();
        this.nometecnico = "nenhum";
        this.dataabertura = c.getHoraAbertura();
        this.prioridade = c.getPrioridade();
        this.prazoSLA = c.getPrazoLimite();
        this.habilidadecategoria = c.getHabilidade().getNome();
        this.descricao =c.getDescricao();
    }

    public String getHabilidadeCategoria() { return this.habilidadecategoria;}
    public String getNomeTecnico() {return this.nometecnico;}
    public String getTitulo() {return  this.titulo;}
    public String getDescricao() {return  this.descricao;}
    public Date getprazoSLA() {return this.prazoSLA;}
    public Integer getNumChamado() {return this.numchamado;}
    public int getPrioridade() {return this.prioridade;}
    public Date getDataAbertura() {return this.dataabertura;}
    
}