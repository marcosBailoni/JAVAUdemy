package estruturasDeControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		for(String valor1 = "#";!valor1.equals("######");valor1 += "#") {
			System.out.println(valor1);
			
		}
	}
}
//desafio, criar um for que imprima a mesma coisa que o for de cima, sem utilizar números para controlar o laço;