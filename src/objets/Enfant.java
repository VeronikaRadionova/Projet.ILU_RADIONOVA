package objets;

public class Enfant {
	private String nom;
	private int nbPointsGagne = 0;
	private Endroit visites[];
	private int nbVisites = 0;
	
	private String preferences[]; // thematiques préférées de l'enfant (mots avec des articles définies)
	private int nbPreferences = 1;
	
	public Enfant(String nom, int nbPointsGagne, int nbVisites, int nbPreferences) {
		this.nom = nom;
		this.nbPointsGagne = nbPointsGagne;
		this.visites = new Endroit[nbVisites];
		this.preferences = new String[nbPreferences];
	}

	public String getNom() {
		return nom;
	}

	public int getNbPointsGagne() {
		return nbPointsGagne;
	}
	
	public void parler(String texte) {
	    System.out.println(nom + " : " + texte);
	}
	
	public void sePresenter() {
		parler("Je m'appelle " + nom + " et j'ai " + nbPointsGagne + " points. Je veux en avoir plus !");
	}
	
	public String[] ajouterPreferences(String texte) {
		String[] preferences = new String[nbPreferences];
		int i = 0;
		while (i < nbPreferences) {
			if (preferences[i] != texte) {
				i = i + 1;
			} else {
				return preferences;
			}
		}
		nbPreferences = nbPreferences + 1;
		preferences[nbPreferences] = texte;
		return preferences;
	}
	
	public void choisirActivite(Activite activite) {
		
	}
}