package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioMap {	
	
	public static void main(String[] args) {
		
		 Consumer<Integer> imprimir = System.out::println;
		 
		 List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 		 
		 Function<Integer, String> getBinario = n -> Integer.toBinaryString(n);
		 
		 UnaryOperator<String> inverterString = n -> new StringBuilder(n).reverse().toString();
		 
		 Function<String, Integer> getInteiro= n -> Integer.parseInt(n, 2);
		 
		 System.out.println("\n\nSomente os binários da lista: ");
		 nums.stream().map(getBinario).forEach(System.out::println);
		 System.out.println("\n\n Composicao completa: ");
		 
		 nums.stream()
		 .map(getBinario) // poderia ser "Integer::toBinaryString"
		 .map(inverterString)
		 .map(getInteiro)
		 .forEach(imprimir);
		 
		 
		 System.out.println("Imprimir binário de 6: " + getBinario.apply(6));
		 System.out.println("Imprimir o binário de 6 ao contrário: " + getBinario.andThen(inverterString).apply(6));
		 System.out.println("Transformar o binário de 6 ao contrário em inteiro: " + getBinario.andThen(inverterString).andThen(getInteiro).apply(6));
		 
		 
	
	}
	
	

}