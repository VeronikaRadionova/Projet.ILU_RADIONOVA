package objets;

public class Activite {
	private String status; // si l'activité est finie, en cours ou pas commencée
	protected String thematique; // mot avec l'article définie
	
	private String dateDebut; // jour et mois (à ne pas utiliser pour l'instant)
	private String dateFin; // jour et mois
	
	public Activite(String thematique, String status) {
		this.thematique = thematique;
		this.status = status;
	}

	public String getThematique() {
		return thematique;
	}

	public String getStatus() {
		return status;
	}
	
	public void parler(String texte) {
	    System.out.println(texte);
	} 
	
	public void saluerEnfant(Enfant enfant) {
		parler("Salut, " + enfant.getNom() + " ! Bonne chance et passe bien ta journée :) ");
	}
}
