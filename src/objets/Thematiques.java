package objets;

public enum Thematiques {
	MUSIQUE("la musique"), SCIENCES("les sciences"), MEDECINE("la medecine"), 
	NATURE("la nature"), ESPACE("l'espace"), HISTOIRE("l'histoire");
	
	private String nom;
	
	private Thematiques(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
