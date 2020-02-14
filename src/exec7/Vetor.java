package exec7;
/**
 * exercio para como usar o vetor
 * @author pbrasileiro
 * @version 0.1
 */

public class Vetor {

	public static void main(String[] args) {
		// 1 passo declarar o tipo e depois variavel
		// no conchetes tiver vazio voce nao consegue manipular
	
		// isso é uma declaracao de vetor quando tem cochetes		
		
		int quatidade []; 
		quatidade = new int [4];
		
		quatidade[0] = 10;
		quatidade[3] = 4;
		
	//	System.out.println("valor do vetor:" + quatidade);
		
	//	for(int i =0; i<4; i++) {
			for(int i =0; i<quatidade.length; i++) {	
				
		System.out.println("valor do vetor:" + quatidade[i]);
				
		}
	}

}
