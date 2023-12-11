package estruturasDeControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7) {
			System.out.println("Aluno aprovado!");
			System.out.println("Parabéns");
		}
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Aluno está de recuperação!!!");
		}
		
		if(media >= 0 && media < 4.5) {
			System.out.println("O Aluno está reprovado");
		}
		
		
		entrada.close();
	}
}
