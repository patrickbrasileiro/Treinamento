package exec8;

/**
 * Classe responsável por demonstrar caixa eletronica de saque
 *  com notas de 2, 5, 10, 20 e 50 
 * @author pbrasileiro
 * @since 17/02/2020
 * @version 0.1
 */
import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do saque:"));
		
		int nota50cont=0;
		int nota20cont=0;
		int nota10cont=0;
		int nota2cont=0;
		int total50=0;
		int total20=0;
		int total10=0;
		int total2=0;
		String message = "";	
		
		
	
		while (valor>=50){
			total50=valor-50;
			nota50cont++;
			
			} if (valor>=20) {
			total20=valor-20;
			nota20cont++;
		} 
		if (valor>=10){
			total10=valor-10;
			nota10cont++;
		}
		if (valor>=2) {
			total2=valor-2;
			
			nota2cont++;
			
//			while (valor==1) {
				
				{
					 
					 }

				JOptionPane.showMessageDialog(null, "quatidade de nota de 50 é:" + total50 + "quatidade de nota de 20 é:"+ total20 + "quatidade de nota de 10 é:" + total10 + "quatidade de nota de 2 é:"+total2);
				
				
			}
			
			
			
		} 
	}


//ValorSacado = ValorSacado – 1;
//Nota1Contador++;