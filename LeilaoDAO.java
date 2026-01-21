package com.leilao.dao;

import com.leilao.Leilao;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe DAO para gerenciar as operações de persistência do Leilão.
 * Nota: Em um cenário real, esta classe conteria a conexão JDBC com o MySQL.
 * Para fins desta atividade, utilizamos uma lista estática para simular o banco de dados.
 */
public class LeilaoDAO {
    // Lista estática para garantir que os dados persistam entre as diferentes telas (VIEWs)
    private static final List<Leilao> bancoSimulado = new ArrayList<>();

    public boolean salvar(Leilao leilao) {
        try {
            if (leilao.getStatus() == null || leilao.getStatus().isEmpty()) {
                leilao.setStatus("A venda");
            }
            bancoSimulado.add(leilao);
            System.out.println("[DAO] Produto salvo com sucesso: " + leilao.getNome());
            return true;
        } catch (Exception e) {
            System.err.println("[DAO] Erro ao salvar produto: " + e.getMessage());
            return false;
        }
    }

    public List<Leilao> listarTodos() {
        return new ArrayList<>(bancoSimulado);
    }

    public boolean venderProduto(int index) {
        try {
            if (index >= 0 && index < bancoSimulado.size()) {
                bancoSimulado.get(index).setStatus("Vendido");
                System.out.println("[DAO] Produto no índice " + index + " atualizado para 'Vendido'");
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Leilao> listarProdutosVendidos() {
        return bancoSimulado.stream()
                .filter(p -> "Vendido".equalsIgnoreCase(p.getStatus()))
                .collect(Collectors.toList());
    }
}
