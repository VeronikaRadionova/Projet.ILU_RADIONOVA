package objets;

public class Endroit {
	private String nom;
	private int nbVisitesLieu = 0;
	
	// private String adresse; à ne pas utiliser pour l'instant
	
	public Endroit(String nom, int nbVisitesLieu) {
		this.nom = nom;
		this.nbVisitesLieu = nbVisitesLieu;
	}

	public String getNom() {
		return nom;
	}

	public int getNbVisitesLieu() {
		return nbVisitesLieu;
	}
	

}
