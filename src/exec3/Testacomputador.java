package exec3;
/**
 * classe responsavel pela criação de obejto computador
 * @author pbrasileiro
 * @version 0.1
 */
public class Testacomputador extends Produto{
	public static void main(String[] args) {
		// para chamar o extends
		Computador cp1= new Computador();
		
		cp1.exibirProduto();
	}
	
}
