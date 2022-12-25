package objets;

public class Evenement extends Activite {
	
	private String nom;
	private int nbPointsEvent;
	private Endroit endroit;
	
	// private String horraires; ? nujno li mne eto (à ne pas utiliser pour l'instant)
	
	public Evenement(String nom, Thematiques thematique, String status, int nbPointsEvent, Endroit endroit) {
		super(thematique, status);
		this.nom = nom;
		this.nbPointsEvent = nbPointsEvent;
		this.endroit = endroit;
	}

	public String getNom() {
		return nom;
	}

	public int getNbPointsEvent() {
		return nbPointsEvent;
	}

	public Endroit getEndroit() {
		return endroit;
	}
	
	public void proposerEvenement(Enfant enfant) {
		parler(enfant.getNom() + ", veux-tu visiter un événement sur " + thematique + " ?");
	}
}
