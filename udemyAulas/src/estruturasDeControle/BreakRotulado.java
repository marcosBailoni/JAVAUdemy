package estruturasDeControle;

public class BreakRotulado {

	public static void main(String[] args) {
		
// Nesse caso, o break está dentro do For interno, e quebrará o fluxo deste mesmo for, o externo irá continuar	
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					break;
				}
				
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();// para pular linha
		}
			
		System.out.println("\n\nSegundo exemplo: ");
		
//Nesse caso, o break está apontando para o FOR denominado externo, com isso, ele fecha o fluxo do for externo, pulando para o "fim"
//		Não recomendado: 
		externo: for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					break externo;
				}
				
				System.out.printf("[%d %d]", i, j);
			}
			
			System.out.println();
		}
		
		System.out.println("FIM");
	}
}
