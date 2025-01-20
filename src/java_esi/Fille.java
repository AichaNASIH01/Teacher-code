package java_esi;

public class Fille extends Mere {
	int y;
	public Fille(int x, int y){
		super(x);
		this.y=y;
	}
	void affichage(){
		super.affichage(); 	
		System.out.println(" classe Fille" +y);
		
	}
	void methode3(){/*…*/}
	
}
