package objets;

public class Jeu extends Activite {
	
	private Endroit aVisiter[];
	private int nbEndroits = 1;
	
	public Jeu(Thematiques thematique, String status, int nbEndroits) {
		super(thematique, status);
		this.aVisiter = new Endroit[nbEndroits];
	}
	
	public int getNbEndroits() {
		return nbEndroits;
	}

	public void setNbEndroits(int nbEndroits) {
		this.nbEndroits = nbEndroits;
	}

	public Endroit[] getaVisiter() {
		return aVisiter;
	}

	public void setaVisiter(Endroit[] aVisiter) {
		this.aVisiter = aVisiter;
	}


	public void proposerJeu(Enfant enfant) {
		parler(enfant.getNom() + ", veux-tu jouer à un jeu sur " + thematique + " ?");
	}
	
	public void ajouterEndroits(Endroit endroit) {
		Endroit[] endroitsAVisiter = new Endroit[nbEndroits];
		int i = 0;
		while (i < nbEndroits) {
			if (endroitsAVisiter[i] != endroit) {
				i = i + 1;
			}
		}	
		endroitsAVisiter[nbEndroits-1] = endroit;
		setaVisiter(endroitsAVisiter);
		setNbEndroits(nbEndroits + 1);
		
		
		//System.out.println(getNbEndroits());
	}
}