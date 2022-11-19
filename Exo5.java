package Brief_Exo;

import java.util.Scanner;

public class Exo5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Indiquez l'intitulé du montant");
		StringBuilder intitule = new StringBuilder();
		intitule.append(input.nextLine());
		System.out.println("Indiquez le montant");
		double montant = input.nextDouble();
		Ligne_compte ligne = new Ligne_compte(intitule.toString(), montant);
		ligne.indiq_argent();
		input.close();
	}

}
