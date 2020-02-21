package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGui5 {

//declaracao das variaveis
	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDaJanela;

	public void iniciaGui() {

		// criar as instancias
		janela = new JFrame("Exemplo de Check Box");
		lblEscolha = new JLabel();
		lblResposta= new JLabel();
		cbCC = new JCheckBox();
		cbBB = new JCheckBox();
		cbDB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// configuração da label Escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de Pagamento:");
		lblEscolha.setBounds(45, 15, 208, 18);

		// configuração da label Escolha
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta:");
		lblResposta.setBounds(42, 230, 300, 18);

		// configuração do check box cartao de credito
		cbCC.setText("Cartao de Crédito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

		// configuração do check box Deposito bancario
		cbDB.setText("Deposito bancario");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// configuração do check box Deposito bancario
		cbBB.setText("Boleto bancario");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// Configurações do botao
		btnResposta.setText("Resposta");
		btnResposta.setBounds(146, 196, 83, 28);

		// adicionar ação do botao
		btnResposta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// Verificar qual radio button foi selecionado

				verificaSelecionado();

			}
		});

		// adicionar componetentes no painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);

		// configuraçoes da tela (fechar janela)
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);

	}// fim do metodo iniciaGui

	public void verificaSelecionado() {
		String resposta = "";

		if (cbCC.isSelected()) {
			resposta += cbCC.getText();
		}
		if (cbDB.isSelected()) {
			resposta += cbDB.getText();
		}
		if (cbBB.isSelected()) {
			resposta += cbBB.getText();
		}
		if (!resposta.contentEquals("")) {

			lblResposta.setText(resposta);

		}
		resposta = "";

	}

	public static void main(String[] args) {
		new TesteGui5().iniciaGui();

	}
}
