package oo.heranca.desafio;

public interface Luxo {
	
	void ligarAr();
	void desligarAr();
	
	// implementação padrão, para não ser necessário implementar as subclasses a implementar o método novamente: 
	default int valocidadeDoAr() {
		return 1;
	}
	
	
}
