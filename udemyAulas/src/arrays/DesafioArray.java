package arrays;


import java.util.Scanner;

public class DesafioArray {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas irá digitar ?: ");
		int quantidade = entrada.nextInt();
		
		double[] notas = new double[quantidade];
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota: ");
			notas[i] = entrada.nextDouble();
			
		}
		
		double soma = 0;
		
		for(double nota: notas) {
			soma += nota;
		}

		double media = soma / quantidade;
		
		System.out.printf("A média do aluno é de: %.2f", media);
		//		for (int i = 0; i < notas.length; i++) {
//			System.out.println(notas[i]);
//		}
		
		
		
		
		entrada.close();
	}
}
