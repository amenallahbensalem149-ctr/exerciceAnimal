package exAnimal;

public class Aigle extends Animal implements Volant {
	public Aigle(String nom, int age) {
		super (nom,age);
	}
	public void parler() {
		System.out.println("Cri d'aigle! 🦅");
	}
	public void voler() {
		System.out.println(nom+" vole majestueusement");
	}
}
