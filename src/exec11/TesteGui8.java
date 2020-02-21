package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Classe responsavel por demonstrar a utiliza��o de campo de senha
 * @author pbrasileiro
 *
 */
public class TesteGui8 { // inicio da classe
	
	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel jtfSenha;
	private JPasswordField jpwSenha;
	
	public void iniciaGui () {
		
		//criar as instancias
		
		janela = new JFrame ("Exemplo de campo de senha");
		painelDaJanela = (JPanel) janela.getContentPane();
		jtfSenha = new JLabel();
		jpwSenha = new JPasswordField ();
		
		//configurar a label senha
		jtfSenha.setText("Senha");
		jtfSenha.setBounds(10, 40, 40, 20);
		
		// configurar o campo de senha
		jpwSenha.setBounds(60,40,100,20);
		
		// configurar o painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(jtfSenha);
		painelDaJanela.add(jpwSenha);
		
		// configurar a tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300,300);
		janela.setVisible(true);
		
		// fim do metodo inciaGui
	}
public static void main(String[] args) {
	new TesteGui8().iniciaGui();
	
}
		
	}


