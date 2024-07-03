package start_JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonTests {
	
	//Poderia também implementar a Functional interface ActionListener, e implementar o método, para que quando o 
	// evento registrado pela instância, viesse do mouse, printar o CLICADO diretamente. 
	
	
	public static void main(String[] args) {
		
//		ImageIcon image = new ImageIcon("mouse2.png");
		
		Font fonte = new Font("Verdana", Font.BOLD, 20); // fonte criada
		
		JLabel label = new JLabel();
		label.setText("Clicado");
		label.setBounds(210,0,200,200);
		label.setVisible(false);
		label.setFont(fonte);

		
				
		JButton button = new JButton("Button");
		button.setBackground(Color.DARK_GRAY);
		button.setVisible(true);
		button.setBounds(175,190,150,80); // layout do frame é null, precisa setar os bounds pro botão 
		button.setIcon(new ImageIcon("mouse2.png")); // icon para o botao caso queira (imagem)
		button.setFocusable(false); // remover borda dentro do botao, na caixa de texto
		button.setForeground(Color.WHITE); // cor do texto
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.TOP);
		button.setFont(fonte);
		button.setIconTextGap(-1); // brecha/distancia entre texto e imagem
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setBorderPainted(Color.GREEN);
		
		button.addActionListener(e -> {
			System.out.println("Clicado");
			button.setEnabled(false);
			label.setVisible(true);
		});
		// e  == parâmetro passado para método, tipo evento, 
		// esse evento foi adicionado aos Listeners, quando o mouse for clicados, o evento será
		//notificado e irá acionar o print.
		// E TAMBÉM SETA O BOTAO COMO ENABLED = false (ficando desabilitado)
		// e mostra habilita o label
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.ORANGE);
//		frame.setLocationRelativeTo(null);		
		frame.add(button);
		frame.add(label);
		
		
	}

}
