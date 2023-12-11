package fundamentosExerciciosFinais;

import java.util.Scanner;

public class AreaTriangulo {

	//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor da base do triângulo em CM: ");
		double base = entrada.nextDouble();
		
		
		System.out.print("Digite o valor da altura do triângulo em CM: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("O triângulo possui área de %.2f centímetros", area);
		entrada.close();
		
	}
}
