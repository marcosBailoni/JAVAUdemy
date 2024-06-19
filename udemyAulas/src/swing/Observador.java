package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // fechar a aplicação quando fechar a janela
		
		janela.setSize(600,200);
		
		janela.setLayout(new FlowLayout());
		
		janela.setLocationRelativeTo(null); // centralizar a janela aberta na tela do computador.
		
		JButton botao = new JButton("Clicar!");
		
		janela.add(botao);
		
		botao.addActionListener(e -> System.out.println("Clicou!!"));
		
		janela.setVisible(true);
		
	}
}
