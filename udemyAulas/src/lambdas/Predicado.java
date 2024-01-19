package lambdas;

import java.util.function.Predicate;

public class Predicado {

	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (1 - prod.desconto) * prod.preco >= 700;

		Produto p1 = new Produto("Notebook", 3000, 0.85);
		
		System.out.println("Produto é caro ?: " + isCaro.test(p1));
			
	}
}


