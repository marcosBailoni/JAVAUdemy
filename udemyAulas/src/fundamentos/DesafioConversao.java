package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

//	desafio consiste em receber 3 valores pelo scanner, somar e fazer uma média
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String primeiro = entrada.nextLine().replace(",", ".");

		System.out.println("Digite o segundo salário: ");
		String segundo= entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salário: ");
		String terceiro = entrada.nextLine().replace(",", ".");
		
		Double soma = Double.parseDouble(primeiro) + Double.parseDouble(segundo) + Double.parseDouble(terceiro);
		Double media = soma/3;
// 		System.out.println(primeiro);
		
 		System.out.printf("A soma dos três salários é de %.2f e a média é de %.2f", soma, media);
		entrada.close();
	}
}
