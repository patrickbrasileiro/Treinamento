package exec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Teste03 {

	public static void main(String[] args) {
// classe file, ela gera o arquivo
		File arquivo =new File ("saida.txt");
		
		try {
			
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo,true);
			PrintStream gravador= new PrintStream(arquivoOutput);
			gravador.println ("texto");
			gravador.println ("texto");
			gravador.println ("texto");
			gravador.println ("texto");
			gravador.println ("texto");
			gravador.close();
			arquivoOutput.close();
			
		} catch (FileNotFoundException e) {
		
		
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}

	}

}
