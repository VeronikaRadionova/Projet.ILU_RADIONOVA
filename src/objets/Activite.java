package objets;

public class Activite {
	private String thematique;
	private String status; // si l'activité est finie, en cours ou pas commencée
	
	private String dateDebut; // jour et mois (à ne pas utiliser pour l'instant)
	private String dateFin; // jour et mois
	
	public Activite(String thematique, String status) {
		this.thematique = thematique;
		this.status = status;
	}
}
