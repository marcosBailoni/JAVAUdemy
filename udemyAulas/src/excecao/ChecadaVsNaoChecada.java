package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		//totalmente tratado para não retornar nada do erro, apenas um println;
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//tratado para retornar o erro + o print
		try {
			geraErro2();
		} catch (Throwable e) {			
//			e.printStackTrace();
			System.out.println("erro 2, tratado direto no main, fora da implementação do método!");
			System.out.println(e.getMessage()); // pegando msg implementada no metodo
		}
		
		System.out.println("Fim!");
	}
	
	// RuntimeException é uma excecao não checada, não precisa de tratamento; 
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro 1");
	}
	
//	O geraErro2, por ser do tipo Exception, precisa ter um tryCatch definido no metodo (um tratamento) ou de forma explicita "throws" e o tipo da execao indicada, para mostrar que pode ocorrer a excecao
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro 2");
	}



}
