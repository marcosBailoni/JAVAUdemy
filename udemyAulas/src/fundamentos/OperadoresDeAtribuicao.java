package fundamentos;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		System.out.println(c);
		
		c += b; // c = c + b;
		System.out.println(c);
		
		c -= b; // c = c - b;
		System.out.println(c);
		
		c *= b; // c = c * b;
		System.out.println(c);
		
		c /= b; // c = c / b;
		System.out.println(c);
		
		c %= b; // c = c % b; "resto da divisão" (%);
		System.out.println(c);
		
		
	}
}
