package Brief_Exo;

public class Outil {
	//Attributs
	private String nom,description,utilisation,lieu;
	
	//Constructeurs
	public Outil(String nom, String description, String utilisation, String lieu) {
		this.nom = nom;
		this.description = description;
		this.utilisation = utilisation;
		this.lieu = lieu;
	}
	
	public Outil(Outil o) {
		nom = o.nom;
		description = o.description;
		utilisation = o.utilisation;
		lieu = o.lieu;
	}
	
	//Getters et Setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUtilisation() {
		return utilisation;
	}

	public void setUtilisation(String utilisation) {
		this.utilisation = utilisation;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

}
