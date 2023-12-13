package classe;

public class Produto2 {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto2 (){
	}
	
	Produto2 (String nome){
		this.nome = nome;
	}
	
	
	Produto2 (String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return (1 - desconto) * preco;
	}

	
	static double precoComDesconto(double preco) {
		return (1 - desconto) * preco;
	}
	


}
