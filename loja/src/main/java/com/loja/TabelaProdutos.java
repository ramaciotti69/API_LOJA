package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    public TabelaProdutos(){
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha Branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis Faber Castell", "Lapis Faber Castell comum", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Apontador comum", 7.99);
        Produto caderno = new Produto(5, "Caderno Espiral", "Caderno Espiral de 96 folhas", 15.99);


        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);



    }
}
