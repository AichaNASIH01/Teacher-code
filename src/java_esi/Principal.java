package java_esi;

public class Principal {
	public Principal() {
		
		/*
		 * int[] tab= new int[10]; Arrays.fill(tab, 1); UpdateTab(tab, 4); for(int e:
		 * tab) System.out.println(e);
		 */
		testReference();
	}
	public void testReference() {
		Number n1= new Number();
		Number n2= new Number(14);
		n1.afficher();
		n2.afficher();
		
	}
	
	public void UpdateTab(int[] tab, int val) {
		for (int i = 0; i < tab.length; i++) {
			tab[i]=val;
		}
		
	
	}
	public void ex01() {
		System.out.println("Bonjour tout le monde");

	}
	public void ex02() {
		System.out.println("Bonjour maintenant  'est le deuxième exemple");
		Voiture v = new Voiture();
		System.out.println("la classe de voiture est:"+v.getClass());
	}
	public void ex03() {
		System.out.println("le nombre de roues des voitures est:"+Voiture.getNbrRoues());
		Voiture v1 = new Voiture();
		Voiture v2 =new Voiture();
		Voiture v3=v1;
		if(v1==v2) {
			System.out.println("les deux voitures v1 et v2 sont egales");
		}else {
			System.out.println("les voitures v1 et v2 sont differentes");
		}
		if(v1==v3) {
			System.out.println("les deux v1 et v3 voitures sont egales");
		}else {
			System.out.println("les voitures v1 et v3 sont differentes");
		}
		
		
		//v.demarrer();
		//v.arreter();
		
		
		/*
		 * Voiture v3= new Voiture("wwww0122458525805"); v3.demarrer(); v3.arreter();
		 * Object o = new Mere(1); Voiture.testClasse(o); Voiture.testClasse(v);
		 */
		
	}

	public static void main(String[] args) {
		new Principal();
		
		
		
	}

	
}
