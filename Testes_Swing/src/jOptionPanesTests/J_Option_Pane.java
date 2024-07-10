package jOptionPanesTests;

import javax.swing.JOptionPane;

public class J_Option_Pane {

	/*JOPtionPane = caixa de pop up, pode receber algo escrito, uma confirmação ou só um mensagem de aviso */
	
	public static void main(String[] args) {
		
		
		// 1- Frame pai, 2- mensagem, 3- titulo, 4-estilo de mensagem (aviso, pergunta, erro, etc)
		JOptionPane.showMessageDialog(null, "Just a Message", "titulo", JOptionPane.PLAIN_MESSAGE);
		
		// é possível salvar a resposta de um JOP em uma variável também:
		String nome = JOptionPane.showInputDialog("What is ur name ?");
		JOptionPane.showMessageDialog(null, "Olá "+ nome);
		
		// retorna um int para YES/ outro para No/ e outro para Cancel, Outro para close no X também
		int resposta = JOptionPane.showConfirmDialog(null, "Mensagem aqui", "titulo", JOptionPane.YES_NO_CANCEL_OPTION);
		JOptionPane.showMessageDialog(null, resposta);
		/* yes = 0 
		 * no = 1 
		 * cancel = 2
		 * x = -1
		*/
		
		
	}
}
