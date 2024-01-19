package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> ePar = numero -> numero % 2 == 0;
		
		Predicate<Integer> tresDigitos = numero -> numero > 99 && numero < 1000;
		
		System.out.println("É par e tem 3 digitos ?: " + ePar.and(tresDigitos).test(445));
		System.out.println("é Par ou tem 3 digitos ?: " + ePar.or(tresDigitos).test(4));
			
		
		
		
		
	}

}