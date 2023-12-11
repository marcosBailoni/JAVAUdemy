package estruturasDeControle;

import java.util.Scanner;

public class DesafioNumeroPar {
//	Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.printf("Digite um número: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			System.out.printf("O número %d está entre 0 e 10!", numero);
			System.out.println();
		} else {
			System.out.printf("O número %d não está entre 0 e 10!", numero);
			System.out.println();
		}
		
		if (numero % 2 == 0) {
			System.out.printf("O número %d é par!", numero);
		} else {
			System.out.printf("O número %d é ímpar!", numero);
		}
		
		entrada.close();
	}
}
