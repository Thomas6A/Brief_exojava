package Brief_Exo;

import java.util.Scanner;

public class Exo1 {
	public static void main(String[] args) {
		//Variables
		int nba = 0;
		int nbe = 0;
		int nbo = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez une phrase");
		StringBuilder phrase = new StringBuilder();
		phrase.append(input.nextLine());
		//Boucle de vérification
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == 'a') {
				nba++;
			}else if(phrase.charAt(i) == 'e'){
				nbe++;
			}else if(phrase.charAt(i) == 'o') {
				nbo++;
			}
		}
		//Affichage des résultats
		System.out.println("Le nombre de a de cette phrase est de : "+ nba +", le nombre de e de cette phrase est de "+ nbe 
				+" et le nombre de o de cette phrase est de "+ nbo);
		input.close();
	}

}
