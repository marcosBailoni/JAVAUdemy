package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data();
		
		d1.dia = 11;
		d1.mes = 12;
		d1.ano = 2023;

		d2.dia = 01;
		d2.mes = 01;
		d2.ano = 2024;
	
		System.out.printf("A data 1 refere-se ao dia: %d/%d/%d", d1.dia, d1.mes, d1.ano);
		System.out.println();
		System.out.printf("A data 2 refere-se ao dia: %d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
