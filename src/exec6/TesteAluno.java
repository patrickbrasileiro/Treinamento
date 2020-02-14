package exec6;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TesteAluno {
	
	public static void main (String[]args) {
		
		String dataCompleta = JOptionPane.showInputDialog("Informe a data de Nascimento:");
		
		String data[] = dataCompleta.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		
		DateTime dataInicial = new DateTime (ano, mes, dia, 0, 0);
		DateTime dataFinal = new DateTime (2020, 02, 13, 0, 0);
		
	int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
	}

}
