package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		System.out.println("Teste alterando e printando um por um: ");
		String s = "Bom dia X";
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		s = s.replace("X", "doido");
		System.out.println(s);
		
		System.out.println("Tudo em uma só sentença: ");
		
		String y = "Bom dia X";
		y = y.replace("X", "fulano").toUpperCase().concat("!!!");
		System.out.println(y);
		
	}
}
