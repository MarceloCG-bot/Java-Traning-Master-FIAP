package com.fiap.heranca;

public class Teste {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come racao de cachorro");
		cachorro.setLocomove("Cachorro usa 4 patas");
		cachorro.setLatido("Cachorro faz auau");
		
		Animal poodle = new Cachorro();
		poodle.setAlimenta("Poodle come racao de cachorro");
		poodle.setLocomove("Poodle usa 4 patas");
	}

}
