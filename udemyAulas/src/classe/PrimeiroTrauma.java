package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	
	public static void main(String[] args) {
		
		
		PrimeiroTrauma teste = new PrimeiroTrauma();
		System.out.println(teste.a);
	
	}
}


// imprimir a sem mexer a linha 5 e 7;

//Neste caso, a é uma variável de instância, o que significa que ela pertence a uma instância específica do objeto MinhaClasse.
//No método main, que é um método estático, você está tentando acessar a diretamente sem uma instância de MinhaClasse. 
//Para resolver esse problema, você precisa ou tornar a estática ou criar um objeto de MinhaClasse para acessar a através desse objeto