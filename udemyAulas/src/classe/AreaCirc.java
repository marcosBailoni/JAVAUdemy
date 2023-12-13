package classe;

public class AreaCirc {

	double raio;
	
	// Static para a variável pertencer a classe, final para ser imutável;
	static final double PI = 3.14;
	
	
	// construtor recebendo raio como parâmetro:
	AreaCirc (double raio) {
		
		this.raio = raio;
	}
	
	
	// metodo para calcular area
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	// METODO STATIC QUE FICARÁ VINCULADO A CLASSE E NÃO AOS OBJETOS
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}