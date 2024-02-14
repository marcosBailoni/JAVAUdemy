package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		
		try {			
			System.out.println(7 / entrada.nextInt());	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {   
			System.out.println("Finally");
			entrada.close();
			
		}
		
//		O finally sempre será executado, mesmo que o try gere erro e chame o catch ou que dê certo e passe direto
		
	}
}
