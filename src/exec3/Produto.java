package exec3;

public class Produto {

	String nome = "salgadinho" ;

	int quatidade = 30;

	float custo = 2;

	int qvendida = 12;

	double percelucro = 0.3;

	public void exibirNome() {
		if (nome!=null) {
			
			System.out.println("O nome é: " + nome);	
		}else {
			System.out.println("O campo nome não foi valorizado");
		}
		

	}

	public void exibirValor() {
		if (custo>0) {
			System.out.println("o valor é: " + (custo + (custo * percelucro)));	
		} else {
			System.out.println("o valor invalido");	
		}
		
	}

	public void exibirLucro() {
		if (percelucro >0 && custo>0) {
			System.out.println("seu lucro é: "+ (custo * percelucro));	
		}
		System.out.println("lucro invalido");
	}

	public void exibirTudo() {
		exibirNome();
		exibirValor();
		exibirLucro();
		
	}

}
