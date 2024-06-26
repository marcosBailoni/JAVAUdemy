package lambdas;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.printf("digite o primeiro número: ");
		Double a = entrada.nextDouble();
		
		System.out.printf("digite o segundo número: ");
		Double b = entrada.nextDouble();
		entrada.close();
		
		
//		Interface padrão do java, que recebe um tipo e retorna um valor do mesmo tipo: BinaryOperator<> (usa o aply pra trazer o resultado;
		
		BinaryOperator<Double> calcSoma = (x, y) -> x + y;
		System.out.println(calcSoma.apply(a, b));
		
		BinaryOperator<Double> calcMultiplicacao = (x, y) -> x * y;
		System.out.println(calcMultiplicacao.apply(a, b));
		
		
		
	}

}