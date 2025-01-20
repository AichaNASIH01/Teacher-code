package java_esi;

public class Chien implements Comparable<Chien> {
	private String name;
	private int age;
	
	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chien(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Chien c) {
		// TODO Auto-generated method stub
		int r=0;
		if(this.age>c.getAge()) {
			r=1;
		}else if(this.age<c.getAge()) {
			r=-1;
		}
		
		return r;
	}
	@Override
	public boolean equals(Object obj) {
		Chien c= (Chien) obj;
		boolean t= false;
		
		if(this.getAge()==c.getAge())
			t=true;
		
		
		return t;
	}

}
