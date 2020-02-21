package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {

	// declarar as variaveis de referencia
	private static JFrame janela;
	private static JButton botao;
	
	public static void main(String[] args) {

		// criar uma nova tela(instancia)
		janela = new JFrame("minha primeira tela");
		// criar um novo botao(instancia)
		botao=new JButton("Clique aqui");
		// Adicionar o botao ao painel da janela
		janela.getContentPane().add(botao);
		
		// configurar o tamanho da tela
		janela.setSize(300, 300);
		//Configurar a visibilidade da tela (true/false)
		janela.setVisible(true);
		//Informar que tela não tem layout pre-definido
		janela.getContentPane().setLayout(null);
		// adicionar o botao ao painel de janela
		janela.getContentPane().add(botao);
		
	}

}
