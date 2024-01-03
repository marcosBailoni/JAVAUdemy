//oo.composicao.desafio
// Desafio: 
//Cliente 
//	nome;
//	terá uma lista de compras
//	(metodo para calcular quanto foi gasto em dinheiro no total, percorrendo todos itens)
//
//Compra
//	
//	terá uma lista de itens 
//	obter valor total da compra
//
//Item
//	
//	terá um produto
//	int terá atributo de quantidade
//
//Produto
//	preço
//	nome
package oo.composicao.primeiroDesafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente ("José");
		
		Produto produto1 = new Produto("Caderno", 15.50);
//		Produto produto2 = new Produto("Lapis", 2.00);
		Produto produto3 = new Produto("Lapiseira", 5.50);
		Produto produto4 = new Produto("Borracha", 1.00);

		Item item1 = new Item(5, produto1);
//		Item item2 = new Item(2, produto2);
		Item item3 = new Item(10, produto3);
		Item item4 = new Item(1, produto4);
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.addItem(item1);
//		compra1.addItem(item2);
		compra1.addItem("Lapis", 2, 2); // item2 (usando o metodo de adicionar da classe compra, que cria o produto e o item diretamente;
		
		compra2.addItem(item3);
		compra2.addItem(item4);
		
		cliente1.addCompras(compra1);
		cliente1.addCompras(compra2);
		
		System.out.println(cliente1.obterValorTotal());
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}