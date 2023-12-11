package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {

//		Wrappers são os objetos dos tipos primitos
//				inteiros
		
//		byte
		Byte b = 5;
		
//		short
		Short s = 200;
		System.out.println(s);
//		int
		Integer i = 1000;
		System.out.println(i);
//		long
		Long l = 10000L; 
		System.out.println(l);
		
		String numeral = ("55555");
			
//		Convertendo string pra Integer
		Integer teste = Integer.parseInt(numeral);
//		
		System.out.println(teste);
		
//		float
		Float f = 123.52F;
		System.out.println(f);
		
//		double
		Double d = 12345.5555;
		System.out.println(d);
		
//		boolean
		Boolean bo = true;
//		imprimindo o boolean em formato de string em Uppercase:
		System.out.println(bo.toString().toUpperCase());
		
//		char
		Character c = '#';
		//atribuindo o c em uma outra variável tipo String e concatenando !!!;
		String mudandoC = c.toString() + "!!!";
		System.out.println(mudandoC);
		
		System.out.println(b.toString());
		
	}

}
