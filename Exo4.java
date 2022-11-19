package Brief_Exo;

import java.util.Scanner;

public class Exo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez le nom");
		StringBuilder nom = new StringBuilder();
		nom.append(input.nextLine());
		System.out.println("Entrez le prénom");
		StringBuilder prenom = new StringBuilder();
		prenom.append(input.nextLine());
		System.out.println("Entrez l'âge");
		int age = input.nextInt();
		Contact contact1 = new Contact(nom.toString(),prenom.toString(),age);
		contact1.affich_init();
		contact1.affich_trig();
		contact1.affich_info();
		input.close();
	}

}
