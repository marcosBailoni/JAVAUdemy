package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

//	Map  recebe um metodo / funcao lambda e aplica em uma stream, retorna uma nova stream com a mesma quantidade da stream de entrada =
//			Ex:
//			Um array de 4 objetos (produto)
//			O map pode ser montado para pegar apenas o nome de cada produto e retornar uma nova stream de 4 objetos (somente os nomes dos produtos)

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW", "Audi", "Mercedes");
		
		UnaryOperator<String> maiusculo = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> exclamado = n -> n + "!!! ";
		
		marcas.stream().map(exclamado).forEach(print);  // transforma o marcas em stream, chama o map para realizar uma funcao intermediária e o forecha pra terminal;
	
		System.out.println("\n\nImprimindo via composição: ");
		
		marcas.stream()
		.map(maiusculo)
		.map(primeiraLetra)
		.map(exclamado)
		.forEach(print);
		
	
	}
	


}