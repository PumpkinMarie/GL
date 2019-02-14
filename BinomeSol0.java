package ex1;

public class BinomeSol0 extends Binome {
	
	public BinomeSol0(double pa,double pb,double pc,double pdis) {
		super(pa,pb,pc,pdis);
	}
	
	public void calculer_racine()
	{ System.out.println("Binome sans solution"); }
	
	public int nb_racine()
	{ return 0; }
}
