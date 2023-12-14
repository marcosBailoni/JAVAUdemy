package classeDesafioFinal;

import java.util.Scanner;

public class JantarTeste2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		Pessoa p1 = new Pessoa ();
		
		System.out.printf("Digite seu nome: ");
		p1.nome = entrada.nextLine();
		
		System.out.printf("Digite seu peso: ");
		p1.peso = entrada.nextDouble();
		
		entrada.nextLine();
		
		Comida c1 = new Comida ("Frango", 0.200);
		Comida c2 = new Comida ("Arroz", 0.600);

		
		System.out.printf("O peso de %s é de %.2fKG", p1.nome, p1.peso);
		
		p1.comer(c1, c2);
		
		System.out.println();
		System.out.printf("Após a janta, o peso de %s é de %.2fKG", p1.nome, p1.peso);
		
		entrada.close();

	}
		
}


