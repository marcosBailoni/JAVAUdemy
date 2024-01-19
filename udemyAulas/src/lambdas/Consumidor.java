package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = prod -> System.out.println("Nome dos produtos: " + prod.nome); 
		Consumer<Produto> imprimirDesconto = prod -> System.out.println("Desconto dos produtos: " + prod.desconto); 
		
		
		Produto p1 = new Produto("Caderno", 12, 0.10);
		Produto p2 = new Produto("lapiseira", 5, 0.10);
		Produto p3 = new Produto("caneta", 2, 0.10);
		Produto p4 = new Produto("borracha", 4, 0.10);
		Produto p5 = new Produto("lapis", 1, 0.10);
		
		imprimirNome.accept(p1); // accept é o método de consumer pra receber um parâmetro e não retornar nada, 
//		(como o parâmetro é uma função lambda que imprime o preço de produto, ele irá imprimir o preço do produto e não retornar nada;
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(imprimirDesconto);
		produtos.forEach(produto -> System.out.println("Preço dos produtos : R$" + produto.preco));
		produtos.forEach(System.out::println);
	}
}
