package estruturasDeControle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "amarela";
		
		switch (faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("tenho a faixa preta!");
		
		case "marrom": 
			System.out.println("tenho a faixa marrom!");
		
		case "roxa":
			System.out.println("tenho a faixa roxa!");
			
		case "verde":
			System.out.println("tenho a faixa verde!");
		
		case "amarela":
			System.out.println("tenho a faixa amarela!!");
		
		}
		
		System.out.println("Fim!");
	}

}
