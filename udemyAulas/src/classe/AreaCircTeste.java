package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
//		Criando o Objeto/Instância e acessando o método de instância(c1.area();) para calcular a área;
		AreaCirc c1 = new AreaCirc(5);		
		System.out.println(c1.area());
		
		
//		Agora acessando o metodo de classe para acessar o metodo sem criar objetos/instâncias;
		double areaUsandoMetodoDeClasse = AreaCirc.area(5);
		
		System.out.println(areaUsandoMetodoDeClasse);
	}

}