package excecao;

public class Basico {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		// Abaixo, irá retornar o erro para a variável "e" e depois imprimir o erro;
		try {
			System.out.println(a1.nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Abaixo irá retornar o print no lugar do erro, guardando a exercao na variável "e";
		try {
			System.out.println(a1.nome);
		} catch (Exception e) {
			System.out.println("Erro para imprimir o nome do Aluno!!!");;
		}
		
		//ambos: erro impresso pela variável e + mensagem escrita;
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Erro ao dividir por 0");
		}
		

		System.out.println("Fim");
	}
}
