package oo.composicao.primeiroDesafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	void addItem(Item item) {
		itens.add(item);
	}
//	Nesse método, adiciona o item no ArrayList, criando o produto, dentro da criação do item;
	void addItem(String nome, double preco, int quantidade) {
		addItem(new Item(quantidade, new Produto(nome, preco)));
	}
	
	double total;	
	double obterValorDaCompra() {
		for (Item item: itens) {
			total += item.produto.preco * item.quantidade;
		}
		return total;
	}

}
