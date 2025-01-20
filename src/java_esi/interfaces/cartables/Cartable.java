package java_esi.interfaces.cartables;

import java.util.Vector;

import java_esi.interfaces.IArticle;

public class Cartable implements IArticle {
	private String desc;
	private int v;
	private String marque;
	
	public Cartable() {
		// TODO Auto-generated constructor stub
	}
	public Cartable(String desc, int q, String m) {
		this.desc= desc;
		this.marque=m;
		this.v=q;
		//this.q=q;
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return desc;
	}

	@Override
	public int getQte() {
		// TODO Auto-generated method stub
		return v;
	}

	@Override
	public void ajouterQte(int q) {
		this.v+=q;
		

	}

	@Override
	public void retirerQte(int q) {
		// TODO Auto-generated method stub
		this.v-=q;

	}

}
