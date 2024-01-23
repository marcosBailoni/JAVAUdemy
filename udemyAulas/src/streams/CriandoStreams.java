package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		// criar o stream usando stream of ou a partir de uma collection / arrays/list...
		Consumer<String> imprimir = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "JS ", "PYTHON\n");
		
		langs.forEach(imprimir);
		
		String[] maisLangs = {"Go ", "C ", "C#\n" };
				
		Stream.of(maisLangs).forEach(imprimir); // transformar o array em stream e imprimir pelo foreach + method reference
		
		Arrays.stream(maisLangs).forEach(imprimir); // tranformar o array em stream e imprimir pelo foreach + method reference
		
		Arrays.stream(maisLangs, 0, 2).forEach(imprimir); // Passando no Arrays.stream quais indices serão passados para a stream (de 0 até 2 (0, 1));
		
		List<String> outrasLangs = Arrays.asList("PHP ", "KOTLIN ", "C++");
		outrasLangs.stream().forEach(imprimir); // criar stream apartir da lista
		outrasLangs.parallelStream().forEach(imprimir); // criar stream apartir da lista não ordenada.
		
		//Stream.generate(() -> "a".forEach(print); gera a infinito
		
		//Stream.iterate(0, n -> n + 1).forEach(System.out::println); // gera numeros infinitos (começa do zero, soma um e repete); ordenado
		
		
		
		
		
	}

}
