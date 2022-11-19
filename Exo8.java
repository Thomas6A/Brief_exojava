package Brief_Exo;

import java.util.Scanner;

public class Exo8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez le nom");
		String nom = input.next();
		System.out.println("Entrez la description");
		String description = input.next();
		System.out.println("Entrez une utilisation possible");
		String utilisation = input.next();
		System.out.println("Entrez le lieu de stockage");
		String lieu = input.next();
		Outil outil1 = new Outil(nom,description,utilisation,lieu);
		Outil outil2 = new Outil(outil1);
		System.out.println("Le nom de l'outil 1 est : "+ outil1.getNom() +", sa description est : "+ outil1.getDescription() 
		+", une de ses utilisations possible est : "+ outil1.getUtilisation() +" et son lieu de stockage est : "+ outil1.getLieu());
		System.out.println("Le nom de l'outil 2 est : "+ outil2.getNom() +", sa description est : "+ outil2.getDescription() 
		+", une de ses utilisations possible est : "+ outil2.getUtilisation() +" et son lieu de stockage est : "+ outil2.getLieu());
		input.close();
	}
}
