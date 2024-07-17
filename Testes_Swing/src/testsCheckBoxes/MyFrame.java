package testsCheckBoxes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JCheckBox checkbox;
	
	MyFrame() {
		ImageIcon img = new ImageIcon("caveira.png");
		ImageIcon img2 = new ImageIcon("codeguy.png");
		
		button = new JButton("submit");
		button.setFocusable(false);
		button.addActionListener(this);
		
		checkbox = new JCheckBox("I am not a Robot");
		checkbox.setFocusable(false);
		checkbox.setIcon(img);
		checkbox.setSelectedIcon(img2);
		
		
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setSize(500,500);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setLayout(new FlowLayout());
		
		this.add(checkbox);
		this.add(button);
		
		this.pack();
		this.setVisible(true);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			if(checkbox.isSelected() == true) {
				System.out.println("Está marcado");
				
			}else {
				System.out.println("Está Desmarcado");
			}
		} 
		
	}
	
	

	
}
