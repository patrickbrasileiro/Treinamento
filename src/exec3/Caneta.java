package exec3;
/**
 * classe responsavel pela criação de obejto caneta 
 * @author pbrasileiro
 *@version 0.1
 */
public class Caneta extends Produto{

	
	String cor= " vermelho";
	String formato = "padrao";
	String marca= "bic";
	
	
	public void exibirProduto() {
		
		System.out.println(cor);
		System.out.println(formato);
		System.out.println(marca);
		
		exibirTudo();
	}

	
	
	
	
}
