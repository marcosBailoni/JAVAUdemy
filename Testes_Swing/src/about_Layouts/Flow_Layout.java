package about_Layouts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_Layout {
	
	public static void main(String[] args) {
		
		// flow layout = ajusta os componentes por linha, usando o preferred size.
		// se o container horizontal é pequeno para comportar o componente, usa a próxima linha. 
		
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		
		JButton button10 = new JButton("10");
		JButton button20 = new JButton("20");
		JButton button30 = new JButton("30");
		JButton button40 = new JButton("40");
		JButton button50 = new JButton("50");
		JButton button60 = new JButton("60");
		JButton button70 = new JButton("70");
		JButton button80 = new JButton("80");
		JButton button90 = new JButton("90");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // posicionamento, gap x, gap y;
		panel.setPreferredSize(new Dimension(150,300));
		panel.setBackground(Color.LIGHT_GRAY);
		
		
		frame.add(button10);
		frame.add(button20);
		frame.add(button30);
		frame.add(button40);
		frame.add(button50);
		frame.add(button60);
		frame.add(button70);
		frame.add(button80);
		frame.add(button90);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,0 ,10));
		frame.setSize(500,500);
		frame.setBackground(Color.DARK_GRAY);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
