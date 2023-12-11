package estruturasDeControle;

import java.util.Scanner;

//4. Criar um programa que receba um número e diga se ele é um número primo.
// resultado comentado no final usando contador de divisores: 

public class DesafioNumeroPrimo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número pra validar se é primo: ");		
		int numero = entrada.nextInt();
		entrada.close();	
		
		String ePrimo = "Verdadeiro";
		
		if (numero < 2) {
			ePrimo = "Falso";
			
		} else {
			
			for (int i = 2; i < numero; i++) {
				
				if(numero % i == 0) {
					
					ePrimo = "Falso";
					break;
				
				}
				
			}
			
		}
		
		System.out.printf("O número %d é primo ?: %s", numero, ePrimo);
		
		
		
		

	}
}


//public static void main(String[] args) {
//
//	int contadorDeDivisores = 0;
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("\nDigite um numero para verificar se é primo:");
//	int numero = scanner.nextInt();
//	for (int i = 2; i < numero; i++) {
//		if (numero % i == 0) {
//			contadorDeDivisores++;
//		}
//	}
//	if (contadorDeDivisores == 0) {
//		System.out.println("\nO numero " + numero + " é primo.");
//	} else {
//		System.out.println("\nO numero " + numero + " não é primo.");
//	}
//	
//
//	scanner.close();
//
//}
