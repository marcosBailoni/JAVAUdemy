package oo.composicao.primeiroDesafio;

import java.util.ArrayList;

public class Cliente {

	String nome; 
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente (String nome){
		this.nome = nome;
	}
	
	void addCompras(Compra compra) {
		compras.add(compra);
	}
	
	double total;
	double obterValorTotal() {
		for(Compra compra: compras) {
			total += compra.obterValorDaCompra();
		}
		return total;
	}
}
