package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> somarDois = numero -> numero + 2; 
		UnaryOperator<Integer> multiplicaPorDois = numero -> numero * 2; 
		UnaryOperator<Integer> aoQuadrado = numero -> numero * numero; 
		
		int teste1 = somarDois.andThen(multiplicaPorDois).andThen(aoQuadrado).apply(0); // andThen() faz na ordem de escrita: soma dois, multiplica por dois e potenciação;
		
		int teste2 = aoQuadrado.compose(multiplicaPorDois).compose(somarDois).apply(0); // compose() faz na ordem ao contrário da escrita, pra ter o mesmo resultado, escreva ao inverso;
		
		
		System.out.println(teste1);
	
		System.out.println(teste2);
	}

}
