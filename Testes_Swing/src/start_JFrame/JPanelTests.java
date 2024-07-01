package start_JFrame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTests {
	
	public static void main(String[] args) {
		
		
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.RED);
//		redpanel.setBounds(0,0,200,200); // setar configurações do panel, se não fizer, ele não aparece.
		
		
		
		
		
		
		JFrame frame = new JFrame();
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar o programa junto com o fechamento da janela.
		frame.setSize(600, 600); // tamanho do layout
//		frame.setLayout(null); // tipo do layout -> null = sem gerenciador de layout, posicionar tudo manulamente.
		frame.setVisible(true); // habilitar visibilidade da janela
		frame.add(redpanel); 
		
		
	}

}
