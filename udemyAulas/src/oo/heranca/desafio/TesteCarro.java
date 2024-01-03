package oo.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro civic = new Civic(210);
		Carro ferrari = new Ferrari(312);
		
		System.out.println("Velocidade inicial do Civic: " + civic.velocidadeAtual);
		System.out.println("Velocidade inicial da Ferrari: " + ferrari.velocidadeAtual);
		
		civic.acelerar();
		ferrari.acelerar();
	
		System.out.println("Velocidade final do Civic depois de acelerar 1x: " + civic.velocidadeAtual);
		System.out.println("Velocidade final da Ferrari depois de acelerar 1x: " + ferrari.velocidadeAtual);
		
		civic.frear();
		ferrari.frear();
		
	
		System.out.println("Velocidade final do Civic depois de acelerar 1x e frear 1x: " + civic.velocidadeAtual);
		System.out.println("Velocidade final da Ferrari depois de acelerar 1x e frear 1x:  " + ferrari.velocidadeAtual);
		
		civic.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		//mesmo freando várias vezes, a velocidadeAtual não diminui mais que zero: 
		System.out.println(ferrari.velocidadeAtual);
	
	}

}