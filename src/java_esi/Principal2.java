package java_esi;

public class Principal2 {
	public Principal2() {
		testReference();
	}
	
	public void testReference() {
		Number n1= new Number();
		Number n2= new Number(14);
		n1.afficher();
		n2.afficher();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Principal2();

	}

}
