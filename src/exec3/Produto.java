package exec3;

public class Produto {

	String nome = "salgadinho" ;

	int quatidade = 30;

	float custo = 2;

	int qvendida = 12;

	double percelucro = 0.3;

	public void exibirNome() {
		if (nome!=null) {
			
			System.out.println("O nome �: " + nome);	
		}else {
			System.out.println("O campo nome n�o foi valorizado");
		}
		

	}

	public void exibirValor() {
		if (custo>0) {
			System.out.println("o valor �: " + (custo + (custo * percelucro)));	
		} else {
			System.out.println("o valor invalido");	
		}
		
	}

	public void exibirLucro() {
		if (percelucro >0 && custo>0) {
			System.out.println("seu lucro �: "+ (custo * percelucro));	
		}
		System.out.println("lucro invalido");
	}

	public void exibirTudo() {
		exibirNome();
		exibirValor();
		exibirLucro();
		
	}

}
