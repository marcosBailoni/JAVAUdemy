package lambdas;

public class CalculoTeste1 {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println("Depois de atribuir somar ao calculo: " + calculo.executar(2, 3));
	
		calculo = new Multiplicar();
		System.out.println("Depois de atribuir multiplicar ao calculo: " + calculo.executar(2, 3));
		
	}

}