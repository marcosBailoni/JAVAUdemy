package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo a calculadora!!!");
		
		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
			
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Digite qual é a operação por meio dos sinais: +, -, * ou /: ");
		String operadorEntrada = entrada.nextLine();
		
		entrada.close();
		
		double soma = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		double res = num1 % num2;
//		String invalido = "valor digitado inválido";
		
		Double resultadoDireto = operadorEntrada.equals("+")? soma : 0;
		resultadoDireto = operadorEntrada.equals("-")? sub: resultadoDireto;
		resultadoDireto = operadorEntrada.equals("*")? mult: resultadoDireto;
		resultadoDireto = operadorEntrada.equals("/")? div: resultadoDireto;
		resultadoDireto = operadorEntrada.equals("%")? res: resultadoDireto;
		
		System.out.println(resultadoDireto);
		

		Double resultadoParcial = operadorEntrada.equals("+")?soma : sub;
		Double resultadoParcial2 = operadorEntrada.equals("*")?mult : resultadoParcial;
		Double resultadoFinal = operadorEntrada.equals("/")?div : resultadoParcial2;
		Double resultadoFinal2 = operadorEntrada.equals("%")?res : resultadoFinal;
		System.out.println(resultadoFinal2);
		
		
		
		
		
		
		
		
		
//		double media = 4.5;
//		
//		String resultadoParcial = media >= 5 ? " recuperação" : " reprovado";
//		String resultadoFinal = media >= 7 ? " aprovado" : resultadoParcial;
//		System.out.println(resultadoFinal);
		
//		System.out.printf("%.2f %.2f %s", num1, num2, operadorEntrada);
		
		
		
		
		
		// ler num1
		// ler num2
		// + - * / 
		// fazer operação
	}

}
