package sliders;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		frame = new JFrame("SliderDemo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50); // números minimo e máximo do slider e o ultimo: onde irá começar
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true); // habilita as marcações 
		
		slider.setMinorTickSpacing(10); // define o espaço entre as marcações menores
	
		slider.setPaintTrack(true); 
		slider.setMajorTickSpacing(20);
		// define o espaço entre as marcações maiores
		
		slider.setPaintLabels(true); 
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		slider.setOrientation(SwingConstants.VERTICAL); // barra vertical
//		slider.setOrientation(SwingConstants.HORIZONTAL); // barra horizontal 
		
		label.setText("°C = " + slider.getValue());
		
		
		
		//Slider + Label -> Panel -> Frame
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
				
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
	}
	
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == label) {
			slider.getValue();
		}
		
	} 

}