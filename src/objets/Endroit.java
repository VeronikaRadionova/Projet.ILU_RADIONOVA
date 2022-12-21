package objets;

public class Endroit {
	private String nom;
	private int nbPoints;
	private int nbVisitesLieu;
	private String status; //si l'endroit est visité ou pas (pour les jeux)
	
	private String adresse; // pas encore 
	
	public Endroit(String nom, int nbPoints, int nbVisitesLieu, String status) {
		this.nom = nom;
		this.nbPoints = nbPoints;
		this.nbVisitesLieu = nbVisitesLieu;
		this.status = status;
	}
}
