package fundamentosExerciciosFinais;

import java.util.Scanner;

public class Temperatura {
	
//	Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
//
//	Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite 1 para converter para Celsius ou Digite 2 para converter para Fahreinheit: ");
		String converterPara = entrada.next();
		
		System.out.printf("Digite o valor para ser convertido: ");
		double valor = entrada.nextDouble();
		entrada.nextLine();
		
		// converterPara = 1;
		double converterParaC = (valor - 32) * 5/9;
		
		//converterPara = 2
		double converterParaF = (valor * 9/5) + 32;
		
		double resultado = converterPara.trim().equals("1") ? converterParaC : converterParaF;
				
		System.out.println(resultado);


		entrada.close();
		
//		(°F − 32) × 5/9 = C
//		(C × 9/5) + 32 = F


		//F = C x 1,8 + 32
		//C = 5/9 x (F - 32)
	}

}
