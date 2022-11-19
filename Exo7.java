package Brief_Exo;

import java.util.Scanner;

public class Exo7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Saisir le nombre de ligne");
		int n = input.nextInt();
		Ligne_compte [] tab = new Ligne_compte[n];
		double somme = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Indiquez l'intitulé du "+ (i+1) +"ème montant");
			String intitule = input.next();
			System.out.println("Indiquez le "+ (i+1) +"ème montant");
			double montant = input.nextDouble();
			tab[i] = new Ligne_compte(intitule, montant);
			somme += tab[i].getMontant();
		}
		System.out.println("Le solde est de : "+ somme);
		input.close();
		
		
		
	}

}
