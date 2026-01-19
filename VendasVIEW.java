package com.leilao.view;

import com.leilao.Leilao;
import com.leilao.dao.LeilaoDAO;
import java.util.List;

public class VendasVIEW {
    public void exibir() {
        LeilaoDAO dao = new LeilaoDAO();
        List<Leilao> vendidos = dao.listarProdutosVendidos();
        System.out.println("--- Tela de Vendas (Itens Vendidos) ---");
        for (Leilao item : vendidos) {
            System.out.println("Item: " + item.getNome() + " - Status: " + item.getStatus());
        }
    }
}
