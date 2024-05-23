package generics.pares;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "José");
		resultadoConcurso.adicionar(3, "Lucas");
		resultadoConcurso.adicionar(4, "Ana");
		resultadoConcurso.adicionar(5, "Fulano");
		resultadoConcurso.adicionar(2, "Ciclano");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(3));
		System.out.println(resultadoConcurso.getValor(2));
	}


}
