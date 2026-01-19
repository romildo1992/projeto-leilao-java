package com.leilao.dao;

import com.leilao.Leilao;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeilaoDAO {
    private static List<Leilao> bancoSimulado = new ArrayList<>();

    public boolean salvar(Leilao leilao) {
        try {
            bancoSimulado.add(leilao);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Leilao> listarTodos() {
        return bancoSimulado;
    }

    public void venderProduto(Leilao leilao) {
        leilao.setStatus("Vendido");
    }

    public List<Leilao> listarProdutosVendidos() {
        return bancoSimulado.stream()
                .filter(p -> "Vendido".equals(p.getStatus()))
                .collect(Collectors.toList());
    }
}
