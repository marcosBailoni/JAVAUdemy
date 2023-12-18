package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		
		double[] notas = {5.0, 6, 7.8, 9.5};
		
		//usando for each para percorrer todos indices do array;
		
		for(double nota: notas) {
			System.out.println("Nota impressa pelo Foreach: " + nota);
		}
	
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota pelo laço for: " + notas[i]);
		}
	
	}

}