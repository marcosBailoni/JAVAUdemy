package colecoes;

import java.util.ArrayList;

//List
//pode ser heterogeneo
//pode ser homogeneo
//aceita obj duplicados
//é ordenado
//é indexado

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<UsuarioHashCode> lista = new ArrayList<>();
		
		UsuarioHashCode u1 = new UsuarioHashCode ("Ana");
		
		lista.add(u1);
		lista.add(new UsuarioHashCode("Bruno"));
		lista.add(new UsuarioHashCode("Caio"));
		lista.add(new UsuarioHashCode("Diego"));
		lista.add(new UsuarioHashCode("Elano"));
		lista.add(new UsuarioHashCode("Fulano"));
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Imprimindo pelo for: " + lista.get(i).nome);
		}
		System.out.println();
		
		
		for (UsuarioHashCode s: lista) {
			System.out.println("Usando método toString() com pré definição: \n" + s);
		} 
		
		
		
		for (UsuarioHashCode s: lista) {
			System.out.println("Imprimindo pelo ForEach: " + s.nome);
		}
		
		System.out.println();//pular linha
		System.out.println("Print usando lista.get(indice).nome: " + lista.get(3).nome + "\n");
		
		
		lista.remove(1);
	
		for (UsuarioHashCode s: lista) {
			System.out.println("Imprimindo depois de remover o indice 1 : " + s.nome);
		}
		System.out.println();//pular linha
		lista.remove(new UsuarioHashCode("Ana"));
		
		for (UsuarioHashCode s: lista) {
			System.out.println("Imprimindo depois de remover por nome *Ana*: " + s.nome);
		}
		System.out.println();//pular linha
		boolean possui = lista.contains(new UsuarioHashCode("Elano"));
		System.out.println("Armazenando um valor booleano na variável para verificar se possui algum usuario com nome *Elano*: " + possui);
	}
}
