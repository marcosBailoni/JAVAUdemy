package openNewWindow;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{

	JFrame frame = new JFrame();
	
	JButton button = new JButton();
	
	LaunchPage(){
		
		button.setText("Abrir página!");
		button.setBounds(175, 175, 150, 150);
		button.setFocusable(false);
		button.setOpaque(true);
		button.addActionListener(this); /* Ao clicar no botão, o objeto LaunchPage irá ser "notificado" por 
		esse método */
		
		// botão irá passar para a lambda para abrir a nova janela e fechar a primeira, quando for clicado
		// (event) acionado ao pressionar o botão
		
		button.addActionListener(
			e -> {
				new NewWindow();
				frame.dispose();
			}
		);
	
		// Caminho mais longo pra fazer a mesma ação de cima: 
		
		
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.add(button);
		
		
		
		frame.setVisible(true);
		
		
		
		
	}
	
	/* metodo implementado = ao clicar no botão, irá chamar o método abaixo da instância de launchpage,
		que irá imprimir no console a string informada;
	*	
	*	Pode ser usado a lambda ou esse método implementado para adicionar alguma reação após o evento
	* 	do clique no botão;
	*/ 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Clicou no botão");
		}
		
	}
	
	
}
