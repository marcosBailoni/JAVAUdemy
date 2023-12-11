package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = 3 > 7;
		
		System.out.println(cond1 && !cond2); // && e
		System.out.println(cond1 || cond2); // || ou 
		System.out.println(cond1 ^ cond2); // XOR / ^ ou exclusivo
		System.out.println(!!cond1); // !! inverte duas vezes, voltando pra origem
		System.out.println(!cond2); // ! inverte a condição 
		
		System.out.println("\nTabela verdade E (and) &&");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);// como começa com false, o java ignora o resto e fica com aviso
//		System.out.println(false && false);// como começa com false, o java ignora o resto e fica com aviso

		System.out.println("\nTabela verdade OU (or) ||");
//		System.out.println(true || true); // como começa com true, o java ignora o resto e fica com aviso
//		System.out.println(true || false);// como começa com true, o java ignora o resto e fica com aviso
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\nTabela verdade OU exclusivo (XOR) ^ ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade negação (NOT) ^ ");
		System.out.println(!true);
		System.out.println(!false);
	
	
	}
}
