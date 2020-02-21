package exec11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
	 *  Classe responsavel por demonstrar utilizar de JComboBOx
	 */

public class TesteGui6 {
	
	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbox;
	private String [] equipamentos = {"Monitor", "Teclado", "Mouse","Scanner", "Modem"};  
	
	public void iniciarGui() {
		
		//criar as instancias
		janela = new JFrame("Exemplo de combo box");
		painelDaJanela = (JPanel) janela.getContentPane();
		cbox = new JComboBox(equipamentos);
		
		//configura��es do combo box
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);
		
		//configura��es do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbox);
		
		// configura�oes da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TesteGui6().iniciarGui();
	}
}