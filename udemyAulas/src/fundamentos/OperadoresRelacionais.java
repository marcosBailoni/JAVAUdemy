package fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a'; // a na tabela universal é igual a 97;
		
		System.out.println(a == b);
		System.out.println(""); // pular uma linha
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println((30 <= 7) + "\n");
		
		double nota = 6.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		Boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto: " + temDesconto.toString().replace("false", "não").replace("true", "sim"));
		
		// usando ternário : exemplo
		System.out.println(temDesconto ? "Tem Desconto" : "Não tem desconto");
		
	}
}
