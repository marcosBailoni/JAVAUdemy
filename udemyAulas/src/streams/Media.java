package streams;

public class Media {
	
	private double notas;
	private int quantidade;
	
	// O metodo addNota acrescenta +1 na quantidade e adiciona a nova nota em notas, além disso, retorna a própria instância no final;
	public Media addNota(double NovaNota) {
		notas += NovaNota;
		quantidade++;
		return this;

	}
	
	public double getMedia() {
		return notas / quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {		
		Media novaMedia = new Media();
		novaMedia.notas = m1.notas + m2.notas;
		novaMedia.quantidade = m1.quantidade + m2.quantidade;
		return novaMedia;		
	}

}
