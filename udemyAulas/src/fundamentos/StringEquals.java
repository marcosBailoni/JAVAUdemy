package fundamentos;

public class StringEquals {

	public static void main(String[] args) {

		String s1 = new String("2"); // forma de declarar String mais completa
		String s2 = "2";
		String s3 = " 2 "; // String com espaçamentos no conteúdo;
		System.out.println(s1 == "2"); //
		System.out.println(s2 == "2"); // declaracao comum de string funciona
		System.out.println(s1 == s2); // string pra string não funciona

		System.out.println("Teste com Equals: " + (s2.equals(s1) ? "Iguais" : "Diferente"));
		System.out.println("Teste com Equals + espaço na String: " + (s1.equals(s3) ? "Iguais" : "Diferente"));
		System.out.println("Teste com Equals + espaço na String usando .trim pra ignorar espaçamentos: "
				+ (s1.equals(s3.trim()) ? "Iguais" : "Diferente"));

	}

}
