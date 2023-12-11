package estruturasDeControle;

import java.util.Scanner;

public class DesafioMediaFinal {
//	3. Criar um programa que receba duas notas parciais, calcular a média final. 
//	Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
//	se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
//	caso contrário imprime no console "Reprovado".
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.printf("A média foi de: %.2f. Parabéns aluno aprovado!!", media);
		} else if (media > 4) {
			System.out.printf("A média foi de: %.2f. Aluno de recuperação!!", media);
		} else {
			System.out.printf("A média foi de: %.2f. Aluno reprovado!!", media);
		}
		
		entrada.close();
	}
}
