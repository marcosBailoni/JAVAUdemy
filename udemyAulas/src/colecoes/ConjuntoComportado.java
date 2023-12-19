package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
//	set -> HashSet
//	pode ser heterogeneo (dados com tipos diferentes)
//	pode ser homogeneo (dados com tipos iguais)
//	nao aceita obj duplicados
//	pode ser ordenado
//	nao é indexado

	public static void main(String[] args) {
		
//		O SET/HashSET não aceita ordenação, ele ordena de forma "aleatória"
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(120);
		nums.add(7);
	
		System.out.println(nums);
	
		Set<String> nomes = new HashSet<>();
		nomes.add("Alexa");
		nomes.add("Bruna");
		nomes.add("Caio");
		nomes.add("Dado");
		
		System.out.println("Set + HashSet para mostrar os valores, mas não ordena conforme a ordem de inserção: \n" + nomes + "\n");
		
//		Para resolver questões de ordenação, usar SortedSet + TreeSet:
		
		SortedSet<String> nomesOrdenados = new TreeSet<>();
		nomesOrdenados.add("Alexa");
		nomesOrdenados.add("Bruna");
		nomesOrdenados.add("Caio");
		nomesOrdenados.add("Dado");
		
		System.out.println("SortedSet + TreeSet para mostrar os valores ordenados: \n" + nomesOrdenados);
		
	}


}
