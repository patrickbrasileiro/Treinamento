package exec4;

/**
 * Inovação tecnologica provomendo um double para int(para receber um valor do formato double para o inteiro)
 * @author pbrasileiro
 * @version 0.1
 */

public class TestaValor {
	public static void main(String[] args) {
		
		String d= "100";
		// conversao do double "d" que vai virar inteiro - int
		int i = Integer.parseInt(d);
		String s = i + "";
		System.out.println("valor e "+s);
	}

}
