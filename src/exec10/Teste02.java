package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {
	public static void main(String[] args) {
		
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			gravador.println("Olá");
			gravador.println("bem vindo");
			gravador.println("ao telecurso 2000");
			gravador.println("br");
			gravador.println("shazam");
			gravador.close();
			//gravador e o objeto
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}

}
