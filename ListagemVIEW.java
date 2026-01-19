package com.leilao.view;

import com.leilao.Leilao;
import com.leilao.dao.LeilaoDAO;
import java.util.List;

public class ListagemVIEW {
    public void listar() {
        LeilaoDAO dao = new LeilaoDAO();
        List<Leilao> itens = dao.listarTodos();
        System.out.println("--- Listagem de Itens ---");
        for (Leilao item : itens) {
            System.out.println("Item: " + item.getNome() + " - Valor: " + item.getValorInicial() + " - Status: " + item.getStatus());
        }
    }

    public void clicarBotaoVender(Leilao leilao) {
        LeilaoDAO dao = new LeilaoDAO();
        dao.venderProduto(leilao);
        System.out.println("Produto " + leilao.getNome() + " marcado como Vendido!");
    }

    public void clicarBotaoConsultarVendas() {
        new VendasVIEW().exibir();
    }
}
