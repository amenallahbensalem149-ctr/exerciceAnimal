package exAnimal;

public class Canard extends Animal implements Volant,Nageur {
	public Canard(String nom,int age) {
		super(nom,age);
	}
	public void parler() {
		System.out.println("Coin coin !🦆");
	}
	public void nager() {
		System.out.println(nom+" nage tranquillement dans le lac");
	}
	public void voler() {
		System.out.println(nom+" vole dans le ciel☁️");
	}
}
