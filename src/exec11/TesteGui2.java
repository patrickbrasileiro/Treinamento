package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {

	public static void main(String[] args) {
	
		//definir a tela e suas caracteristicas
		JFrame janela = new JFrame();
		janela.setTitle("Titulo da minha tela");
		janela.setSize(500, 200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);
		
		//Definir o componente JButton(botao)
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(10, 10, 100, 20);
		
		//Definir o componete JLabel de rotulo caixa para digitar
		
		JLabel lblNome = new JLabel();
		lblNome.setText("nome:");
		lblNome.setBounds(10, 40, 40, 20);
		
		// Definir o campo de texto JTexField
		JTextField txtNome= new JTextField();
		txtNome.setBounds(50, 40, 100, 20);
		
		//Adicionar os componenetes na tela
		janela.getContentPane().add(botao);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(txtNome);
		
		// Informar a visibilidade da tela
		janela.setVisible(true);
	}

}
