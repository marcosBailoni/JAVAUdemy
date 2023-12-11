  package estruturasDeControle;

import javax.swing.JOptionPane;

public class IfElseIf {

	public static void main(String[] args) {
		
		String nota = JOptionPane.showInputDialog("Digite a média aqui: ");
		
		double notaFinal = Double.parseDouble(nota);
		
		if (notaFinal > 10 || notaFinal < 0) {
			System.out.println("Nota inválida, tente novamente!");
		} else if (notaFinal > 8) {
			System.out.println("Parabéns, CONCEITO A!");
		} else if (notaFinal > 6) {
			System.out.println("CONCEITO B!");
		} else if (notaFinal > 4) {
			System.out.println("CONCEITO C!");
		} else if(notaFinal > 2) {
			System.out.println("CONCEITO D!");
		} else {
			System.out.println("CONCEITO E!");
		}
	}
}
