package oo.heranca;

public class Jogador {

	int vida = 100;
	int x;
	int y;
	

	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	boolean atacar (Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
			
		} else if (deltaX == 1 && deltaY == 00) {
			oponente.vida -= 10;
			return true;
			
		} else {
			return false;
		}
	}
	
	boolean andar(Direcao direcao) {
		if (direcao == Direcao.NORTE && y > 0) {
			y--;
			return true;
		} else if (direcao == Direcao.SUL && y < 100) {
			y++;
			return true;
		} else if(direcao == Direcao.LESTE && x < 100) {
			x++;
			return true;
		} else if(direcao == Direcao.OESTE && x > 0) {
			x--;
			return true;
		} else {
			return false;
		}
		
	}
}
