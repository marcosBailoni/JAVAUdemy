package estruturasDeControle;

import java.util.Scanner;

public class DesafioNumeroPrimoComSwitch {

//	4. Criar um programa que receba um número e diga se ele é um número primo.
//
//	5. Refatorar o exercício 04, utilizando a estrutura switch.
	
	
	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número pra validar se é primo: ");		
		int numero = entrada.nextInt();
		entrada.close();	
		
		int ePrimo = 0;
		
		if (numero < 2) {
			ePrimo = 1;
			
		} else {
			
			for (int i = 2; i < numero; i++) {
				
				if(numero % i == 0) {
					
					ePrimo = 1;
					break;
				
				}
				
			}
			
		}
		
		switch (ePrimo) {
		case 0: 
			System.out.println("O número é primo: ");
			break;
		 default: 
			 System.out.println("O número não é primo");
		}
		
		
		

	}
}