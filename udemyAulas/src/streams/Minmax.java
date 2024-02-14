package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Minmax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		
		Comparator<Aluno> MelhorNota = (aluno1, aluno2) -> {			
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;	
		};

		Comparator<Aluno> PiorNota = (aluno1, aluno2) -> {			
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;	
		};
		
		System.out.println(alunos.stream().max(MelhorNota).get()); // max pega o maior resultado
		System.out.println(alunos.stream().max(PiorNota).get()); 
		
		System.out.println(alunos.stream().min(MelhorNota).get());// min pega o menor resultado
		System.out.println(alunos.stream().min(PiorNota).get());
		
		
	}
}

//Retornar -1: Indica que o primeiro objeto é "menor" que o segundo objeto na ordem desejada. Isso significa que o primeiro objeto deve aparecer antes do segundo quando a lista for ordenada.
//
//Retornar 0: Indica que os dois objetos são "iguais" na ordem desejada. Isso significa que a ordem relativa entre esses dois objetos não importa, pois eles são considerados equivalentes em termos de ordenação.
//
//Retornar 1: Indica que o primeiro objeto é "maior" que o segundo objeto na ordem desejada. Isso significa que o primeiro objeto deve aparecer depois do segundo quando a lista for ordenada.