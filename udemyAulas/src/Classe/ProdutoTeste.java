package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
	
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4200.00;
		p1.desconto = 0.25;
	
//		Criando produto usando construtor com os 3 parâmetros: 
		Produto p2 = new Produto("Caderno", 22.00, 0.12);
//		p2.nome = "Caderno";
//		p2.preco = 22.00;
//		p2.desconto = 0.12;
		
		double precoFinalP1 = p1.precoComDesconto();
		double precoFinalP2 = p2.precoComDesconto(0.1);
		
		System.out.printf("O preço final do produto %s é de R$%.2f.", p1.nome, precoFinalP1);
		System.out.println();
		System.out.printf("O preço final do produto %s é de R$%.2f.", p2.nome, precoFinalP2);
		
	
	}
}
