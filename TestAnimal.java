package exAnimal;

public class TestAnimal {
	public static void main(String[] args) {
		Animal[] animaux= {
				new Chien("Rex",5),
				new Canard("Dom",2),
				new Aigle("Sky",4),
				new Poisson("Nemo",1),
				new Dauphin("Flipper",7)
		};
		//for(animal a animaux){ et devient a.nom etc...
		for (int i=0;i<5;i++) {
			System.out.println("----------"+animaux[i].nom+"---------");
			animaux[i].parler();
			animaux[i].manger();
			animaux[i].dormir();
			if (animaux[i] instanceof Nageur) {
				((Nageur)animaux[i]).nager();
			}
			if (animaux[i] instanceof Volant) {
				((Volant)animaux[i]).voler();
			}
			if (animaux[i] instanceof Chien) {
				((Chien)animaux[i]).jouer();
			}
			System.out.println();
		}
	}
}
