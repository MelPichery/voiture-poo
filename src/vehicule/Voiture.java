package vehicule;

public class Voiture {

	private String marque;
	private float vitesse;
	private int puissance;
	public static int compteurInstance = 0;
	
	public Voiture() {}
	
	public Voiture(String marque, float vitesse, int puissance) {
		
		this.marque = marque ;
		this.vitesse = vitesse ;
		this.puissance = puissance ;
		
		//a chque création d'instance le compteur s'incrémente de 1
		compteurInstance = compteurInstance + 1;
		
	}
	
	public String ToString() {
		
		return "marque = "+marque+",  vitesse = "+vitesse+",  puissance = "+puissance;
		
	}
}
