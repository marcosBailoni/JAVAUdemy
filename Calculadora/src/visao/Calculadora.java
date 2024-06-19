package visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	Calculadora() {
		
		organizarLayout();
		
		// fará com que o painel/tela fique visível;
		setVisible(true);
		
		// fará com que a aplicação seja fechada ou fechar a janela
		// também pode ser usado: 
		//setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//setar tamanho do painel/tela
		setSize(232, 322);
		
		//setar localização da tela/painel para o centro
		setLocationRelativeTo(null);
	}
	
	
	private void organizarLayout() {
		//usar o layout BorderLayout para orgnizar o display e teclado da calculadora.
		setLayout(new BorderLayout());
		
		
		// o método add vem da herança de JFrame
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60)); // setar o tamanho do display		
		add(display, BorderLayout.NORTH); // adiciona o componente a partir do norte, baseado no layout usado acima 
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);// adiciona o componente a partir do centro, baseado no layout usado acima 
		
	}


	public static void main(String[] args) {
		new Calculadora();
	}
}
