package oo.heranca;

public class Heroi extends Jogador{
	
	
	Heroi(int x, int y) {
		super(x, y);		
	}
	
	
	
	//Reescreve o método da classe, para que o atk do heroi passe 20 de dano, e não 10 como é na classe pai (jogador);
	boolean atacar (Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
			
		} else if (deltaX == 1 && deltaY == 00) {
			oponente.vida -= 20;
			return true;
			
		} else {
			return false;
		}
	}

	
}
