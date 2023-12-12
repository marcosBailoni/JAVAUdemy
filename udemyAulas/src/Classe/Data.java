package Classe;

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
	
	
	String dataFormatada () {
//		os dois returns funcionam: 
//		return dia + "/" + mes +  "/" + ano;
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
