package Brief_Exo;

import java.util.Scanner;

public class Exo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez une phrase");
		String phrase = input.nextLine();
		for (int i = 0; i < phrase.length();i++) {
			//Majuscule à la première lettre
			if(i == 0) {
				phrase = phrase.substring(0,1).toUpperCase() + phrase.substring(1).toLowerCase();
			}else if(phrase.charAt(i) == ' ') {
				//Majuscule à chaque premier mot
				phrase = phrase.substring(0,i+1)+ phrase.substring(i+1,i+2).toUpperCase() + phrase.substring(i+2).toLowerCase();
			}
		}
		System.out.println(phrase);
		input.close();
	}

}
