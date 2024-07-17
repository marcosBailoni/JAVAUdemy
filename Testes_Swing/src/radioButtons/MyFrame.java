package radioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	ButtonGroup group;
	JRadioButton pizzaButton;
	JRadioButton hamburguerButton;
	JRadioButton espetoButton;
	
	MyFrame() {
		button = new JButton("Order");
		button.addActionListener(this);
		
		pizzaButton = new JRadioButton("Pizza");
		hamburguerButton = new JRadioButton("Hamgurguer");
		espetoButton = new JRadioButton("Espeto");
		
		group = new ButtonGroup(); // grupo de botões (só um dos radiobuttons poderão estar selected)
		group.add(pizzaButton);
		group.add(hamburguerButton);
		group.add(espetoButton);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());	
		this.add(pizzaButton);
		this.add(hamburguerButton);
		this.add(espetoButton);
		this.add(button);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
//			System.out.println("Clicou");
			if(pizzaButton.isSelected()) {
				System.out.println("You ordered Pizza");
			} else if(hamburguerButton.isSelected()) {
				System.out.println("You ordered Hamburguer");
			} else if (espetoButton.isSelected()) {
				System.out.println("You ordered Espeto");
			}
		}
		
	}
}
