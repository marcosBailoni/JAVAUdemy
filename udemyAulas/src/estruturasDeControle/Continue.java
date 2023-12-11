package estruturasDeControle;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
//Continue: pula pra próxima repetição, interrompe somente a atual; 
//Se resto da divisão por 2 for igual a 0 (ou seja, o numero é par) "continue", ou seja, vá para o próximo laço.
//Caso não seja par, imprima o número no console