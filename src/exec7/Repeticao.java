package exec7;

/**exemplo de como usar while e do while
 * @author pbrasileiro
 * @vesion 0.1
 */

import javax.swing.JOptionPane;

public class Repeticao {

	boolean exit = false;

	public Repeticao() {
//		while (!exit) {
			
	//		processar();
	//	}
		testawhile();
	}
	public void testawhile() { // esse pergunta antes de executar
	int i=10;
	while (i<10) {
		System.out.println(i+"ao cubo é"+ ((i*i)*i));
		i=i+1;
	}
	}
	
	public void testaDoWhile() {// esse nao pergunta, vai executar primeiro depois pergunta
		int i=10;
		
		do {
			System.out.println(i+ " ao cubo é "+ ((i*i)*i));
			i++;
		} while (i<10);
		}
	

	public void processar() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("INFORME A OPCAO:"));

		switch (opcao) {

		case 1:
			JOptionPane.showMessageDialog(null, "opcao 1");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "opcao 2");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "opcao 3");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "opcao 9");
			exit = true;
			break;
		default:
			JOptionPane.showMessageDialog(null, "opcao invalida");
			break;

		}
	}

	public static void main(String[] args) {
		new Repeticao();

	}

}
