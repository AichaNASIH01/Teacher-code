package java_esi.ui;

public class Produit implements Item {
	private String ref;
	private int pu;
	private int qte;
	private String[] labels= {"reference","Prix unitaire", "quantité"};
	private int[] sizes= {20,10,10};
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	public Produit(String ref, int pu, int qte) {
		this.ref=ref;
		this.pu=pu;
		this.qte=qte;
	}
	
	public int getFieldsCount() {
		// TODO Auto-generated method stub
		return labels.length;
	}

	public String getLabelField(int i) {
		// TODO Auto-generated method stub
		return labels[i];
	}

	public int getTextFieldSize(int i) {
		// TODO Auto-generated method stub
		return sizes[i];
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Produit";
	}

}
