package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();


    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta azul", 1.99);
        Produto borracha = new Produto(2, "Borracha", "Borracha branca", 3.99);
        Produto lapis = new Produto(3, "Lápis", "Faber Castel", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Faber Castel", 7.99);
        Produto caderno = new Produto(5, "Caderno", "Caderno 96 folhas", 15.99);
        Produto controle = new Produto(5, "Controle", "Controle TV", 69.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(controle);

    }

    public List<Produto> getProdutos() {
        return produtos;
    }


    public List<Produto> buscarTodosProdutos() {
        return this.getProdutos();
    }

    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p: this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

}




