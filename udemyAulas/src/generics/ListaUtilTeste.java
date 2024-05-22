package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
	
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1 + " Com Cast");
		
		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1 + " Com Cast");
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2 + " Sem Cast");
		
		Integer ultimoNumero2 =ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero2 + " Sem Cast");
	
		//Os dois metódos são um GET do ultimo elemento da lista, um precisa de cast
		//e outro não. O que precisa de cast, é o genérico do tipo Objetct. 
		//Já o do tipo "indefinido" ou definido como bruto (<T>), não precisa de Cast,
		//Já que o tipo definido para a lista, será o tipo esperado de retorno.
	
	
	
	
	
	}
	
	
}
