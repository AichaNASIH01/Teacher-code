package java_esi.interfaces;

public interface IArticle {
	public static final int a = 0;
	public abstract String getDescription();
	public abstract int getQte();
	public abstract void ajouterQte(int q);
	public abstract void retirerQte(int q);

}
