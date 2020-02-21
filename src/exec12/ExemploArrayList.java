package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe responsavel por demonstrar a utiliza��o de ArrayList
 * @author pbrasileiro
 *
 */

public class ExemploArrayList {

	public static void main(String[] args) {
		
		//criar um objeto ArrayList
		List<String> arrayList = new ArrayList<String>();
		
	
		// adicionar elementos ao final da lista, usamos o metodo add
		arrayList.add("elemento n�1");
		arrayList.add("elemento n�2");
		arrayList.add("elemento n�3");
		
		System.out.println("Posi��o 1 contem " + arrayList.get(0));
		System.out.println("Posi��o 2 contem " + arrayList.get(1));
		System.out.println("Posi��o 3 contem " + arrayList.get(2));
		// varrer a array
		for(String s : arrayList) {
			System.out.println(s);
		}
       //tamb�m podemos adicionar um elemento numa posicao qualquer
		arrayList.add(1, "Elemento n�1,5");
		System.out.println("\n apos adicionar o elemento 1,5");
		
		for(String s: arrayList) {
			System.out.println(s);
		}
		//obter o tamanho da lista
		System.out.println("\n o tamanho da lista � :"+ arrayList.size()+"\n");
		
		//podemos ver um determinado valor da lista
		if(arrayList.contains("Elemento n� 1,5")) {
			System.out.println("elemento 1,5 existe");
		} else {
			System.out.println("Elemento 1,5 n�o  existe");
		}
		
		int indice = arrayList.indexOf("elemento n� 1,5");
		System.out.println("\n o indice do elemento 1,5 �:" + indice);
		
		
		//remover um elemento da lista
		System.out.println("\n Removendo Elemento 1,5\n");
		arrayList.remove("Elemento n� 1,5");
		System.out.println("lista atualizada");
		
		for (String s : arrayList) {
			System.out.println(s);
		}
		//remover com base no indice - remover ultimo registro
		System.out.println("removendo o ultimo elemento");
		arrayList.remove(arrayList.size() -1);
		System.out.println("Lista atualizada");
		
		for (String s : arrayList) {
			System.out.println(s);
		}
		// adicionando elementos da lista
		System.out.println("\n adicionando elemento na lista");
		arrayList.add(1, "Elemento n�5");
		arrayList.add(1, "Elemento n�9");
		arrayList.add(1, "Elemento n�4");
		arrayList.add(1, "Elemento n�0");
		arrayList.add(1, "Elemento n�8");
		
		//exibir a lista atualizada
		System.out.println("\n Lista com elemento adicionados");
		for (String s : arrayList) {
			System.out.println(s);
		}
		
		//ordenando array list
		Collections.sort(arrayList);
		System.out.println("\n lista ordenada");
		for (String s : arrayList) {
			System.out.println(s);
		}
	}
	
	//criando uma lista de objeto - Filme
	List<Filme> arrayListFilme = new ArrayList<Filme>();
	
	//criando 3 filmes
	Filme filme1 = new Filme();
	filme1.setCodigo(1);
	filme1.setNome("Codigo de Conduta");
	
	Filme filme2 = new Filme();
	filme2.setCodigo(2);
	filme2.setNome("Era do gelo");
	
	Filme filme3 = new Filme();
	filme3.setCodigo(3);
	filme3.setNome("Matrix");
	
	//compare os filmes instanciados
	if(filme1.equals(filme2)) {
		System.out.println("\n Filme Igual\n");
	}else {
		System.out.println("\n Filmes Diferentes\n");
	}
// adicionar na lista os filmes instanciados
	arrayListFilme.add(filme1);
	arrayListFilme.add(filme2);
	arrayListFilme.add(filme3);
	
	//exibindo a lista de Objeto
	for(Filme f : arrayListFilme) {
		System.out.println(f);
	}
	
	//ordenar uma lista
	sys
}
