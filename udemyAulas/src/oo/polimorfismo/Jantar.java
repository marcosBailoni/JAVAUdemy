package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(85);

		Arroz a1 = new Arroz(0.2);
		Feijao f1 = new Feijao(0.2);
		Sorvete  s1 = new Sorvete(0.2);
		
		System.out.println("Peso antes de comer: "+ p1.getPeso()+ "KG");
		p1.Comer(a1);
		p1.Comer(f1);
		p1.Comer(s1);
		System.out.printf("Peso depois de comer: %.2fKG", p1.getPeso());	
	}
	
}