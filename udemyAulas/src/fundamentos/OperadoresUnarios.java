package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1; 
		
		a++; // a = a + 1; colocando o ++ depois do elemento, a prioridade do acréscimo sera mais baixa
		a--; // a = a - 1;

		++b; // b = a + 1; colocando o ++ antes do elemento, a prioridade do acréscimo sera mais baixa
		--b; // b = a - 1; 
		
		// numa comparação + um acréscimo de elemento, se o ++ estiver depois do elemento, só sera acrescentado 1, 
		// depois da comparação; 
		System.out.println("a = " +a);
		System.out.println("b = " + b);
		
		System.out.println(a++ == ++b); 
		
		System.out.println("a = " +a);
		System.out.println("b = " + b);
		
		// ambos valores ficaram iguais, mas o acréscimo só foi colocado no a, depois da comparação
		
			
	}
}
