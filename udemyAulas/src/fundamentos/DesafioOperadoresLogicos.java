package fundamentos;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		
		
		Boolean tv50 = trabalho1 && trabalho2;
		Boolean tv32 = trabalho1 ^ trabalho2;
		Boolean sorvete = trabalho1 || trabalho2;
		
		String resultadoTv50 = tv50.toString().replace("true", "verdadeiro").replace("false", "falso");		
		String resultadoTv32 = tv32.toString().replace("true", "verdadeiro").replace("false", "falso");
		String resultadoSorvete = sorvete.toString().replace("true", "verdadeiro").replace("false", "falso");
		
		
		
		System.out.println("A televisão de 50 pol foi comprada: " + resultadoTv50);
		System.out.println("A televisão de 32 pol foi comprada: " + resultadoTv32);
		System.out.println("Tomaram sorvete ?: " + resultadoSorvete);
		
			
		
		
		
	}
}
