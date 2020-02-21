package exec11;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *  classe responsavel por demontrar o uso do paineis
 */


public class TestGui9 {
	
	// desclaracao de variaveis
private JFrame janela;
private JPanel painelDaJanela;
private JPanel painel1;
private JPanel painel2;
private JPanel painel3;
private JPanel painel4;
	

	

	

	
	public void iniciaGui() {
		
		// criar as instancias
		janela= new JFrame("Exemplo de Paineis");
		painelDaJanela = (JPanel) janela.getContentPane();
		painel1 = new JPanel();
		painel2 = new JPanel();
		painel3 = new JPanel();
		painel4 = new JPanel();
		
		// configurações do jpanel 1
		painel1.setBounds(4,6,200,100);
		painel1.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		painel1.setBorder(BorderFactory.createEtchedBorder());
		
		// configurações do jpanel 2
		painel2.setBounds(208,6,200,100);
		painel2.setLayout(new BorderLayout(0,0));
		painel2.setBorder(BorderFactory.createLoweredBevelBorder());
		
		// configurações do jpanel 3
		painel3.setBounds(3,109,200,100);
		painel3.setLayout(new BoxLayout(painel3,BoxLayout.X_AXIS));
		painel3.setBorder(BorderFactory.createLoweredBevelBorder());
		
		// configurações do jpanel 4
				painel4.setBounds(208,110,200,100);
				painel4.setLayout(new GridLayout(1,0,0,0));
				painel4.setBorder(new TitledBorder("Promoção"));
		
		// configuração do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painel1);
		painelDaJanela.add(painel2);
		painelDaJanela.add(painel3);
		painelDaJanela.add(painel4);
		
		// configuração da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(new Dimension(422,246));
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
				
		
	}
	public static void main(String[] args) {
		new TestGui9().iniciaGui();
	}
	
	
	
	}
	
	
	
	

