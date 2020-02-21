package exec8;

public class CxEletronica {

}


package exercicios;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar o fluxo de saque
 * de um caixa eletrônico com notas de 2, 5, 10, 20 e 50 
 * @author Diego Munhoz
 * @since 17/02/2020
 * @version 0.1
 */

public class CaixaEletronico {//inicio da classe
	
	public static void main(String[] args) {//inicio do método main

		//Declaração das variáveis utilizadas no programa
		int valorSacado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor", "Calculadora", 1));
		int notaCinquenta = 0;
		int notaVinte = 0;
		int notaDez = 0;
		int notaCinco = 0;
		int notaDois = 0;
		
		//Inicio dos condicionais para calculo de notas
		if (valorSacado == 103) {
			notaCinquenta = 1;
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 103);
			System.out.println("Notas de Cinquenta: " + notaCinquenta);
			System.out.println("Notas de Vinte: " + notaVinte);
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);			
		}
		if (valorSacado == 53) {
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 53);
			System.out.println("Notas de Vinte: " + notaVinte);
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
		}else
			if (valorSacado >= 50) {
				notaCinquenta = (valorSacado / 50);
				valorSacado = (valorSacado - (notaCinquenta * 50));
				System.out.println("Notas de Cinquenta: " + notaCinquenta);
		}
		if (valorSacado == 43) {
			notaVinte = 1;
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 43);
			System.out.println("Notas de Vinte: " + notaVinte);
			System.out.println("Notas de Dez: " + notaDez);
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
		}
		if (valorSacado == 23) {
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 23;
			System.out.println("Notas de Dez: " + notaDez);
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
		}else		
			if (valorSacado >= 20) {
				notaVinte = (valorSacado / 20);
				valorSacado = (valorSacado - (notaVinte * 20));
				System.out.println("Notas de Vinte: " + notaVinte);
		}
		if (valorSacado == 13) {
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 13;
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
		}else
			if (valorSacado >= 10) {
				notaDez = (valorSacado / 10);
				valorSacado = (valorSacado - (notaDez * 10));
				System.out.println("Notas de Dez: " + notaDez);
		}
				
		switch (valorSacado) {
		case 9:
			notaCinco = 1;
			notaDois = 2;
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			break;
		case 8:
			notaDois = 4;
			System.out.println("Notas de Dois: " + notaDois);
			break;
		case 7:
			notaCinco = 1;
			notaDois = 1;
			System.out.println("Notas de Cinco: " + notaCinco);
			System.out.println("Notas de Dois: " + notaDois);
			break;
		case 6:
			notaDois = 3;
			System.out.println("Notas de Dois: " + notaDois);
			break;
		case 5:
			notaCinco = 1;			
			System.out.println("Notas de Cinco: " + notaCinco);
			break;
		case 4:
			notaDois = 2;
			System.out.println("Notas de Dois: " + notaDois);
			break;
		case 3:
			notaDois = 1;
			System.out.println("Notas de Dois: " + notaDois);
			break;
		case 2:
			notaDois = 1;
			System.out.println("Notas de Dois: " + notaDois);
			break;
		}

	}//fim do método main

}//fim da classe