package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
	
		Produto p1 = new Produto();
		Produto p2 = new Produto();
	
		
		p1.nome = "Notebook";
		p1.preco = 4200.00;
		p1.desconto = 0.25;
	
		p2.nome = "Caderno";
		p2.preco = 22.00;
		p2.desconto = 0.12;
		
		double precoFinalP1 = p1.preco * (1 - p1.desconto);
		double precoFinalP2 = p2.preco * (1 - p2.desconto);
		
		System.out.printf("O preço final do produto %s é de R$%.2f.", p1.nome, precoFinalP1);
		System.out.println();
		System.out.printf("O preço final do produto %s é de R$%.2f.", p2.nome, precoFinalP2);
		
	
	}
}
