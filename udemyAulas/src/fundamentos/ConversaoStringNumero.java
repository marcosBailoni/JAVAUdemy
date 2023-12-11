package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		System.out.println(valor1 + valor2); // concatenando strings
		
		Double numero1 = Double.parseDouble(valor1); // transformando em Double
		Double numero2 = Double.parseDouble(valor2);
		
		System.out.println(numero1 + numero2);
			
		System.out.println("Convertendo dentro do print: " + (Double.parseDouble(valor1)+Double.parseDouble(valor2)));
		
		Double soma = numero1 + numero2;  // Somando Doubles;
		double b = soma; // convertendo de Double para double
		int somado = (int) b; // convertendo de double para int
		System.out.println(somado + " testando");
	}
}
