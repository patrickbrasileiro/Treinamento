package exec10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
	
		try {
			Scanner leitor = new Scanner(new FileReader("entrada.txt"));
			while (leitor.hasNext()) {
				System.out.println(leitor.next());
			}
			
			} catch (FileNotFoundException e) {
				System.out.println("arquivo de entrada nao encontrado");
		//	e.printStackTrace();
		}

	}

}
