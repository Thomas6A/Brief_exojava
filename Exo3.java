package Brief_Exo;

import java.util.Scanner;

public class Exo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez une phrase");
		StringBuilder phrase = new StringBuilder();
		phrase.append(input.nextLine());
		String newphrase = phrase.toString().replace("e", "3").replace("o", "0");
		System.out.println(newphrase);
		input.close();
	}

}
