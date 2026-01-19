package com.leilao;

public class Leilao {
    private Long id;
    private String nome;
    private Double valorInicial;
    private String status; // "A venda" ou "Vendido"

    public Leilao(String nome, Double valorInicial) {
        this.nome = nome;
        this.valorInicial = valorInicial;
        this.status = "A venda";
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public Double getValorInicial() { return valorInicial; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
