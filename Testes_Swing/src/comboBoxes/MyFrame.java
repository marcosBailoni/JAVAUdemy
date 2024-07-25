package comboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;


/* JComboBox componetente que combina um botão e/ou campo em uma lista de rolagem. */

public class MyFrame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<?> comboBox;
	JButton button; 
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	MyFrame() {
		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		String[] poke = {"charmander", "bulbasaur", "squirtle"};
		
		comboBox = new JComboBox(poke);
		comboBox.addActionListener(this);
		
		button = new JButton("submit");
		button.addActionListener(this);
		
		
		this.add(comboBox);
		this.add(button);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
		} else if (e.getSource() == button) {
			System.out.println("You choose " + comboBox.getSelectedItem());
		}
		
	}

}
