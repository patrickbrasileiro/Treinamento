package exec7;

import javax.swing.JOptionPane;

/**
 * classe responsavel c
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
	String corCarro;
	boolean vendido = false;
	String compra;

//contrutor vazio:	
	public Carro() {

	}

	public Carro(String modeloCarro, String placaCarro, int velocidadeMax, String combustivel, int valor,
			String corCarro) {

		this.modeloCarro = modeloCarro;
		this.placaCarro = placaCarro;
		this.velocidadeMax = velocidadeMax;
		this.combustivel = combustivel;
		this.valor = valor;
		this.corCarro = corCarro;
	}

	public void exibir() {

		JOptionPane.showMessageDialog(null,
				"o modelo do veiculo é: " + modeloCarro + "\na placa do veiculo é: " + placaCarro
						+ "\nvelocidade maxima: " + velocidadeMax + "Km/h" + "\ncombustivel: " + combustivel
						+ "\no veiculo custa: " + "R$" + valor + "\n");

	}

}
