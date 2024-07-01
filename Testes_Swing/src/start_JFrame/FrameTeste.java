package start_JFrame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class FrameTeste {
	
	public static void main(String[] args) {
		
		Dimension dimensaoTela = new Dimension(450, 450); // variavel do tipo dimension
		
		JFrame frame = new JFrame(); // criar um JFrame 
		
		frame.setVisible(true); // setar visibilidade true para que o JFrame apareça (uma janela)
		
		frame.setSize(450, 450); // setar o tamanho do painel do JFrame (janela)		
		frame.setSize(dimensaoTela); // espera a dimensão ou um objeto do tipo dimension (tamanho da tela)
		
		frame.getContentPane().setBackground(Color.BLUE); // setar cor do background do painel do JFrame
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setar para que ao fechar a janela, o JFrame feche a execução também
		
		frame.setResizable(false); // não deixa mudar o tamanho da janela
		
		//A parte abaixo criará um objeto MyFrame, que já tem todas esses sets acima configurados na classe  MyFrame
		
		@SuppressWarnings("unused")
		FrameMine meuFrame = new FrameMine();
		
	}

}
