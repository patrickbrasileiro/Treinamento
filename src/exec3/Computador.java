package exec3;
/**
 * classe responsavel pela criação de obejto computador
 * @author pbrasileiro
 * @version 0.1
 */
public class Computador extends Produto{
	
	String processador= " amd FX-8320e";
	String memoria= "16 gb ddr3";
	String tela= "monitor 25 P";
	String placavideo= "nvidea 1060 6gb "; 
	
	public void exibirProduto() {
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(placavideo);
		
		exibirTudo();
	}

}

