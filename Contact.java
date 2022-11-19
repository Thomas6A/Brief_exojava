package Brief_Exo;

public class Contact {
	//Attributs
	private String nom,prenom;
	private int age;
	
	//Constructeur
	public Contact(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	//Méthodes
	
	public void affich_init() {
		System.out.println("Ses initiales sont : "+ this.prenom.charAt(0) + this.nom.charAt(0));
	}
	public void affich_trig() {
		System.out.println("Son trigramme est : "+ this.prenom.charAt(0) + this.nom.charAt(0) + this.nom.charAt(this.nom.length()-1));
	}
	public void affich_info() {
		System.out.println("Son nom est : "+ this.nom +", son prénom est : "+ this.prenom +", son âge est : "+ this.age);
	}

}
