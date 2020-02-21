package exec9;
/**
 * para remover espaço usando o trim
 * @author pbrasileiro
 *@since 17/02/2020
 */
public class Trim {

	public static void main(String[] args) {
	
		String um = "Olá ";
		String dois = " mundo";
		System.out.println(" antes do trim: "+um+dois+".");
		um = um.trim();
		dois = dois.trim();
		System.out.println("Depois do trim" +um+dois+ ".");	

	}

}
