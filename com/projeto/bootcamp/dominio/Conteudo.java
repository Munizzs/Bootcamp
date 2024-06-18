package com.projeto.bootcamp.dominio;

public abstract class Conteudo {

    protected final double XP_PADRAO=10;

    private String titulo;
    private String descricao;

    protected abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
