package lambdas;



import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("iPad", 3235.0, 0.13);
	
		Function<Produto, Double> precoComDesconto = produto -> (1 - produto.desconto) * produto.preco; 
		
		UnaryOperator<Double> precoComImposto = preco -> preco < 2500 ? preco : preco * (1 - 0.085);
		
		UnaryOperator<Double> precoComFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		UnaryOperator<Double> precoArredondado = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));

		Function<Double, String> formatado = preco -> "R$" + preco;
		

		System.out.println(precoComDesconto.apply(p1));
	
		System.out.println(precoComImposto.apply(p1.preco));
		
		System.out.println(precoComFrete.apply(p1.preco));		
		
		System.out.println(formatado.apply(p1.preco));
		
		System.out.println(precoArredondado.apply(4555.6667));
		
		System.out.println(precoComDesconto.andThen(precoComImposto).andThen(precoComFrete).andThen(precoArredondado).andThen(formatado).apply(p1));
		

		
		
		
		
		
//		BinaryOperator<Double>
	
	
	
	}
}









//a partir do produto calcular o preco real (com desconto)
//Imposto >= 2500 (8,5%) / < 2500 (isento)
//Frete >= 3000 (100) / <3000 (50)
// dEIXAR DUAS CASAS DECIMAIS;
//Formatar: + "R$"