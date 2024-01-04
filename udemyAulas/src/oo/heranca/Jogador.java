package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;
	

	protected Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public boolean atacar (Jogador oponente) {
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
	
	public boolean andar(Direcao direcao) {
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
