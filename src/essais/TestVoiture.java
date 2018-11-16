package essais;

import vehicule.Voiture;

public class TestVoiture {

	public static void main(String[] args) {
		
		//création de 3 instances 
		Voiture bmw = new Voiture("BMW", 220.0f, 8);
		Voiture ford = new Voiture("Ford", 200.0f, 6);
		Voiture audi =  new Voiture("Audi", 240.0f, 8);
		
		//création du tableau ayant pour longueur le nombre d'instance
		Voiture[] voitures = new Voiture[Voiture.compteurInstance];
		
		//sauvegarde chacune des instances dans le tableau voitures
		voitures[0] = bmw;
		voitures[1] = ford;
		voitures[2] = audi;
		
		//affichage du tableau
		for (int i = 0; i < voitures.length; i++) {
			
			System.out.println(voitures[i].ToString());
		}
		
		//affichage du nombre d'instance
		System.out.println("Le nombre de voitures est : "+Voiture.compteurInstance);
		
	}
}
