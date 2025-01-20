package java_esi.forms;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forme f = new Forme("forme indefinie");
		//f.printForm();
		Forme c =new Cercle("cercle", 10);
		//c.printForm();
		Object c1= new Forme();
		
		//c.printForm();
		Cercle c2= (Cercle) c;
		c2.printForm();
		c2.printForm("bonjour esi:");
		c2.printForm(new String());
		Thread t= new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("je suis à l'étape i="+i);
				}
			}
		};
		t.start();
		//classe interne
		Main main= new Main();
		Main.Internal intern= main.new Internal("ESI school");
		intern.print();
	}

	public class Internal{
		private String name;
		public Internal(String n) {name=n;}
		public void print() { System.out.println(" my school's name is:"+name);}
	}
}
