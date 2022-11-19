package Brief_Exo;

import java.util.Scanner;

public class Compte {
	//Attributs
	private Ligne_compte ligne1,ligne2,ligne3,ligne4,ligne5; 
	Scanner input = new Scanner(System.in);
	
	//Constructeurs
	public Compte(Ligne_compte ligne1,Ligne_compte ligne2,Ligne_compte ligne3,Ligne_compte ligne4,Ligne_compte ligne5) {
		this.ligne1 = ligne1;
		this.ligne2 = ligne2;
		this.ligne3 = ligne3;
		this.ligne4 = ligne4;
		this.ligne5 = ligne5;
		
	}
	
	public Compte(){
		
	}
	
	//Méthodes
	
	public double solde() {
		return ligne1.getMontant()+ligne2.getMontant()+ligne3.getMontant()+ligne4.getMontant()+ligne5.getMontant();
	}
	
	public double moyenne() {
		return this.solde()/5;
	}
	
	public double maximum() {
		double max = ligne1.getMontant();
		double [] tab = {ligne1.getMontant(),ligne2.getMontant(),ligne3.getMontant(),ligne4.getMontant(),ligne5.getMontant()};
		for (int i = 1; i < 5; i++) {
			if(max < tab[i]) {
				max = tab[i];
			}
		}
		return max;
	}
	
	public double minimum() {		
		double [] tab = {ligne1.getMontant(),ligne2.getMontant(),ligne3.getMontant(),ligne4.getMontant(),ligne5.getMontant()};
		double min = ligne1.getMontant();
		for (int i = 1; i < 5; i++) {
			if(min > tab[i]) {
				min = tab[i];
			}
		}
		return min;
	}

}
