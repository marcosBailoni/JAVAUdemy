package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional Foreach:");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n Lambda Foreach:");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference Foreach: ");
		aprovados.forEach(System.out::println);	
		//não é possível adicionar nada mais, somente imprimir diretamente

		
		System.out.println("\n Lambda Foreach02:");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference Foreach02: ");
		aprovados.forEach(Foreach::meuImprimir);	
		//não é possível adicionar nada mais, somente imprimir diretamente
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Olá! Meu nome é: " + nome);
	}
		
}