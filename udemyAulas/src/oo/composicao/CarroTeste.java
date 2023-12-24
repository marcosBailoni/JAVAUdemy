package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println("fator injecao: " + c1.motor.fatorInjecao);
		System.out.println("carro ligado: " + c1.estaLigado());
		System.out.println("giros: " +  c1.motor.giros());
	
		c1.ligar();
		System.out.println("chamando o metodo: ligar(): ");
		System.out.println("fator injecao: " + c1.motor.fatorInjecao);
		System.out.println("carro ligado: " + c1.estaLigado());
		System.out.println("giros: " +  c1.motor.giros());
		
		c1.acelerar();
		System.out.println("depois de acelerar uma vez, giros:   " +c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar(); // como definimos um máximo de taxa de injeção, o motor não ultrapassa 9000 de giros. 
		System.out.println("depois de acelerar algumas vezes, giros: " + c1.motor.giros());
		
		
		c1.frear();
		System.out.println("depois de frear, giros: " + c1.motor.giros());
	
	}
	

}
