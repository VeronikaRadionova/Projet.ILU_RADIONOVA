package objets;

public class Enfant {
	private String nom;
	private int nbPointsGagne = 0;
	private Endroit visites[];
	private int nbVisites = 0;
	
	public Enfant(String nom, int nbPointsGagne, int nbVisites) {
		this.nom = nom;
		this.nbPointsGagne = nbPointsGagne;
		this.visites = new Endroit[nbVisites];
	}
}