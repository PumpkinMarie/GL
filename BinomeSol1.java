package ex1;

public class BinomeSol1 extends Binome {
	
	public BinomeSol1(double pa,double pb,double pc,double pdis) {
		super(pa,pb,pc,pdis);
	}

	public void calculer_racine()
		{ System.out.println("Binome a " + nb_racine() + " solution de valeur :  " + valeur_racine() ); }

	public int nb_racine()
		{ return 1; }

	public double valeur_racine()
	{return -b/(2*a); }

}
