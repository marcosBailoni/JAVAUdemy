package colecoes;


import java.util.HashMap;
import java.util.Map;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
//		No map, não se usa add, usa-se o PUT que adiciona o elemento caso não exista ou edita, caso já tenha;
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(150, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size()); // retorna a quantidade de elementos dentro do map;
		System.out.println(usuarios.isEmpty()); //Verifica se está vázio; 
		
		System.out.println(usuarios.keySet()); // retorna em String o primeiro valor(chave) de cada elemento do map
		System.out.println(usuarios.values()); // retorna em String o segundo valor(valor) de cada elemento do map
 		System.out.println(usuarios.entrySet()); // retorna ambos valores;
 		
 		
 		System.out.println(usuarios.containsKey(150)); //retorna boolean se exizte ou não elemento no primeiro valor;
 		System.out.println(usuarios.containsValue("Roberto")); // retorna boolean se existe ou não o elemento do segundo valor;
 		
 		System.out.println(usuarios.get(4)); // Pesquisar valor usando o primeiro dado;
 		
 		for (int chave: usuarios.keySet()) {
 			System.out.print(chave + ", ");
 		}
 		System.out.println();
 		
 		for(String valor: usuarios.values()) {
 			System.out.print(valor + ", ");
 		}
 		
 		System.out.println();
 		
		for(java.util.Map.Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.printf(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	
		System.out.println(usuarios.remove(2)); // retorna quem foi removido ou null caso n remova nenhum
 		
 		
 		
		
	}

}
