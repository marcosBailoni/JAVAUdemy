package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
//	Construtor padrão setando valores padrões para quando não passar parâmetros
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
//	Construtor recebendo os 3 parâmetros
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
	}
	
//	Dentro do metodo abaixo, foi criado uma variável local "formato", essa variável só é acessível dentro do metodo,
//	já que é uma variável local e precisa ser inicializada explicitamente (definindo seu valor)
	
	String dataFormatada () {
//		os dois returns funcionam: 
//		return dia + "/" + mes +  "/" + ano;
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
}
