package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class TesteGui3 {
	
	//Declarar os componente de tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;
	
	public TesteGui3 () {
		iniciaGui();

	}
	public void iniciaGui() {
		
		//Cria a janela (instancia)
		janela = new JFrame();
		// Cria a area de texto
		area=new JTextArea();
		//criar o primeiro botao
		botao1= new JButton("clique aqui");
		
		// adicionar o metodo desenvolvido na classe Textolistener
		botao1.addActionListener(new TextoListener());
		
		//Criar o segundo botao
		botao2 = new JButton("Troca cor");
		// adicionar o metodo desenvolvido na classe CorListener
		botao2.addActionListener(new CorListener());
		
		//Cria um campo para digitar texto
		campo= new JTextField();
		// adicionar o metodo desenvolvido na classe TextoListener
		campo.addActionListener(new TextoListener());
		//Adicionar o botao ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST,botao2);
		//Adicionar o botao 2 ao painel de janela
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		// Adicionar a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER,area);
		// Adicionar JTextField ao painel da janela 
		janela.getContentPane().add(BorderLayout.NORTH,campo);
		// Configurar o tamanho da tela 
		janela.setSize(300, 300);
		//configurar a visibilidade da tela
		janela.setVisible(true);
		
		
	}
	
	
	public class TextoListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			// append concatenar o texto
			area.append(campo.getText() + "\n");
			campo.setText("");
			
		}
	
		
	}
	// adicionar metodo nao implementados 
	public class CorListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// se o fundo da JTextArea for neutro troca para preto
			if (area.getBackground().equals(Color.BLACK)) {
				// PARA MUDAR A COR DO FUNDO
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);
		} else {
			area.setBackground(Color.BLACK);
			area.setForeground(Color.WHITE);
		}

	}
	
		
			
		}
		
 {
			
		}
		
	
	
	
	
	public static void main(String[] args) {
		new TesteGui3();

	}

}
