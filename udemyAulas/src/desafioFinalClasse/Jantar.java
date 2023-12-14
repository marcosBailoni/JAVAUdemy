package desafioFinalClasse;

public class Jantar {
	
	public static void main(String[] args) {
		
	Comida c1 = new Comida ("Frango", 0.200);
	Comida c2 = new Comida ("Arroz", 0.600);

	Pessoa p1 = new Pessoa ("Fulano", 80);
	
	System.out.printf("O peso de %s é de %.2fKG", p1.nome, p1.peso);
	
	p1.comer(c1, c2);
	
	System.out.println();
	System.out.printf("Após a janta, o peso de %s é de %.2fKG", p1.nome, p1.peso);
	

	}

}
