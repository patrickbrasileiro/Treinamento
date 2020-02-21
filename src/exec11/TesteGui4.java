package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class TesteGui4 {

	// declaração das variaveis
	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton btnVerificar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	public void iniciaGui() {

		// Criar as instancias
		janela = new JFrame("Exemplo do Radio");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();
		// convertendo abaixo
		// Cria o objeto de grupo de botoes
		grpRadio = new ButtonGroup();

		// Adiciona os botoes ao grupo
		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

		// configuração da label Escolha
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado civil");
		lblEscolha.setBounds(82, 18, 230, 18);

		// configuração do botao solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);

		// configuração do botao casado
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80, 75, 100, 24);

		// configuração do botao viuvo
		rbtViuvo.setText("Viuvo");
		rbtViuvo.setBounds(80, 100, 100, 24);

		// configuração do botao Divorciado
		rbtDivorciado.setText("Divorciado");
		rbtDivorciado.setBounds(80, 125, 100, 24);

		// Configuração do botao
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(126, 176, 83, 28);
		
		//adicionar ação do botao
		btnVerificar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// Verificar qual radio button foi selecionado
				
					verificaSelecionado();
				}
				
			
		});
		
		
		// configurações do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(btnVerificar);
		
		//configurações da janela (para fechar)
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340,273);
		janela.setVisible(true);
		
		
	} // fim do metodo iniciaGui

	public void verificaSelecionado() {
	String resposta = "";
	if(rbtSolteiro.isSelected()) {
		// para nao precisar usar message para saida de impressao
		resposta += rbtSolteiro.getText();
		
		if(rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();
		}
		if(rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();
		}
		if(rbtDivorciado.isSelected()) {
			resposta += rbtDivorciado.getText();
		}
		if(!resposta.contentEquals("")) {
		//troca a cor da fonte para vermelho
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText(resposta);

		}
		resposta="";
	}
}


	public static void main(String []args) {
		new TesteGui4().iniciaGui();
	}

}// fim da classe
