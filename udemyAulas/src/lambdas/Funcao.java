package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";
		
		Function<String, String> resultado = valor -> "O resultado é " + valor;

		Function<String, String> exclamado = valor -> valor + "!!!";
		
		
		String teste = exclamado.apply(resultado.apply(parOuImpar.apply(33))); // atribuindo as funcoes em uma váriavel
		
		String teste2 = parOuImpar.andThen(resultado).andThen(exclamado).apply(33); // usando then, pra não usar apply toda hora, "apply de uma funcao e entao, apply outra funcao. etc.."
	
		

		System.out.println(parOuImpar.apply(33));
		
		System.out.println(resultado.apply(parOuImpar.apply(33))); // usando outra funcao dentro de apply;
		
		System.out.println(exclamado.apply(parOuImpar.apply(33))); // usando outra funcao em apply novamente.
		
		System.out.println(exclamado.apply(resultado.apply(parOuImpar.apply(33)))); // usando apply das 3 funçoes uma em outra.
		
		System.out.println(parOuImpar.andThen(resultado).andThen(exclamado).apply(33)); // usando apply das 3 funçoes uma em outra.

		System.out.println("Váriavel atribuindo funcao em funcao: " + teste);
		
		System.out.println("Váriavel usando andThen: " + teste2);
		
		
	
	
	}

}
