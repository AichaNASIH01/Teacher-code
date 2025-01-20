package java_esi.forms;


public class Forme {
	protected String name;
	public Forme() {
		super();
		name="unknown";
	}
	public Forme(String n) {
		this.name=n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return 0.0;
	}
	
	public void printForm() {
		System.out.println("je suis :"+name);
	}
	

}
