package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
//		conversão implicita (o JAVA converteu 1 para 1.0 / int para double automaticamente)
	
	
		double b = 2.0;
		double f = 3.5;
//		int c = b; Não aceita, pois o JAva valida que double é maior que int, e poderá haver perda de informações
//		conversão explicita (CAST), usando (int) b, que seria a parte inteira de b (2.0);
		int c = (int) b;
		
		int g = (int) f;
		
		System.out.println(c);

		System.out.println(g);
//		g ficou como uma versão do f, ignorando o 0.5 após, pois só pegou a parte inteira. 
		
	
	}
}
