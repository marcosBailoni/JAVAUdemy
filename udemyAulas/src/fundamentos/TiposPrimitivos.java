package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
//		tipos de números inteiros:
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3123845222L; 
//		Por padrão, o JAVA interpreta o long como INT, para ficar no range long, 
//		é necessário colocar o L no final do número.
		
		
//		tipos números reais:
		
		float salario = 11456.50F;
		double vendasAcumuladas = 2566888.05;
//		Assim como nos inteiros, o JAVA interpreta os floats como double, pra "forçar"
//		o range pra float, colocar um F no final do número
		
		
//		tipo booleano:
		boolean estaDeFerias = false; 
		boolean inativo = true;
		
//		tipo caractere:
		char nivel = 'B'; 
		
		System.out.println(anosDeEmpresa);
		System.out.println(numeroDeVoos);
		System.out.println(id);
		System.out.println(pontosAcumulados);
		System.out.println(salario);
		System.out.println(vendasAcumuladas);
		System.out.println(estaDeFerias);
		System.out.println(inativo);
		System.out.println(nivel);
		
	
	}
}
