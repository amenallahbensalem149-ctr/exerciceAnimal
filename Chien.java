package exAnimal;

public class Chien extends AnimalDomestique implements Nageur{
	public Chien(String nom,int age) {
		super(nom,age);
	}
	public void parler() {
		System.out.println("Hab hab! 🐶");
	}
	public void nager() {
		System.out.println(nom+" nage comme un chien🏊‍♂️");
	}
	public void jouer() {
		System.out.println(nom+" joue avec son maitre 🎾");
	}
}
