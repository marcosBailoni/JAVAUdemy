package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String texto = "";
		
		do {
			System.out.println("Digite a senha para sair: ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("sair"));
		
		System.out.println("fechando programa");
		
		entrada.close();
		
	}
}
