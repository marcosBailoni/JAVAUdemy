package estruturasDeControle;

import java.util.Scanner;

//6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. 
//O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
//e imprima se o número inserido é maior ou menor do que o número armazenado.

public class DesafioAdivinharNumero {
	
	public static void main(String[] args) {
		
		int sorteio = (int) (Math.random() * 100);
		int chute = 0;
		int tentativas = 10;
		
		System.out.println(sorteio);
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i < 11; i++) {
			
			if (chute != sorteio) {
				System.out.printf("Chute um número de 0 a 100, você tem %d tentativas: ", tentativas);
				chute = entrada.nextInt();
				tentativas--;
				
				if (tentativas == 0) {					
					System.out.println("Você perdeu! ");		
					
				}
			
			} else {
				System.out.println("Você acertou!!");
				break;
							
			}
		
		}
		
		entrada.close();
				
	}

}
