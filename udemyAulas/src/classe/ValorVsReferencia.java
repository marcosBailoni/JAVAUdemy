package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
//		Atribuição por valor (acontece quando é passado por tipos primitivos)
//		Isso quer dizer que o valor de  vai ser copiado para o valor de b e ambos serão independentes.
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + "\n" + b);
		
//		Atribuicao por referencia, ambos objetos serão referenciados para o mesmo espaço de memória, fazendo com que se altere
//		algum valor diretamente usando algum objeto, mude para o outro também, já que o que está sendo alterado, é um valor
//		dentro de um espaço de memória que possui endereço referenciado nos dois objetos:
		
		Data d1 = new Data(1, 6, 2023);
		Data d2 = d1;
		
		System.out.println("d1: " + d1.dataFormatada() + " - d2: " +  d2.dataFormatada());
		
//		Alterando dia em d2 e printando as duas datas novamente: 
//		Note que o dia alterado apenas em d2, será refletido em d1 também:
		
		d2.dia = 5;
		
		System.out.println("d1: " + d1.dataFormatada() + " - d2: " +  d2.dataFormatada());
		
//		Isso ocorre, pois ambos objetos estão apontados para um espaço na memória que alocou esses valores (REFERÊNCIA)
//		e não para valores individuais. Com isso, ao alterar o valor em d2, o valor que está sendo alterado, é o valor deste 
//		espaço (REFERENCIA), em que d1 e d2 estão APONTADOS. 
		
		
	}
}
