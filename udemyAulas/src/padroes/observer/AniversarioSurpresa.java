package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em: " + e.getMomento());
		});
		
		porteiro.monitorar();
		
	}
}


//Evento da chegada do aniversariante
//é um objeto que tem como propriedade o momento que ele chegou (date)
//
//A interface Funcional Observador = 
//	Tem o método chegou, que seus herdeiros terão de implementar
//
//a classe namorada, implementa o método chegou, printando surpresa na tela
//
//
//O porteiro tem uma lista de observadores, 
//	terá um metódo para adicionar mais (namorada)
//	e um método para monitorar:
//		Caso seja digitado que chegou, irá passar o parametro evento, que é criado nesse momento, para todos os observadores da lista, por meio de um forecha + lambda)
//		caso seja digitado outra coisa, irá aparecer alarme falso.
