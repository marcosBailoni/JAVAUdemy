package fundamentosExerciciosFinais;

import java.util.Scanner;

public class ElevarValoresDeEntrada {

//	Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor para calcularmos as potências: ");
		double valor = entrada.nextDouble();
		
		double quadrado = valor * valor;
		double cubo = valor * valor * valor; 
		
		System.out.printf("O número %.2f elevado ao quadrado é %.2f e elevado ao cubo é %.2f", valor, quadrado, cubo);
		

		entrada.close();
	}
}
