package generics;

public class CaixaIntFilhaTeste {
	
	public static void main(String[] args) {
		CaixaIntFilha caixaA = new CaixaIntFilha();
		
		caixaA.guardar(123);
		
		System.out.println(caixaA.abrir());
	}
}
