package Brief_Exo;

public class Ligne_compte {
	//Attributs
	private String intitule;
	private double montant;
	
	//Constructeur
	
	public Ligne_compte(final String intitule, final double montant) {
		this.intitule = intitule;
		this.montant = montant;
	}
	
	//Méthodes
	public void indiq_argent() {
		if(this.montant >= 0) {
			System.out.println("La ligne "+ this.intitule +" est une ligne de recette");
		}else {
			System.out.println("La ligne "+ this.intitule +" est une ligne de dépense");
		}
	}
	
	//Getters et Setters

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}
