package ex1;

public class BinomeSol2 extends Binome {

	public BinomeSol2(double pa,double pb,double pc,double pdis) {
		super(pa,pb,pc,pdis);
	}
	

	public void calculer_racine()
		{ System.out.println("Binome a " + nb_racine() + " solutions de valeur : " + valeur_racine(1) + " et " + valeur_racine(-1)); }
	
	public int nb_racine()
		{  return 2; }
	
	public double valeur_racine(int i) 
		{ if(i==1) return (-b-Math.sqrt(dis))/(2*a);
		return (-b+Math.sqrt(dis))/(2*a);}
}
