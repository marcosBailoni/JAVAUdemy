package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media().addNota(6).addNota(10);
		Media m2 = new Media().addNota(8).addNota(10);
//		É possível encadear o método addNota na criação da nova instância, pois o método no final dos calculos, retorna a própria instância, fazendo com que m1, recebe a instância criada.
		
//		m1.addNota(10);
//		m1.addNota(8);
//      
		
		double teste = m1.getMedia();
		double teste2 = m2.getMedia();
		
		System.out.println(teste);
		System.out.println(teste2);
		
		double mediaCombinada = Media.combinar(m1, m2).getMedia();
		
		System.out.println(mediaCombinada);
		
	}
}

