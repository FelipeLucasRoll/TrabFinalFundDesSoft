package com.controlechamados.Interface.Webserver;

public class RequestNovoChamadoDTO {
    private Integer idcliente;
    private String habilidadecategoria;
    private String titulo;
    private String descricao;
    private Integer causa;
    private Integer impacto;

    public RequestNovoChamadoDTO(Integer idcli, String habcat, String tit, String desc, Integer cau, Integer imp){
        this.idcliente = idcli;
        this.titulo = tit;
        this.habilidadecategoria = habcat;
        this.causa = cau;
        this.descricao = desc;
        this.impacto = imp;
    }



    public String getHabilidadeCategoria() { return this.habilidadecategoria;}
    public Integer getIdCliente() {return  this.idcliente;}
    public String getTitulo() {return  this.titulo;}
    public String getDescricao() {return  this.descricao;}
    public Integer getCausa() {return  this.causa;}
    public Integer getImpacto() {return  this.impacto;}
}

