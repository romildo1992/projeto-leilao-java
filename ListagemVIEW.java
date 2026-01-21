package com.leilao.view;

import com.leilao.Leilao;
import com.leilao.dao.LeilaoDAO;
import java.util.List;

public class ListagemVIEW {
    private LeilaoDAO dao = new LeilaoDAO();

    public void exibir() {
        List<Leilao> itens = dao.listarTodos();
        System.out.println("\n======= TELA DE LISTAGEM =======");
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            for (int i = 0; i < itens.size(); i++) {
                Leilao item = itens.get(i);
                System.out.println("[" + i + "] " + item.getNome() + " | Valor: " + item.getValorInicial() + " | Status: " + item.getStatus());
            }
        }
        System.out.println("================================\n");
    }

    public void venderItem(int index) {
        if (dao.venderProduto(index)) {
            System.out.println("Sucesso: Item vendido!");
        } else {
            System.out.println("Erro: Não foi possível vender o item.");
        }
    }

    public void irParaVendas() {
        new VendasVIEW().exibir();
    }
}
