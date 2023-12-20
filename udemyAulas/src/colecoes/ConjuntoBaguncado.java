package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

//		set -> HashSet
//		pode ser heterogeneo (dados com tipos diferentes)
//		pode ser homogeneo (dados com tipos iguais)
//		nao aceita obj duplicados
//		pode ser ordenado
//		nao é indexado

		HashSet conjunto = new HashSet();
		
//		Adicionar objetos em conjunto;
		conjunto.add(1.2);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add(true);
		conjunto.add('x');
		
//		Usar size() e não length para collections; 
		System.out.println(conjunto.size());
		
//		No set, não é possível adicionar elementos iguais, ele ignora apenas;
		
		conjunto.add("Teste");
		conjunto.add(1);
		System.out.println(conjunto.size());
		
//		Remover objetos de conjunto: 
		conjunto.remove("Teste");
		conjunto.remove(1);
		System.out.println(conjunto.size());
//		usar contains() para verificar se possui algo dentro do set:
		
		
		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains("Teste")); // valor foi apagado anteriormente do conjunto;
		System.out.println(conjunto.contains('x')); 
		
//		Criando outro set de outra forma
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
//		Os objetos serão impressoes como String
		System.out.println("HashSet nums: " + nums); 
		System.out.println("HashSet conjunto: " + conjunto);
		
		conjunto.addAll(nums); // união entre dois conjuntos;
		System.out.println(conjunto);
		
//		Deixar apenas o que possuem de igual: 
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
//		Clear para apagar os objetos do conjunto:
		nums.clear();
		System.out.println("nums depois do clear: " + nums);

	}
}