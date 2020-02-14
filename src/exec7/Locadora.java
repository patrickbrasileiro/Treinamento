package exec7;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.sun.webkit.ContextMenu.ShowContext;

import jdk.nashorn.internal.ir.WhileNode;

public class Locadora {

	static Carro vetorCarro[];
	boolean sair = false;

	public static void main(String[] args) {

		Carro[] carroAuxiliar = new Carro[10];

		vetorCarro = new Carro[10];
		Carro carro1 = new Carro("OPALA", "BLZ-1972", 250, "GASOLINA", 80000, "VERMELHO");
		vetorCarro[0] = carro1;

		Carro carro2 = new Carro("MUSTANG", "BLU-1222", 280, "GASOLINA", 150000, "VERMELHO");
		vetorCarro[1] = carro2;

		Carro carro3 = new Carro("DART", "BLZ-1972", 320, "GASOLINA", 180000, "BRANCO");
		vetorCarro[2] = carro3;

		Carro carro4 = new Carro("UNO", "SLZ-4820", 400, "ALCOOL", 3000, "BRANCO");
		vetorCarro[3] = carro4;

		Carro carro5 = new Carro("GOL", "GOL-9520", 200, "ALCOOL", 50000, "VERMELHO");
		vetorCarro[4] = carro5;

		Carro carro6 = new Carro("GOL", "KKK-1596", 160, "ALCOOL", 80000, "BRANCO");
		vetorCarro[5] = carro6;

		Carro carro7 = new Carro("MAVERICK", "MVV-2226", 180, "GASOLINA", 180000, "VERMELHO");
		vetorCarro[6] = carro7;

		Carro carro8 = new Carro("IMPALA", "MVV-2226", 250, "GASOLINA", 180000, "BRANCO");
		vetorCarro[7] = carro8;

		Carro carro9 = new Carro("FUSCA", "CSV-3267", 120, "DIESEL", 20000, "VERMELHO");
		vetorCarro[8] = carro9;

		Carro carro10 = new Carro("SANTANA", "CSV-3267", 160, "DIESEL", 20000, "BRANCO");
		vetorCarro[9] = carro10;

		new Locadora();

	}

// while nesse caso esta repetindo o processo de decisao de busca até que aperte 9 para sair
	Locadora() {
		while (!sair) {
			decisaoBusca();
		}
	}

	public void decisaoBusca() {

		int escolha = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o modo de busca: \n 1- Modelo \n 2- Combustivel \n 3- Velocidade \n 4- Ordenar carros decrescente de valor  \n 5- Cor \n 6- Compra \n 9- Sair  "));

		switch (escolha) {
		case 1:
			String modelo = JOptionPane.showInputDialog("Digite o modelo:").toUpperCase();
			buscamodelo(modelo);
			break;

		case 2:
			String combustivel = JOptionPane.showInputDialog("Digite o combustivel:").toUpperCase();
			buscacombustivel(combustivel);
			break;

		case 3:
			int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade"));
			buscavelocidade(velocidade);
			break;

		case 4:

			lista();
			break;

		case 5:
			String cor = JOptionPane.showInputDialog("Digite a cor que deseja:").toUpperCase();
			buscacor(cor);
			break;

		case 6:
			String modeloEscolhido = JOptionPane.showInputDialog("Digite o modelo de carro desejado:").toUpperCase(); 
			exibirCompra(modeloEscolhido);
			
			String corEscolhida = JOptionPane.showInputDialog("Digite a cor desejada:").toUpperCase();
			exibirCompra(corEscolhida);
			
			
			break;
		case 9:
			sair = true;
			break;

		default:

			break;
		}

	}

	private void exibirCompra(String modelo) {
		// TODO Auto-generated method stub
		
	}

	// message, é um string que vai receber varios dados e depois vai imprimir tudo
	// organizado como se fosse jooptinon pane, só que traz tudo na mesma janela
	public void buscamodelo(String modelo) {
		boolean verificaRegistro = false;

		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloCarro.equals(modelo)) {
				message = message + "\nModelo carro é...:" + vetorCarro[i].modeloCarro + "\na placa do veiculo é...: "
						+ vetorCarro[i].placaCarro + "\nvelocidade maxima...: " + vetorCarro[i].velocidadeMax + "Km/h"
						+ "\n vetor[i].combustivel...: " + vetorCarro[i].combustivel + "\no veiculo custa...: " + "R$"
						+ vetorCarro[i].valor + "\n";

				verificaRegistro = true;

			}
		}
		if (!verificaRegistro) {
			JOptionPane.showMessageDialog(null, "não existe registros para pesquisa");
		} else {

			JTextArea ta = new JTextArea(message);
			JScrollPane scrollPane = new JScrollPane(ta);
			ta.setLineWrap(true);
			ta.setWrapStyleWord(true);
			scrollPane.setPreferredSize(new Dimension(250, 500));
			JOptionPane.showMessageDialog(null, scrollPane, message, JOptionPane.YES_NO_OPTION);
		}

	}

//
	public void buscacombustivel(String combustivel) {
		boolean verificaRegistro = false;

		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].combustivel.equals(combustivel)) {
				message = message + "\nModelo carro é...:" + vetorCarro[i].modeloCarro + "\na placa do veiculo é...: "
						+ vetorCarro[i].placaCarro + "\nvelocidade maxima...: " + vetorCarro[i].velocidadeMax + "Km/h"
						+ "\n vetor[i].combustivel...: " + vetorCarro[i].combustivel + "\no veiculo custa...: " + "R$"
						+ vetorCarro[i].valor + "\n";

				verificaRegistro = true;

			}
		}
		if (!verificaRegistro) {
			JOptionPane.showMessageDialog(null, "não existe registros para pesquisa");
		} else {
			
			JOptionPane.showMessageDialog(null, message);
			
		}

	}

	public void lista() {
		buscaordena();
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			message = message + "\nModelo carro é...:" + vetorCarro[i].modeloCarro + "\na placa do veiculo é...: "
					+ vetorCarro[i].placaCarro + "\nvelocidade maxima...: " + vetorCarro[i].velocidadeMax + "Km/h"
					+ "\n vetor[i].combustivel...: " + vetorCarro[i].combustivel + "\no veiculo custa...: " + "R$"
					+ vetorCarro[i].valor + "\n";

		}

		JTextArea ta = new JTextArea(message);
		JScrollPane scrollPane = new JScrollPane(ta);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		scrollPane.setPreferredSize(new Dimension(250, 500));
		JOptionPane.showMessageDialog(null, scrollPane, message, JOptionPane.YES_NO_OPTION);
	}

	public void buscaordena() {

		for (int i = 0; i < vetorCarro.length - 1; i++) {
			for (int j = i; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor < vetorCarro[j].valor) {
					Carro temp = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = temp;

				}
			}
		}

	}

	public void buscavelocidade(int velocidade) {
		boolean encontroucor = false;
		String message = "";

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velocidadeMax == (velocidade)) {

				message = message + "\nModelo carro é...:" + vetorCarro[i].modeloCarro + "\na placa do veiculo é...: "
						+ vetorCarro[i].placaCarro + "\nvelocidade maxima...: " + vetorCarro[i].velocidadeMax + "Km/h"
						+ "\n vetor[i].combustivel...: " + vetorCarro[i].combustivel + "\no veiculo custa...: " + "R$"
						+ vetorCarro[i].valor + "\n";

				encontroucor = true;
			}
		}
		if (!encontroucor) {
			JOptionPane.showMessageDialog(null, "velocidade invalida:");

		} else {
			JTextArea ta = new JTextArea(message);
			JScrollPane scrollPane = new JScrollPane(ta);
			ta.setLineWrap(true);
			ta.setWrapStyleWord(true);
			scrollPane.setPreferredSize(new Dimension(250, 500));
			JOptionPane.showMessageDialog(null, scrollPane, message, JOptionPane.YES_NO_OPTION);
		}

	}

	public void buscacor(String cor) {
		boolean encontroucor = false;
		String message = "";

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].corcarro.equals(cor)) {

				message = message + "\nModelo carro é...:" + vetorCarro[i].modeloCarro + "\na placa do veiculo é...: "
						+ vetorCarro[i].placaCarro + "\nvelocidade maxima...: " + vetorCarro[i].velocidadeMax + "Km/h"
						+ "\n vetor[i].combustivel...: " + vetorCarro[i].combustivel + "\no veiculo custa...: " + "R$"
						+ vetorCarro[i].valor + "\n";

				encontroucor = true;

			}
		}
		if (!encontroucor) {
			JOptionPane.showMessageDialog(null, "cor invalida:");

		} else {
			JTextArea ta = new JTextArea(message);
			JScrollPane scrollPane = new JScrollPane(ta);
			ta.setLineWrap(true);
			ta.setWrapStyleWord(true);
			scrollPane.setPreferredSize(new Dimension(250, 500));
			JOptionPane.showMessageDialog(null, scrollPane, message, JOptionPane.YES_NO_OPTION);

		}

	}

	public void exibircompra() {

		String modeloEscolhido = JOptionPane.showInputDialog("Informe o modelo:");
		
		
		
		if (modelo == venda && cor == cor) {
			
		}
	}
}
