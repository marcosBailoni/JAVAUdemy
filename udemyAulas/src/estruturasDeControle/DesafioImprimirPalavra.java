package estruturasDeControle;

import java.util.Scanner;

//8. Criar um programa que receba uma palavra e imprime no console letra por letra.
public class DesafioImprimirPalavra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Escreva uma palavra: ");
		String palavra = entrada.next();
		
		int contador = 0;
		
		while (contador < palavra.length()) {
			System.out.println(palavra.charAt(contador));
			contador++;
		}
				
		entrada.close();
	}
}
