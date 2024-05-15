package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterMap {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caderno", 17.00, 0.40, 0.0);
		Produto p2 = new Produto("Apontador", 5.00, 0.10, 10.0);
		Produto p3 = new Produto("Borracha", 2.00, 0.30, 10.0);
		Produto p4 = new Produto("Lapiseira", 7.00, 0.30, 10.0);
		Produto p5 = new Produto("Fichário", 22.00, 0.30, 0.0);
		Produto p6 = new Produto("Lápis", 1.5, 0.0, 0.0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> descontoBom = p -> p.desconto >= 0.30;
				
		Predicate<Produto> freteGratis = p -> p.frete == 0;
		
		Function<Produto, String> superPromocao = p -> "O produto " + p.nome + " está com uma super promoção e frete grátis";
		
		produtos.stream()
		.filter(descontoBom)
		.filter(freteGratis)
		.map(superPromocao)
		.forEach(System.out::println);
		
	
	
	
	}
}