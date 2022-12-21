package objets;

public class Jeu extends Activite{
	
	private Endroit aVisiter[];
	private int nbEndroit = 0;
	
	public Jeu(String thematique, String status, int nbEndroit) {
		super(thematique, status);
		this.aVisiter = new Endroit[nbEndroit];
	}
}