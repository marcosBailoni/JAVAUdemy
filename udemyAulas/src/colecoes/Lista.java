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
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario ("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Bruno"));
		lista.add(new Usuario("Caio"));
		lista.add(new Usuario("Diego"));
		lista.add(new Usuario("Elano"));
		lista.add(new Usuario("Fulano"));
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Imprimindo pelo for: " + lista.get(i).nome);
		}
		System.out.println();
		
		
		for (Usuario s: lista) {
			System.out.println("Usando método toString() com pré definição: \n" + s);
		} 
		
		
		
		for (Usuario s: lista) {
			System.out.println("Imprimindo pelo ForEach: " + s.nome);
		}
		
		System.out.println();//pular linha
		System.out.println("Print usando lista.get(indice).nome: " + lista.get(3).nome + "\n");
		
		
		lista.remove(1);
	
		for (Usuario s: lista) {
			System.out.println("Imprimindo depois de remover o indice 1 : " + s.nome);
		}
		System.out.println();//pular linha
		lista.remove(new Usuario("Ana"));
		
		for (Usuario s: lista) {
			System.out.println("Imprimindo depois de remover por nome *Ana*: " + s.nome);
		}
		System.out.println();//pular linha
		boolean possui = lista.contains(new Usuario("Elano"));
		System.out.println("Armazenando um valor booleano na variável para verificar se possui algum usuario com nome *Elano*: " + possui);
	}
}