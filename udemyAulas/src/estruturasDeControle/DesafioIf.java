package estruturasDeControle;

public class DesafioIf {
	
	public static void main(String[] args) {
		
		double nota = 1.3;
		
		if(nota >= 9.0); {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");
		}
	}
}

//	Desafio consiste em descobrir o motivo do aluno receber os prints, mesmo tirando 1.3 e nã0 9 ou mais:
//	O ";" depois do if, finaliza a sentença if, e os prints não estão vinculados a ele, mesmo sem o if, 
//	os prints continuariam aparecendo