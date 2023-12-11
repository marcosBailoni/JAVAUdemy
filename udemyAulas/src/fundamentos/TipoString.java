package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		var nome = "Fulano";
		var sobrenome = "De Tal";
		var idade = 33;
		var salario = 1235.556;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
	
//	Printf para formatar melhor o print, usando %s para string, %d para inteiros, %f para flutuantes. 
//		Para determinar o total de casas decimais do flutuantes: %.2f onde 2 é o numero de casa decimais.
		
		
		String dados = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n"; 
		System.out.println("\n" + dados);
//		armazenando todos os dados em uma String para falicitar o print depois. A String é composta por outras Strings e números.
	}
}
