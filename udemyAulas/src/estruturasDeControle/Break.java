package estruturasDeControle;

//Break interrompe o laço "for"
 
public class Break {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;
			}
			
			System.out.println("i = " + i);
		
		}
		
		System.out.println("saiu do for! ");
	}
}
