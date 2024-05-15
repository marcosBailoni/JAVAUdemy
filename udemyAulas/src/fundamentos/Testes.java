package fundamentos;

public class Testes {

	public static void main(String[] args) {
		
		int numero = -1;
	    boolean ePrimo = false;
	      
	      if(numero < 0) {
	        System.out.println("Digite um número positivo!!");
	      } else if (numero == 1 || numero == 2) {
	        ePrimo = true;
	      } else if(numero > 2 && numero < 101) {
	          for (int j = 2; j < numero; j++){
	            if (numero % j == 0){
	              ePrimo = false;
	              break;
	            } else {
	              ePrimo = true;
	            }
	          }
	      }
	      
	      if(ePrimo == false){
	        System.out.println("Não é primo");
	      } else {
	        System.out.println("É primo");
	      }
	  
	}

}
