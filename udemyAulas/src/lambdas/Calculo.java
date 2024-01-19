package lambdas;

@FunctionalInterface // Faz com que só seja possível um método abstrato na interface
public interface Calculo {
	
	double executar (double a, double b);
	
//	Pode-se criar outros métodos, mas somente staticos e default;
	default String teste() {
		return "String";
	}
	
	static String teste2() {
		return "String";
	}
}