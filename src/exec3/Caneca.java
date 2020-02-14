package exec3;

/**
 * classe responsavel pela criação de obejto caneca
 * @author pbrasileiro
 * @version 0.1
 */

public class Caneca extends Produto {

	
	
	boolean estampa= false;
	String material= "vidro";
	String medida= "medida padrao";
	
	
	public void exibirProduto() {
			
		System.out.println(estampa);
		System.out.println(material);
		System.out.println(medida);
		
		
		exibirTudo();
		
	}

}

	

