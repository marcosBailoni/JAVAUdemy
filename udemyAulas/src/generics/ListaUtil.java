package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() -1 );
	}
	
	public static <T> T getUltimo2 (List<T> lista) {
		return lista.get(lista.size() -1 );
	}
	
	
}


//Os dois metódos são um GET do ultimo elemento da lista, um precisa de cast
//e outro não. O que precisa de cast, é o genérico do tipo Objetct. 
//Já o do tipo "indefinido" ou definido como bruto (<T>), não precisa de Cast,
//Já que o tipo definido para a lista, será o tipo esperado de retorno.