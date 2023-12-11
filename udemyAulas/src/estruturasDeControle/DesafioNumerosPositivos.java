package estruturasDeControle;

import java.util.Scanner;

//7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
//caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.


public class DesafioNumerosPositivos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um numero");
		int numero = entrada.nextInt();
		int total = 0;
		
		while (numero >= 0) {
			
			total += numero;
			
			System.out.println("numero = " + numero);
			System.out.println("total = " + total);
			
			System.out.println("digite positivo para somar e negativo para fechar: ");
			numero = entrada.nextInt();
			
						
		}
		
		System.out.println("total = " + total);

		entrada.close();
	}
}
