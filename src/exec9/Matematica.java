package exec9;

public class Matematica {

	public static void main(String[] args) {
	
		double x=10, y=20.5 , z=-30;
		// valor absoluto retina o sinal matematico
		double abs= Math.abs(z);
System.out.println(abs);

// retorna menor valor inteiro
double ceil= Math.ceil(y);
System.out.println(ceil);
// arredonda o valor para o numero inteiro
double floor = Math.floor(y);
System.out.println(floor);
// logaritmo
double log = Math.log(x);
System.out.println(log);

// retorna o maior valor inteiro entre os dois elementos
double max= Math.max(x,y);
System.out.println(max);

// retona o minimo entre dois elementos
double min= Math.min(x,y);
System.out.println(min);
//calcula a potencia
double pow = Math.pow(x, 2);
System.out.println(pow);

// raiz quadrada
double sqrt = Math.sqrt(x);
System.out.println(sqrt);
// efetua o calculo de seno, conseno e tangente
Double cos = Math.cos(y);
double sin = Math.sin(y);
double tan = Math.tan(y);
System.out.println(cos);
System.out.println(sin);
System.out.println(tan);
	}

}
