package estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma senha para fechar o programa: ");
		String senhaDigitada = entrada.nextLine().toLowerCase().trim();		
		
		String senha = "sair";
		
		// o ! nega a senha.equals, ou seja, o contrário de igual (diferente), então enquanto for diferente, vai continuar executando.
		while (!senha.equals(senhaDigitada)) {
			System.out.print("Senha inválida, tente novamente!:");
			senhaDigitada = entrada.nextLine().toLowerCase().trim();
		}
		
		System.out.println("Você acertou a senha, programa encerrado!");
		entrada.close();
	}

}
