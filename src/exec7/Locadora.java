package exec7;

import javax.swing.JOptionPane;

import com.sun.webkit.ContextMenu.ShowContext;

import jdk.nashorn.internal.ir.WhileNode;

public class Locadora {

	static Carro vetorCarro[];

	public static void main(String[] args) {

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

		Carro carro6 = new Carro("PARATI", "KKK-1596", 160, "ALCOOL", 80000, "BRANCO");
		vetorCarro[5] = carro6;

		Carro carro7 = new Carro("MAVERICK", "MVV-2226", 180, "GASOLINA", 180000, "VERMELHO");
		vetorCarro[6] = carro7;

		Carro carro8 = new Carro("IMPALA", "MVV-2226", 180, "GASOLINA", 180000, "BRANCO");
		vetorCarro[7] = carro8;

		Carro carro9 = new Carro("FUSCA", "CSV-3267", 120, "DIESEL", 20000, "VERMELHO");
		vetorCarro[8] = carro9;

		Carro carro10 = new Carro("SANTANA", "CSV-3267", 195, "DIESEL", 20000, "BRANCO");
		vetorCarro[9] = carro10;

		new Locadora();

	}

	Locadora() {
		decisaoBusca();
	}

	public void decisaoBusca() {

		int escolha = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o modo de busca: \n 1 - Modelo \n 2 - Combustivel \n 3 - velocidade \n 4 - Ordenar carros decrescente de valor  \n 5- cor  "));

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

		default:

			break;
		}
	}

	public void buscamodelo(String modelo) {
		boolean encontrou = false;

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modeloCarro.equals(modelo)) {
				vetorCarro[i].exibir();
				encontrou = true;
			}

		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "não existe resultado para sua busca");
		}
	}

	public void buscacombustivel(String combustivel) {

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].combustivel.equals(combustivel)) {
				vetorCarro[i].exibir();
			}

		}
	}

	
	public void lista() {
		buscaordena();
		
		for (int k = 0; k < vetorCarro.length; k++) {
            vetorCarro[k].exibir();
			
		}
	}
	
	
	
	public void buscaordena () {
		
		for (int i = 0; i < vetorCarro.length-1; i++) {
				    for (int j = i; j < vetorCarro.length; j++) {
				        if (vetorCarro[i].valor < vetorCarro[j].valor) {
				        	Carro temp= vetorCarro[i];
				            vetorCarro[i] = vetorCarro[j];
				            vetorCarro[j] = temp;

				        }
				    }
				}


			
				
			}
		
	

	public void buscavelocidade(int velocidade) {

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velocidadeMax == (velocidade)) {
				vetorCarro[i].exibir();
			}

		}
	}

	public void buscacor(String cor) {
		boolean encontroucor = false;

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].corcarro.equals(cor)) {
				vetorCarro[i].exibir();
				encontroucor = true;

			} else if (!encontroucor) {
				JOptionPane.showMessageDialog(null, "cor invalida:");

			}
		}

	}
}
