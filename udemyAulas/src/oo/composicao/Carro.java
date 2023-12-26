package oo.composicao;

public class Carro {

	Motor motor = new Motor();
	Porta p1 = new Porta();
	Porta p2 = new Porta();

	void acelerar() {
		if (motor.ligado) {
			if (motor.fatorInjecao <= 2.6) {
				motor.fatorInjecao += 0.4;
			}
		}
	}

	void frear() {
		if (motor.ligado) {
			if (motor.fatorInjecao >= 1.4) {
				motor.fatorInjecao -= 0.4;
			}
		}
	}

	void ligar() {
		if(!p1.estaAberta && !p2.estaAberta) {
		motor.ligado = true;
		}
	}

	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
