

package exec6;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;

/**
 * 
 * @author pbrasileiro
 *
 */

public class Aluno {

	String nome;
	Calendar dataNascimento;
	String curso;
	String cidade;

	public Aluno() {

		// Para gerar um contrustor você vai com o botão direito, vai em source gerate
		// constructor
	}

	//public Aluno é o contrutor
	public Aluno(String nome,  dataNascimento, String curso, String cidade) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
		this.cidade = cidade;
		exibir();
	}
	
	
//	public int idade() {	
		
//		String data =(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(System.currentTimeMillis())));
//		Integer.parseInt(data);
		
//		String vetor [] = dataNascimento.split("/");
//		String amz = data[2] + data [1] + data[0]; // conversao dos numeros
//		int anoNasci = Integer.parseInt (amz);
//		int n = Integer.parseInt (data);
		
//		int resultado = anoNasci - x;
//	}

	
	
	public 
	
	DateTime dataInicial = new DateTime (ano, mes, dia, 0, 0);
	DateTime dataFinal = new DateTime (2020, 02, 13, 0, 0);
	
	
	
	public void exibir () {
		JOptionPane.showMessageDialog(null, "O nome do aluno é : " + nome );
		JOptionPane.showMessageDialog(null, " A idade é : " + idade());
		JOptionPane.showMessageDialog(null, "O curso é  : " + curso);
		JOptionPane.showMessageDialog(null, "A cidade é  : " + cidade);
	}

}






// se eu uso idade () na impressao você consegue trazer o metodo do retorno
