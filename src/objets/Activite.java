package objets;

public class Activite {
	private String status; // si l'activité est finie, en cours ou pas commencée
	protected Thematiques thematique; // mot avec l'article définie
	private int nbPoints;
	
	//private String dateDebut;  jour et mois (à ne pas utiliser pour l'instant)
	//private String dateFin;  jour et mois
	
	public Activite(Thematiques thematique, String status, int nbPoints) {
		this.thematique = thematique;
		this.status = status;
		this.nbPoints = nbPoints;
	}
	
	public Thematiques getThematique() {
		return thematique;
	}

	public String getStatus() {
		return status;
	}
	
	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

	public void parler(String texte) {
	    System.out.println(texte);
	} 
	
	public void saluerEnfant(Enfant enfant) {
		parler("Salut, " + enfant.getNom() + " ! Bonne chance et passe bien ta journée :) ");
	}
	
	
}
