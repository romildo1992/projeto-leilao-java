package com.leilao;

public class Leilao {
    private Long id;
    private String nome;
    private Double valorInicial;

    public Leilao(String nome, Double valorInicial) {
        this.nome = nome;
        this.valorInicial = valorInicial;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public Double getValorInicial() { return valorInicial; }
}
