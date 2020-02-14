package exec3;
/**
 * classe responsavel pela criação de obejto carro
 * @author pbrasileiro
 * @version 0.1
 */

public class Carro extends Produto {
	
	String marca= " GM";
	String modelo = "Opala";
	String ano= "1973";
	String cor= "vermelho";
	String motor= "6 cc 3.8";
	
	public void exibirProduto() {
		
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);
		System.out.println(cor);
		System.out.println(motor);
		
		
		exibirTudo();
	}
	

}
