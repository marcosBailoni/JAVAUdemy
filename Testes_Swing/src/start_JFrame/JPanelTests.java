package start_JFrame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTests {
	
	public static void main(String[] args) {
		
		
		ImageIcon image = new ImageIcon("caveira.png");
		
		
		JLabel label = new JLabel();
		
		label.setForeground(Color.ORANGE);
		label.setText("Test");
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.RIGHT);
//		label.setHorizontalTextPosition(JLabel.CENTER); // SETA a posicao do texto em relação a imagem; CENTER/LEFT/RIGHT
//		label.setVerticalTextPosition(JLabel.BOTTOM); // SETA A POSICAO DO TEXTO (EM CIMA OU EM BAIXO DA IMAGEM)
		
		
		// Painel -> por default, vem como flow layout
		// flow layout começa por padrão no center, top, e vai preenchendo a linha inicial
		// com os componentes, quando enche a linha, ele vai pra de baixo.
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0,0,250,250); // setar configurações do panel, se não fizer, ele não aparece se o layout for null
		redPanel.setLayout(new BorderLayout());
		redPanel.add(label);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250,0,250,250); // setar configurações do panel, se não fizer, ele não aparece se o layout for null
		bluePanel.setLayout(new BorderLayout());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0,200,500,300); // setar configurações do panel, se não fizer, ele não aparece se o layout for null
		greenPanel.setLayout(new BorderLayout());  // -> mesmo layout default do frame
		
		//greenPanel.add(label);
		
		
		//ATENÇÃO: SE O LAYOUT DOS PANELS FOSSE NULL, PRECISARIA SETAR OS BOUNDS DO LABEL, 
		// SETBOUNDS -> definE a posição e o tamanho de um componente dentro de seu contêiner pai;
		// no caso, o label dentro do panel:
		
		JFrame frame = new JFrame();		
		
		frame.getContentPane().setBackground(Color.BLACK);// BACKGROUND DO FRAME = PRETO 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar o programa junto com o fechamento da janela.
		frame.setLayout(null); // tipo do layout -> null = sem gerenciador de layout, posicionar tudo manulamente.
		frame.setSize(600, 600); // tamanho do layout
		frame.setVisible(true); // habilitar visibilidade da janela
		frame.setLocationRelativeTo(null); // centralizar janela 
		frame.add(redPanel); 
		frame.add(bluePanel); 
		frame.add(greenPanel);
		
		
		
		
		
	}

}
