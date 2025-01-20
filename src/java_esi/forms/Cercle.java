package java_esi.forms;

public class Cercle extends Forme{
	private double radius;
	
	public Cercle() {
		super();
		this.radius=0;
	}
	public Cercle(String name, double r) {
		super(name);
		this.radius=r;
	}
	
	//@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	@Override
	public void printForm() {
		// TODO Auto-generated method stub
		//super.printForm();
		System.out.println("je suis:"+super.name+"le rayon est de:"+radius);
	}
	public void printForm(String msg) {
		System.out.println(msg+",je suis:"+super.name+" le rayon est de:"+radius);	
	}
	public void add() {
		this.radius+=1;
	}
	public void add(int i) {
		this.radius+=i;
	}
	
}
