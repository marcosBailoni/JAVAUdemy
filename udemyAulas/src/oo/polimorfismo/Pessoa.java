package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	Pessoa(double peso) {
		setPeso(peso);
	}
	
	//get
	public double getPeso() {
		return peso;
	}
	
	// set
	public void setPeso(double peso) {
		if(peso > 0 ) {
			this.peso = peso;
		}
	}
	
	//metodo comer (aumentar o peso da pessoa somando com a comida)
	public double Comer(Comida comida) {
		peso += comida.getPeso();
		return peso;
	}


}
