package com.leilao;

import com.leilao.dao.LeilaoDAO;
import com.leilao.view.ListagemVIEW;
import com.leilao.view.VendasVIEW;

public class TesteFuncionalidades {
    public static void main(String[] args) {
        System.out.println("### INICIANDO TESTE DE FUNCIONALIDADES - ATIVIDADE 3 ###\n");

        LeilaoDAO dao = new LeilaoDAO();
        ListagemVIEW listagem = new ListagemVIEW();
        VendasVIEW vendas = new VendasVIEW();

        // 1. Cadastrar produtos
        System.out.println("1. Testando Cadastro...");
        dao.salvar(new Leilao("Vaso Antigo", 150.0));
        dao.salvar(new Leilao("Quadro Renascentista", 2500.0));
        dao.salvar(new Leilao("Relógio de Bolso", 300.0));

        // 2. Listar todos
        System.out.println("\n2. Testando Listagem Geral...");
        listagem.exibir();

        // 3. Vender um produto
        System.out.println("3. Vendendo o item 'Vaso Antigo' (índice 0)...");
        listagem.venderItem(0);

        // 4. Listar novamente para ver o status alterado
        System.out.println("\n4. Verificando alteração de status na listagem geral...");
        listagem.exibir();

        // 5. Consultar tela de vendas (apenas vendidos)
        System.out.println("5. Testando Tela de Vendas (Filtro: Vendidos)...");
        vendas.exibir();

        System.out.println("\n### TESTE FINALIZADO COM SUCESSO ###");
    }
}
