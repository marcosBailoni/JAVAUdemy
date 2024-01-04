package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta;

	protected Carro(int VELOCIDADE_MAXIMA) {
		this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}

	public boolean frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
			return true;

		} else if (velocidadeAtual > 0 && velocidadeAtual < 5) {
			velocidadeAtual = 0;
			return true;

		} else {
			return false;
		}

	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
