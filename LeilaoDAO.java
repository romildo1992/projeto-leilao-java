package com.leilao.dao;

import com.leilao.Leilao;
import java.util.ArrayList;
import java.util.List;

public class LeilaoDAO {
    private static List<Leilao> bancoSimulado = new ArrayList<>();

    public boolean salvar(Leilao leilao) {
        try {
            // Simulação de salvamento no banco de dados
            bancoSimulado.add(leilao);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Leilao> listarTodos() {
        return bancoSimulado;
    }
}
