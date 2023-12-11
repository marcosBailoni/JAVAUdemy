package estruturasDeControle;
//9. Crie um programa que recebe 10 valores e ao final imprima o maior número.

import java.util.Scanner;

public class DesafioMaiorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numFinal = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			int numero = entrada.nextInt();
			
			if (numero > numFinal) {
				numFinal = numero;
			}
		
		}
		
		System.out.println("O maior número digitado foi: " + numFinal);
		
		entrada.close();
	}
}
