package start_JFrame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	MyFrame() {

		Dimension dimensaoTela = new Dimension(450, 450); // variavel do tipo dimension		

		setVisible(true); // setar visibilidade true para que o JFrame apareça (uma janela)

		setSize(450, 450); // setar o tamanho do painel do JFrame (janela)
		
		setSize(dimensaoTela); // espera a dimensão ou um objeto do tipo dimension (tamanho da tela)

		getContentPane().setBackground(Color.GRAY); // setar cor do background do painel do JFrame

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setar para que ao fechar a janela, o JFrame feche a execução também
		
		setResizable(false); // não deixa mudar o tamanho da janela
		
		setLocationRelativeTo(null);
		
	}
}
