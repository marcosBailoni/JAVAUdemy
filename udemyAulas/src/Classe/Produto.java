package Classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
//	Construtores: 
//	Construtor padrão, esse vem automático ao criar a classe; Se criar um outro, o construtor padrão é perdido (caso não declarado)
	Produto (){
	}
	
//	Construtor recebendo só um parâmetro:	
	Produto (String nome){
		this.nome = nome;
	}
	
	
//	Construtor recebendo os 3 parâmetros:
	Produto (String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
//  Metodos com o mesmo nome, mas um recebe parâmetro e outro não.
	double precoComDesconto () {
		return (1 - desconto) * preco;
	}

//	 quando chamar o metodo, só será usado o de baixo, se passar algum parâmetro;
	double precoComDesconto (double descontoGerente) {
		return (1 - (desconto + descontoGerente)) * preco;
	}
	


}
