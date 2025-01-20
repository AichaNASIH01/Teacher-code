package java_esi;

public class Voiture {
	//declaration d'attribut de classe
	private static int NBROUES=4; 
	//declaration d'attributs
	private String couleur;
	private String marque;
	private String carburant;
	private String id;
	
	//declaration de methode de classe
	public static int getNbrRoues() {
		return NBROUES;
	}
	//constructeur avec 3 param
	public Voiture(String id, String color, String brand, String fuel) {
		this.couleur=color;
		this.marque=brand;
		this.carburant=fuel;
		this.id=id;
	}
	
	//constructeur avec 1 param
	public Voiture(String id){
		this.id=id;
	}
	
	//constructeur sans param
	public Voiture() {
		this.id="0000";
		
	}
	
	//setter de carburant
	public void setCarburant(String s) {
		this.carburant=s;
	}
	//getter de carburant
	public String getCarburant() {
		return this.carburant;
	}
	//methode privée
	private void allumerTableauDeBord() {
		System.out.println(this.id+" tableau de bord allumé ");
	}
	//methide public demarrage
	public void demarrer() {
		System.out.println(this.id+":voiture en cours de demarrage");
		this.allumerTableauDeBord();
		System.out.println(this.id+ " voiture demarrée");
	}
	//methode publique arret de voiture
	public void arreter() {
		System.out.println(this.id+ " voiture arretée");
	}
	public static void testClasse(Object v) {
		 if (v instanceof java_esi.Voiture )
			 System.out.println(" v est une instance de la classe Voiture ");
		 else System.out.println(" V n'est pas un objet de la classe Voiture ");
		}
	
	

}
