package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Gui", 4.7);
		Aluno a2 = new Aluno("Gui", 9.9);
		Aluno a3 = new Aluno("Gui", 6.9);
		Aluno a4 = new Aluno("Gui", 4.9);
		Aluno a5 = new Aluno("Gui", 6.8);
		Aluno a6 = new Aluno("Pedro", 8.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = n -> n.nota >= 7; //boolean para ver se a nota do aluno e maior ou igual a 7 
		
		Function<Aluno, String> mensagem = n -> "Parabéns " + n.nome + "!! Você foi aprovado!!"; // retorna uma string com o nome do aluno
		
		Consumer<String> imprimir = System.out::println; //recebe uma string e imprime 
		
		
		
		alunos.stream().filter(aprovado).map(mensagem).forEach(imprimir);
	
		
	}

}
