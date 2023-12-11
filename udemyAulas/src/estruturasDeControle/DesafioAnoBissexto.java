package estruturasDeControle;

import java.util.Scanner;

public class DesafioAnoBissexto {
//	2. Criar um programa informa se o ano atual é um ano bissexto;
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o ano atual: ");
		int ano = entrada.nextInt();
				
		if (ano % 100 == 0) {
			if (ano % 400 == 0) {
				System.out.println("Ano Bissexto!");
			} else {
				System.out.println("Ano não Bissexto!");
			}
		} else if (ano % 4 == 0) {
			System.out.println("Ano Bissexto!");
		} else {
			System.out.println("Ano não Bissexto!");
		}
		
		
		
		entrada.close();
		
		
	}
}
