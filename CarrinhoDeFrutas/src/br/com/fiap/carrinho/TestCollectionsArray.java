package br.com.fiap.carrinho;

import java.util.ArrayList;

public class TestCollectionsArray {

	public static void main(String[] args) {
		
		List<String> carrinho = new ArrayList<String>();
		
		carrinho.add("maca");
		carrinho.add("morango");
		carrinho.add("maca");
		carrinho.set(1, "pera");
		
		System.out.println(carrinho.isEmpty());
		System.out.println(carrinho.size);
		
		/*ArrayList carrinho = new ArrayList();
		double valor = 100.55;
		int valor2 = 1;
		int valor3;
		
		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);
		
		System.out.println(carrinho.get(1));*/

	}

}
