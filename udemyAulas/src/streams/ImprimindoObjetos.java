package streams;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Gui", "Luca", "Karen", "Julio");
		System.out.println("Imprimindo pelo MethodReference direto: ");
		aprovados.forEach(System.out::println);
		
		
		System.out.println("\nImprimindo pelo Foreach direto: ");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nImprimindo pelo iterator: ");
		Iterator<String> iterator = aprovados.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	
		System.out.println("\nImprimindo pela Stream: ");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	
	}

}
