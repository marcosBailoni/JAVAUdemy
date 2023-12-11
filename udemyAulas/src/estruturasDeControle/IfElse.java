package estruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("informe o número: ");
		
		double valorFinal = Double.parseDouble(valor);
		
		if (valorFinal % 2 == 0) {
			System.out.println("Número par!!");	
		} else {
			System.out.println("Número ímpar!!");
		}
				
	}

}
