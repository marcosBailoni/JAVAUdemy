package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		

		Data d2 = new Data();
		d2.dia = 01;
		d2.mes = 01;
		d2.ano = 2024;
		
		Data d3 = new Data(10, 12, 2023);
		System.out.println("metodo: " + d1.dataFormatada());
		System.out.println("metodo: " + d2.dataFormatada());
		System.out.println("metodo: " + d3.dataFormatada());
	
		System.out.printf("A data 1 refere-se ao dia: %d/%d/%d", d1.dia, d1.mes, d1.ano);
		System.out.println();
		System.out.printf("A data 2 refere-se ao dia: %d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
