package testsTxtFields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JTextField txt;
	String nome;
	
	MyFrame(){
		
		button = new JButton("enviar");
		button.setPreferredSize(new Dimension(80,40));
		button.setFocusable(true);
		button.setFont(new Font("System", Font.PLAIN, 15));
		button.addActionListener(this);
		
		
		
		txt = new JTextField("(digite seu nome aqui)");
		txt.setPreferredSize(new Dimension(250,40));
		txt.setForeground(Color.GREEN);
		txt.setFont(new Font("System", Font.PLAIN, 22));
		txt.setBackground(Color.BLACK);
		txt.setCaretColor(Color.white);
		txt.selectAll();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		this.add(txt);
		this.add(button);
		
		this.pack();
		this.setVisible(true);	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			nome = txt.getText();
			JOptionPane.showMessageDialog(this, "Olá "+ nome);
		}
		
	}
	
	

}
