package com.loja;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
        Produto pasta = new Produto(5, "Pasta", "Pasta de Tarefas TV", 19.99);
        Produto teclado = new Produto(5, "Teclado", "Teclado Mecanico", 299.99);
        Produto mouse = new Produto(5, "Mouse", "Mouse Rato", 59.99);
        Produto celular = new Produto(5, "Celular", "Celular Ultrasonico", 999.99);


        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(controle);
        this.produtos.add(pasta);
        this.produtos.add(teclado);
        this.produtos.add(mouse);
        this.produtos.add(celular);

    }

    public List<Produto> getProdutos() {
        return produtos;
    }


    public List<Produto> buscarTodosProdutos() {
        return this.getProdutos();
    }

    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p : this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

    public Produto cadastrarNovoProduto(Produto novoProduto) {
        int ultimoIndex = this.produtos.size() - 1;
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        int proximoId = ultimoProduto.getId() + 1;

        novoProduto.setId();
        this.produtos.add(novoProduto);
        return novoProduto;
    }



}




