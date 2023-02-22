package objets;

public class Enfant {
	private String nom;
	private int nbPointsGagnes = 0;
	private Endroit visites[];
	private int nbVisites = 0;
	
	private Thematiques preferences[]; // thematiques préférées de l'enfant (mots avec des articles définies)
	private int nbPreferences = 1;
	
	public Enfant(String nom, int nbPointsGagne, int nbVisites, int nbPreferences) {
		this.nom = nom;
		this.nbPointsGagnes = nbPointsGagne;
		this.visites = new Endroit[nbVisites];
		this.preferences = new Thematiques[nbPreferences];
	}

	public String getNom() {
		return nom;
	}

	public int getNbPointsGagnes() {
		return nbPointsGagnes;
	}
	
	public Thematiques[] getPreferences() {
		return preferences;
	}

	public void setPreferences(Thematiques[] preferences) {
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
		parler("Je m'appelle " + nom + " et j'ai " + nbPointsGagnes + " points. Je veux en avoir plus !");
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
		//setPreferences(thpreferes);
		setNbPreferences(nbPreferences + 1);
		
		//System.out.println(getNbPreferences());
	}
	
	
	public void ajouterThematiques(Thematiques thematique) {
		Thematiques[] thpreferes = new Thematiques[nbPreferences];
		int i = 0;
		while (i < nbPreferences) {
			if (thpreferes[i] != thematique) {
				i = i + 1;
			}
		}	
		thpreferes[nbPreferences-1] = thematique;
		setNbPreferences(nbPreferences + 1);
		
		System.out.println(nbPreferences);
	}
	
	
	public int choisirActivite(Activite activite) {
		for (int i = 0; i < nbPreferences; i++) {
			if (preferences[i] == activite.getThematique()) {
				parler("Oui, pourquoi pas !!!");
				return i;
			}
		}
		parler("Non, je ne veux pas le faire :(");
		return 0;
	}
	
	public int gagnerPoints(Activite activite) {
		return getNbPointsGagnes() + activite.getNbPoints();
	}
}