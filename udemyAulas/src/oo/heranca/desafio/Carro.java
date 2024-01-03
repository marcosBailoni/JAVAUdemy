package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	
	Carro (int VELOCIDADE_MAXIMA) {
		this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
	}
	
	void acelerar() {
		if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;		
		} else {
		velocidadeAtual += 5;	
		}			
	}
	
	boolean frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
			return true;
			
		} else if (velocidadeAtual > 0 && velocidadeAtual < 5) {
			velocidadeAtual = 0;
			return true;
			
		} else {
			return false;
		}
	
	
	}
}
