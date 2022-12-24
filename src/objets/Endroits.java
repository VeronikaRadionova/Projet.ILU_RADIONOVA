package objets;

public enum Endroits {
	CITE_ESPACE(""), MACHINE(""), QUAI_SAVOIRS(""), 
	ENVOLE_PIONNIERS(""), HISTOIRE_NATURELLE(""), MUSEE_MEDECINE("");
	
	private String nom;
	
	private Endroits(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
