package openNewWindow;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Olá, nova janela aberta!");
	
	NewWindow() {
		
		label.setBounds(50,50,300,300);		
		label.setFont(new Font("Impact", Font.PLAIN, 25));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(Color.BLUE);
		
		
		
		frame.setSize(500, 500);
//		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.add(label);
		
		frame.setVisible(true);
		
	
	}
}
