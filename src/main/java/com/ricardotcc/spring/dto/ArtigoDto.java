package com.ricardotcc.spring.dto;

public class ArtigoDto 
{

    private Long codigo;
    private String titulo;
    

    public ArtigoDto()
    {

    }

    public ArtigoDto(Long codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
