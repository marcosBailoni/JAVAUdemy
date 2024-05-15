package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class OutrosMetodos {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		Consumer<Aluno> imprimir = System.out::println;
		
		System.out.println("distinct: ");
		alunos.stream().distinct().forEach(imprimir); // Distinct só retorna os não repetidos: No caso, precisa ter um hashcode implementado, pois está validando pelo endereço de memória
		
		System.out.println("\n Skip / Limit");
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(imprimir);
		
		System.out.println("\nTakeWhile");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7)
			.forEach(imprimir);

		
		
	}

}