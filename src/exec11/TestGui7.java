package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * Class responsavel por demonstrar a utilizacao de menu 
 * @author pbrasileiro
 *
 */

public class TestGui7 {
	
	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JPanel painelDaJanela;
	
	public void iniciaGui() {
		
		//criar as instr=ancias
		janela= new JFrame("Exemplo de menu");
		barraMenu = new JMenuBar();
		menu01 = new JMenu("Menu 1");
		menu02 = new JMenu("Menu 2");
		itemMenu1 = new JMenuItem("Item 1");
		itemMenu2 = new JMenuItem("Item 2");
		painelDaJanela = (JPanel) janela.getContentPane();
		
		// acrescentar menus na barra de menu
		
		barraMenu.add(menu01);
		barraMenu.add(menu02);
		
		// acrecentar item de menu nos menus
		menu01.add(itemMenu1);
		menu02.add(itemMenu2);
		
		//configurando a ação do item de menu 1
		itemMenu1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new TesteGui4().iniciaGui();
				
			}
		});
		
		//configuracao do painel da tela
		painelDaJanela.setLayout(null);
	
		
		// configuraçoes da tela
		janela.setJMenuBar(barraMenu);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);

		
	} // fim do metodo iniciaGui
	
	public static void main(String[] args) {
		new TestGui7().iniciaGui();
	}

}
