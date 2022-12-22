package objets;

public class Endroit {
	private String nom;
	private int nbPoints;
	private int nbVisitesLieu;
	private String status; //si l'endroit est visité ou pas (pour les ljeux)
	
	private String adresse; // à ne pas utiliser pour l'instant
	
	public Endroit(String nom, int nbPoints, int nbVisitesLieu, String status) {
		this.nom = nom;
		this.nbPoints = nbPoints;
		this.nbVisitesLieu = nbVisitesLieu;
		this.status = status;
		
		
	}

	public String getNom() {
		return nom;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public String getStatus() {
		return status;
	}
	
	
}
