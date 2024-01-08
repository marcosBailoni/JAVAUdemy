package oo.abstrato;

public class TesteCachorro {


	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		
		System.out.println(c.respirar());
		System.out.println(c.mamar());
		System.out.println(c.mover());
		
	}


}

// cachorro herda os metodos das outras classes e implementa os que ainda são abstratos
// testes;