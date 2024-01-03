package oo.composicao;

public class CarroTestePortas {
	
	public static void main(String[] args) {
		
		//Criar portas para o carro, se alguma estiver aberta, o carro não liga.
		
		Carro c2 = new Carro();
		
		System.out.println(c2.estaLigado());
		c2.p1.abrirPorta();
		
		c2.ligar();
		System.out.println(c2.estaLigado());
		
		c2.p1.fecharPorta();
		c2.ligar();
		System.out.println(c2.estaLigado());
	}
	

}