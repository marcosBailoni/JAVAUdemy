package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
//		A pilha "Deque" tem o sistema parecido com a fila, mas o utlimo a entrar é o primeiro a sair: LiFo
		
		livros.add("Pequeno Principe"); // add boolean ou null
		livros.push("O Hobbit");// retora exceção caso não consiga adicionar o livro corretamente.
		livros.add("Don Quixote");
		
		//Aceita forEach
		for(String livro: livros)
			System.out.println(livro);
			
		
		
		System.out.println(livros.peek()); // peek e element contonuam pegando o próximo elemento;
		System.out.println(livros.element()); // no caso da pilha, tem o LIFO em consideração;
		
		System.out.println(livros.remove()); // retorna exceção 
		System.out.println(livros.poll()); // retorna null / boolean
		System.out.println(livros.pop()); // remove também, como o remove, retornando exceção;
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		
		
		
	}
}