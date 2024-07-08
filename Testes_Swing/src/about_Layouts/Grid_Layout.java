package about_Layouts;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout {

	// Posiciona os componentes em uma "grade de celulas"
	// Cada compomente pega o espaço completo da célula 
	// Cada célula tem o mesmo tamanho;
	
	public static void main(String[] args) {
		
		
//		JPanel panel = new JPanel();
		
		
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");

		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3, 3, 10, 0));  //(linhas,colunas, horizontal Margem, Vertical Margem)
		frame.setLocationRelativeTo(null);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);		
		
		frame.setVisible(true);
		
		
	}
}
