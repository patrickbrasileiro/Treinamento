package exec7;

import javax.swing.JOptionPane;

/**
 * classe responsavel controle de vsrro
 * 
 * @author pbrasileiro
 * @vesion 0.1
 */

public class Carro {

	String modeloCarro;
	String placaCarro;
	int velocidadeMax;
	String combustivel;
	int valor;
	String corcarro;
	boolean vendido = false;

//contrutor vazio:	
	public Carro() {

	}

	public Carro(String modeloCarro, String placaCarro, int velocidadeMax, String combustivel, int valor,
			String corcarro) {

		this.modeloCarro = modeloCarro;
		this.placaCarro = placaCarro;
		this.velocidadeMax = velocidadeMax;
		this.combustivel = combustivel;
		this.valor = valor;
		this.corcarro = corcarro;
	}

	public void exibir() {

		JOptionPane.showMessageDialog(null,
				"o modelo do veiculo �: " + modeloCarro + "\na placa do veiculo �: " + placaCarro
						+ "\nvelocidade maxima: " + velocidadeMax + "Km/h" + "\ncombustivel: " + combustivel
						+ "\no veiculo custa: " + "R$" + valor + "\n");

	}

}