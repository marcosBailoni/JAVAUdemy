package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //.add() lançará uma exceção caso a fila esteja cheia.
		fila.offer("Bia"); //.offer() retorna null caso a fila esteja cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element > Obeter o próximo elemento da fila sem remover:
		
		//Diferença dos dois é o comportamento quando a fila está vazia;
		
		System.out.println(fila.peek()); // retorna Null
		System.out.println(fila.peek());
		
		System.out.println(fila.element()); // lança uma exceção (erro)
		System.out.println(fila.element());
				
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
		
		//Ambos obtem o próximo elemento da fila e remove:
		//Diferença do comportamento ocorre quando a fila está vazia,
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // gera exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		
	}

}


