package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) /2; // recebe dois Double e retorna um Double (media dos dois recebidos)
		
		Function<Double, String> conceito = m -> m < 7 ? "Reprovado" : "Aprovado";	// recebe um valor double e verifica se é aprovado ou reprovado.
		
		// recebe dois doubles e retorna uma String
		BiFunction<Double, Double, String> passou = (n1, n2) -> {
			double resultadoFinal = (n1 + n2) / 2;
			return resultadoFinal < 7 ? "Reprovado" : "Aprovado";
		};
		
		
		
		

		System.out.println("resultado do binaryoperator: " + media.apply(9.5, 5.5));
		
		System.out.println("resdultado do biFunction: " + passou.apply(10.0, 4.0));
		
		System.out.println("resdultado da function + binary operator: " + media.andThen(conceito).apply(10.0, 4.0));
		
		
	}


}
