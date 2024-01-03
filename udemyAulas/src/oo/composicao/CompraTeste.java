package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "João Pedro";
		
		c1.addItem("Caneta", 20, 7.45);
		c1.addItem(new Item("Borracha", 12, 3.89));
		c1.addItem(new Item("Caderno", 3, 18.79));
		
		
	
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		System.out.printf("Itens da compra: ");
		for(Item item: c1.itens) {
			System.out.printf(item.nome + " ");			
			
		}
		
		System.out.println();
		System.out.println(c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal());
		
		// acessando o cliente da compra, pelo atributo do item (compra);
		System.out.println(c1.itens.get(0).compra.cliente);
		System.out.println(c1.itens.get(2).compra.cliente);
	}

}