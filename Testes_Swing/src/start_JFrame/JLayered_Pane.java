package start_JFrame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayered_Pane {
	
	// Um container como o JPanel, mas com a diferneça que trabalha em layers (camadas) 
	// um objeto pode ficar por cima do outro.
	
	
	// Ordem das camadas crescente:
	
	// Default < Palette < Modal < PopUp < Drag; -> usando Integer.valueOf(s) onde s é um inteiro que 
	// se refere a camada, sendo assim, não precisa decorar todos os nomes das camadas.
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();

		JLayeredPane layeredPane = new JLayeredPane();
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		
		label1.setOpaque(true);
		label1.setBackground(Color.blue);
		label1.setBounds(50,50,70,70);
		
		label2.setOpaque(true);
		label2.setBackground(Color.yellow);
		label2.setBounds(100,100,70,70);

		label3.setOpaque(true);
		label3.setBackground(Color.green);
		label3.setBounds(150,150,70,70);
	
		layeredPane.add(label1, Integer.valueOf(3)); // por ser o maior int, esse vai estar na camada mais alta.
		layeredPane.add(label2, Integer.valueOf(0));
		layeredPane.add(label3, Integer.valueOf(2));
		
		// OUTRA FORMA DE DECLARAR: 
		layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER); // DEFAULT = 0, FICARIA COM O MESMO RESULTADO 
		
		
		layeredPane.setBackground(Color.WHITE);
		layeredPane.setOpaque(true); // por padrão, ele é transparente
		
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.GRAY);
		
		frame.add(layeredPane);
		
		
		
		frame.setVisible(true);
	}

}
