package classe;

public class ValorNulo {

	public static void main(String[] args) {

//		Se o valor do objeto for null, não é possível acessar suas prioridades, já que não terá nenhuma referencia alocada ao
//		objeto, caso seja vazio (""), é possível já que vazio é uma referência;
		
		String s1 = "";
		System.out.println(s1.concat("s1 !!!"));
//		
//	Se o numero sorteado for maior que 0,5, usar o contrutor para atribuir o valor padrão a d1, caso seja menor, o valor será null
		Data d1 = Math.random() > 0.5 ? new Data() : null;

		if (d1 != null) {
			System.out.println(d1.dataFormatada());
		}

		String s2 = Math.random() > 0.5 ? "maior que 0.5" : null;

		if (s2 != null) {
		System.out.println(s2.concat("s2!!!"));
	
		}
		
	}

}
