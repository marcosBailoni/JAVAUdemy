package fundamentosExerciciosFinais;

import java.util.Scanner;

public class CalculoIMC {

//	Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua altura em cm: ");
		double altura = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Digite seu peso em KG: ");
		double peso = entrada.nextDouble();
		entrada.nextLine();
		
		entrada.close();
		
		altura = altura / 100; // converter altura para metros;
		
		double resultado = peso / (altura * altura);
		
		System.out.printf("Seu IMC é de: %.2f", resultado);
		
//		System.out.println(altura);
//		System.out.println(peso);
		
//		 IMC = peso / (altura * altura)
//		peso em kg, altura em m
	}
}
