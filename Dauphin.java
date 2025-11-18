package exAnimal;

public class Dauphin extends Animal implements Nageur {
	public Dauphin (String nom, int age) {
		super(nom,age);
	}
	public void nager() {
		System.out.println(nom+" nage avec élégance🌊✨");
	}
	public void parler() {
		System.out.println("Clic clic!");
	}
}
