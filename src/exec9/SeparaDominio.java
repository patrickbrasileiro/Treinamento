package exec9;
/**
 * 
 */

import javax.swing.JOptionPane;

public class SeparaDominio {

	public static void main(String[] args) {
	// ele vai mudar o icone de advertencia para informa as coisas	
		
	String email = JOptionPane.showInputDialog(null,"Informe o email","validador de email", 0);
	
//	String email = JOptionPane.showInputDialog("Informe o email");

int cont = email.indexOf("@");
if (cont>0) {
	System.out.println("posicao do @:" + cont);
	// mostra a posicao do arroba @
	String dominio = email.substring(cont+1);
	// pegar pedaco substring 
	System.out.println("Dominio do email"+ dominio);
	
	
	String usuario = email.substring(0,cont);
	System.out.println("usuario do email: "+usuario);
}
	}

}
