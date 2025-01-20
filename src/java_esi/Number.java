package java_esi;

public class Number {
	private int n;
	public Number() {
		this.n=0;
	}
	public Number(int x) {
		this.n=x;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void afficher() {
		System.out.println("le nombre est :"+n);
	}
	

}
