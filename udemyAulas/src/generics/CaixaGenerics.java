package generics;

// Dessa forma que foi criada, informando que a classe tem um tipo generico <T>, dessa forma, não precisa definir o tipo dos
// atributos na criação da classe, somente na criação do objeto/instancia (verifique na classe CaixaGenericsTeste
public class CaixaGenerics<T> {
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
