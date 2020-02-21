package exec10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Teste04 {
	
	public static void main(String[] args) {
		
		InputStream is;
		try {
			
			is = new FileInputStream("entrada.txt");
			InputStreamReader isr = new InputStreamReader(is);
			
			BufferedReader leitor= new BufferedReader(isr);
			String texto= leitor.readLine();
			while (texto!=null) {
				System.out.println(texto);
				texto=leitor.readLine();
			}
		} catch (FileNotFoundException e) {
			
	System.out.println("arquivo de entrada nao encontrado");	
//			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
	
	}

}
