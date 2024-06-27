package start_JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test_JLabel {

	// GUI display area para string txt ou imagem; é um Componente // abaixo, adicionamenos o labem no frame.
	
	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("codeguy.png"); // criar um objeto imagem (usei a imagem que está na mesma pasta do projeto)
		
		JLabel label = new JLabel(); // label é como se fosse uma div do html, mas só aceita string/imagens
		label.setText("Dude, do you even code ?"); // setar texto do label
		label.setIcon(image); // setando uma imagem no label
		label.setHorizontalTextPosition(JLabel.CENTER); // SETA a posicao do texto em relação a imagem; CENTER/LEFT/RIGHT
		label.setVerticalTextPosition(JLabel.TOP); // seta a pocai vertical do texto em relação a imagem; CENTER/TOP/BOTTOM
//		label.setHorizontalAlignment(JLabel.CENTER); // seta conteúdo do label no centro 
		label.setForeground(new Color(0,0,255)); // setar cor do texto
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // setar fonte do texto
		
		
		
		JFrame frame = new JFrame(); 		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,500);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.add(label); // adicionando label ao JFrame
		
		
		

		
	}
	

}
