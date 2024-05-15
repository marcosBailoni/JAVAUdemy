package generics;

public class CaixaGenericsTeste {
	
	public static void main(String[] args) {
		
		CaixaGenerics<String> caixaA = new CaixaGenerics<>();
		caixaA.guardar("Nome");
		
		System.out.println(caixaA.abrir());
		
		
		CaixaGenerics<Double> caixaB = new CaixaGenerics<>();
		caixaB.guardar(2.3);
		
		System.out.println(caixaB.abrir());
	}

}
