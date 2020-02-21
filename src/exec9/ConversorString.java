package exec9;
/**
 * Para deixar em maiusculo e minusculo
 * @author pbrasileiro
 *@version 0.1
 *since 17/02/2020
 */

public class ConversorString {

	public static void main(String[] args) {
		String lista [] = new String [5];
		lista[0] = "java";
		String str= lista[0];
		String maiuscula = str.toUpperCase();
		String minuscula = str.toLowerCase();
		System.out.println("original" + str);
		System.out.println("maiuscula" + maiuscula);
		System.out.println("minuscula" + minuscula);
	}

}
