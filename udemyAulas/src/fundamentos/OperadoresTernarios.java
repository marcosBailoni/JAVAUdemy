package fundamentos;

public class OperadoresTernarios {

	public static void main(String[] args) {
		
		double media = 4.5;
		
		String resultadoParcial = media >= 5 ? " recuperação" : " reprovado";
		String resultadoFinal = media >= 7 ? " aprovado" : resultadoParcial;
		System.out.println(resultadoFinal);
		
		
		
	}
}
