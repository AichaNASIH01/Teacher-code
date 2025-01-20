package java_esi.interfaces;

public class Stylo implements IArticle{
	private int qte;
	private String description;
	
	public Stylo() {
		
	}
	public Stylo(String desc, int q) {
		this.description=desc;
		this.qte=q;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public int getQte() {
		// TODO Auto-generated method stub
		return qte;
	}
	@Override
	public void ajouterQte(int q) {
		this.qte+=q;		
	}
	@Override
	public void retirerQte(int q) {
		this.qte-=q;
		
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	

}
