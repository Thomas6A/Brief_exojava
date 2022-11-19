package Brief_Exo;

import java.util.Scanner;

public class Exo6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Saisi des cinqs ligne de compte
		System.out.println("Indiquez l'intitulé du premier montant");
		String intitule1 = input.next();
		System.out.println("Indiquez le premier montant");
		double montant1 = input.nextDouble();
		Ligne_compte ligne1 = new Ligne_compte(intitule1, montant1);
		System.out.println("Indiquez l'intitulé du second montant");
		String intitule2 = input.next();
		System.out.println("Indiquez le second montant");
		double montant2 = input.nextDouble();
		Ligne_compte ligne2 = new Ligne_compte(intitule2, montant2);
		System.out.println("Indiquez l'intitulé du troisième montant");
		String intitule3 = input.next();
		System.out.println("Indiquez le troisième montant");
		double montant3 = input.nextDouble();
		Ligne_compte ligne3 = new Ligne_compte(intitule3, montant3);
		System.out.println("Indiquez l'intitulé du quatrième montant");
		String intitule4 = input.next();
		System.out.println("Indiquez le quatrième montant");
		double montant4 = input.nextDouble();
		Ligne_compte ligne4 = new Ligne_compte(intitule4, montant4);
		System.out.println("Indiquez l'intitulé du cinquième montant");
		String intitule5 = input.next();
		System.out.println("Indiquez le cinquième montant");
		double montant5 = input.nextDouble();
		Ligne_compte ligne5 = new Ligne_compte(intitule5, montant5);
		
		//Intéractions avec l'objet compte
		Compte compte = new Compte(ligne1,ligne2,ligne3,ligne4,ligne5);
		System.out.println("Le solde du compte est de : "+ compte.solde() +", la moyenne des lignes de comptes est de : "+ compte.moyenne() 
		+", le maximum est de : "+ compte.maximum() +" et le minimum est de : "+ compte.minimum());
		input.close();
	}

}
