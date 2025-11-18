package exAnimal;

public abstract class Animal {
	protected String nom;
	protected int age;
	
	public Animal(String nom,int age) {
		this.nom=nom;
		this.age=age;
	}
	public void dormir() {
		System.out.println(nom+" dort....😴");
	}
	public abstract void parler();
	public void manger() {
		System.out.println(nom+" mange...🍽️");
	}
	
}
