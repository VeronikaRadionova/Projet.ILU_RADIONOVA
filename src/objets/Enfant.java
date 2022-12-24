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
	
	public String[] getPreferences() {
		return preferences;
	}
	
	public void setPreferences(String[] preferences) {
		this.preferences = preferences;
	}

	public int getNbPreferences() {
		return nbPreferences;
	}

	public void setNbPreferences(int nbPreferences) {
		this.nbPreferences = nbPreferences;
	}

	public void parler(String texte) {
	    System.out.println(nom + " : " + texte);
	}
	
	public void sePresenter() {
		parler("Je m'appelle " + nom + " et j'ai " + nbPointsGagne + " points. Je veux en avoir plus !");
	}
	
	public void ajouterPreferences(String texte) {
		String[] thpreferes = new String[nbPreferences];
		int i = 0;
		while (i < nbPreferences) {
			if (thpreferes[i] != texte) {
				i = i + 1;
			}
		}	
		thpreferes[nbPreferences-1] = texte;
		setPreferences(thpreferes);
		setNbPreferences(nbPreferences + 1);
		
		//System.out.println(getNbPreferences());
	}
	
	public int choisirActivite(Activite activite) {
		for (int i = 0; i < nbPreferences-1; i++) {
			if (preferences[i] == activite.getThematique() ) {
				parler("Oui, pourquoi pas !!!");
				return i;
			}
		}
		parler("Non, je ne veux pas le faire :(");
		return 0;
	}
}