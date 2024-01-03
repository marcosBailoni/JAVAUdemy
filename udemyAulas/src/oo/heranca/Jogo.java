package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador monstro = new Monstro(); // heroi é subclasse de Jogador
		Jogador heroi = new Heroi(11, 10); // monstro também;
		
		monstro.x = 10;
		monstro.y = 10;
		
//		heroi.x = 11;
//		heroi.y = 10;
		
		System.out.println("Vida j1: " + monstro.vida);
		System.out.println("Vida j2: " + heroi.vida);
		
		monstro.atacar(heroi); // j1 atk j2
		heroi.atacar(monstro); // j2 atk j1
		
//		heroi.andar(Direcao.NORTE);
		
		System.out.println("Vida monstro: " + monstro.vida); 
		System.out.println("Vida heroi: " + heroi.vida);


	}
}
