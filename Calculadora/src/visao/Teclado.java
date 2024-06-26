package visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener{
	
	private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
	private final Color COR_CINZA_CLARO= new Color(99, 99, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);

	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		c.fill = GridBagConstraints.BOTH; // preencher com os botões os espaçamentos entre eles. 
		c.weightx = 1;
		c.weighty = 1;
		
		
		//liNHA 1
		c.gridwidth = 2; //Largura da constrains (botao) = 2; vai ocupar 2 espaços
		adicionartBotao("AC", COR_CINZA_ESCURO, c, 0, 0);		
		c.gridwidth = 1; // voltando para 1;
		adicionartBotao("%", COR_CINZA_ESCURO, c, 2, 0);
		adicionartBotao("/", COR_LARANJA, c, 3, 0);

		//LINHA 2
		adicionartBotao("7", COR_CINZA_CLARO, c, 0, 1);
		adicionartBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adicionartBotao("9", COR_CINZA_CLARO, c, 2, 1);
		adicionartBotao("*", COR_LARANJA, c, 3, 1);
		
		//LINHA 3
		adicionartBotao("4", COR_CINZA_CLARO, c, 0, 2);
		adicionartBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adicionartBotao("6", COR_CINZA_CLARO, c, 2, 2);
		adicionartBotao("-", COR_LARANJA, c, 3, 2);
		
		//LINHA 4
		adicionartBotao("1", COR_CINZA_CLARO, c, 0, 3);
		adicionartBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adicionartBotao("3", COR_CINZA_CLARO, c, 2, 3);
		adicionartBotao("+", COR_LARANJA, c, 3, 3);
		
		//LINHA 5
		c.gridwidth = 2; //Largura da constrains (botao) = 2; vai ocupar 2 espaços
		adicionartBotao("0", COR_CINZA_CLARO, c, 0, 4);
		c.gridwidth = 1; // largura voltando para 1;	
		adicionartBotao(",", COR_CINZA_CLARO, c, 2, 4);
		adicionartBotao("=", COR_LARANJA, c, 3, 4);
		
	}
	
	//Método para adicionar o botão dentro do componente, recebendo os parametros necessários para criar o botão e receber a constraints
	private void adicionartBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		
		botao.addActionListener(this); // sempre que clicar no botão, irá usar o método implementado abaixo
		add(botao, c);		
	}

		
//	Resumindo o método abaixo:
//		O método actionPerformed é chamado quando um evento de ação ocorre.
//		Ele verifica se a fonte do evento é um JButton.
//		Se for, ele converte a fonte do evento para JButton.
//		Finalmente, ele imprime o texto do botão no console.
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {  // getSource retorna o objeto que gerou o evento, instance of Jbutton, verifica se é uma instancia de jButton, para ver se é um evento de ação relacionado a botão.
			JButton botao = (JButton) e.getSource(); // se for, converte e.getSource(Objeto) para o tipo JButton, 
			Memoria.getInstancia().processarComando(botao.getText());
		}
		
	}
}
