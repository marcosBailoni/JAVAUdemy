package classe;

public class Produto2Teste {

	public static void main(String[] args) {
		
//		Criando instância por construtor padrão
		Produto2 p2 = new Produto2();
		p2.nome = "Caderno";
		p2.preco = 10.00;

//		printando precoComDesconto calculado com metodo do objeto;
		System.out.println(p2.nome + " " + p2.precoComDesconto());

		
//		Criando instância usando construtor com parâmetros:
		Produto2 p3 = new Produto2("Sanfona", 10);
		System.out.println(p3.nome + " " + p3.precoComDesconto());
		
		
//		printando precoComDesconto sem criar instância, usando método da classe Produto2 e não de instância;
		System.out.println(Produto2.precoComDesconto(10));
	
	}

}