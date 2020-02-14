package exec5;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * exercicio de operadores
 * 
 * @author pbrasileiro
 * @version 0.1
 */
public class AlugaFilme {

	double valorAluguelDiario = 2;
	double valorPago;
	int qtdDiasAlugados;
	String filmeSerAlugado;
	boolean filmeInceptionDisponivel = true;
	boolean filmeStolenDisponivel = true;

	public boolean verificaDisponibilidade(String filme) {

		int filmeEscolheu = Integer
				.parseInt(JOptionPane.showInputDialog("Escolha a opção de filme abaixo\n 1- Inception \n 2- Stolen"));
		System.out.println(filmeEscolheu);

		if (filmeEscolheu == 1) {
			if (filmeInceptionDisponivel) {
				System.out.println("filme Inception Disponivel");
				return true;
			} else {
				System.out.println("filme Inception Indisponivel");
				return false;
			}
		} else {
			if (filmeStolenDisponivel) {
				System.out.println("filme Stolen Disponivel");
				return true;
			} else {
				System.out.println("filme Stolen Indisponivel");
				return false;
			}
		}
	}

	public int escolhaDias() {
		return qtdDiasAlugados = Integer.parseInt(JOptionPane.showInputDialog("Informe os dias: "));
	}
	
	public double valorPg () {
		return valorPago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago"));
	}
	
	 public double valorapagar () {
		 return
	 }
	
}
