package fundamentos;

public class ConversaroNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
//		convertendo num1 pra string e depois contando quantos caracteres possui na string
	
//		fazendo usando variaveis:
		
		String texto = num1.toString();
		System.out.println(texto + "!!!");
		System.out.println(texto.length());
		
		int num2 = 545;
		String texto2 = Integer.toString(num2);
		System.out.println(texto2.length() + "!!!");
//		Acima: Puxando o .Integer direto pra variável int
		
		
		String texto3 = num2+"";
		System.out.println(texto3.length() + "!!!");		
//		Convertendo int pra string somando o int + uma string vazia "";
		
//		Funciona pros outros wrappers também .
		
	
	}

}
