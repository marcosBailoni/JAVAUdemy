package start_JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabelTest {

	// GUI display area para string txt ou imagem; é um Componente // abaixo, adicionamenos o label no frame.
	
	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("codeguy.png"); // criar um objeto imagem (usei a imagem que está na mesma pasta do projeto)
		
		Border border = BorderFactory.createLineBorder(Color.BLUE, 3); // criar borda do tipo linha, (parametros cor e tamanho);
		
		JLabel label = new JLabel(); // label é como se fosse uma div do html, mas só aceita string/imagens
		// por padrão, o label ocupará o máximo de espaço possível, se add ele em um frame vazio, ele ocupará o frame inteiro. 
		label.setText("Dude, do you even code ?"); // setar texto do label
		label.setIcon(image); // setando uma imagem no label
		label.setHorizontalTextPosition(JLabel.CENTER); // SETA a posicao do texto em relação a imagem; CENTER/LEFT/RIGHT
		label.setVerticalTextPosition(JLabel.TOP); // seta a po vertical do texto em relação a imagem; CENTER/TOP/BOTTOM
		label.setHorizontalAlignment(JLabel.CENTER); // seta conteúdo do label no centro 
		label.setForeground(new Color(0,0,255)); // setar cor do texto
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // setar fonte do texto
		label.setIconTextGap(-25); // Gap = brecha, espaçamento entre imagem e texto
		label.setBackground(Color.BLACK); // seta a cor do background do label = preto, 
		label.setOpaque(true); // seta a visibilidade do background do display como verdadeira (vai aparecer na tela) 
		//****** 1 - label.setBounds(0, 0, 400, 400); // setar posicionamento(x, y) e a dimensão do label (largura. altura) (layout null)
		label.setBorder(border); //setar a bordar criada anteriormente para o label.
		
		JFrame frame = new JFrame(); 		
		frame.setVisible(true);
//		frame.setResizable(false); // impedir do usuário alterar o tamanho da janela 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,500);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.add(label); // adicionando label ao JFrame 
		//***** 1 - frame.setLayout(null); // irá setar o layout, null = desabilitar o gerenciamento de layout. Com isso, precisa ajustar todo posicionamento manualmente
		//***** -> Por default é BorderLayout
		frame.pack(); // calcula o tamanho da janela com base nos componentes (ficará no tamanho exato para comportar tudo); Ignora o size do frame
		// ** se usar o frame.pack(); o frame ficara do tamanho do label, logo, não aparecerá o background do frame, já que o label estará por cima
		// ** sobre o pack, usar ele depois das linhas que adicionam os componentes no frame

		
	}
	

}
