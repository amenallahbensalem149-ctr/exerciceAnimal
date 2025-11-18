package exAnimal;

public class Poisson extends Animal implements Nageur {
	public Poisson(String nom, int age) {
		super(nom,age);
	}
	public void nager() {
		System.out.println(nom+" nage rapidement dans l'eau 🌊");
	}
	public void parler() {
		System.out.println("Bloup bloup 🐟");
	}
}
