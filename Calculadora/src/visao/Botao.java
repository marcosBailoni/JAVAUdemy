package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{
	
	public Botao(String texto, Color cor) {
		
		setText(texto); // setar texto do botão
		
		setOpaque(true); // habilitar cor do botão
		
		setBackground(cor); // definir a cor do botão
		
		setFont(new Font("courier", Font.PLAIN, 25)); // definir o tipo de fonte, normal (plain) e tamanho ;
		
		setBorder(BorderFactory.createLineBorder(Color.BLACK)); // criar uma borda (linha) simples e preta em volta dos botões
		
		setForeground(Color.WHITE); // cor da fonte branca;
	}

}
