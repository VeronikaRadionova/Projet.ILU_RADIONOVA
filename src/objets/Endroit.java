package objets;

public class Endroit {
	private String nom;
	private int nbPoints;
	private int nbVisitesLieu = 0;
	
	// private String adresse; à ne pas utiliser pour l'instant
	
	public Endroit(String nom, int nbPoints, int nbVisitesLieu) {
		this.nom = nom;
		this.nbPoints = nbPoints;
		this.nbVisitesLieu = nbVisitesLieu;
		
		
	}

	public String getNom() {
		return nom;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public int getNbVisitesLieu() {
		return nbVisitesLieu;
	}
	

}
