package visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Memoria;
import modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private final JLabel label; // define o label -> será os números que aparecerão no display
	
	//Construtor: 
	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);
		
		label = new JLabel(Memoria.getInstancia().getTextoAtual()); // cria o label; retorna o texto atual da instancia;
		
		setBackground(new Color(64, 49, 50)); //definir a cor do display

		add(label); // adiciona o label no layout
				
		label.setForeground(Color.WHITE); // cor do label (no caso, serão os números)
		
		label.setFont(new Font("courier", Font.PLAIN, 30)); // nome da fonte, estilo e tamanho
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); // setar o que estiver dentro de display pra ter o alinhamento com a direita. O 10 e 25, são as medidas para alinhar horizontalmente e vertifcalmente.
		
		
	
	}

	
	public void valorAlterado(String novoValor) {
		
		label.setText(novoValor); 
		
	}

}
