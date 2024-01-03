package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	
	Ferrari(){
		super(315);
	}
	 
	Ferrari (int VELOCIDADE_MAXIMA) {
		super(VELOCIDADE_MAXIMA);
	}
	
	void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}

}
