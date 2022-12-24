package situations;

import objets.Enfant;
import objets.Activite;
import objets.Evenement;
import objets.Jeu;
import objets.Endroit;

public class VerificationFonctions {

	public static void main(String[] args) {
		Enfant tom = new Enfant("Tom", 0, 0, 1);
		Jeu jeu1 = new Jeu("musique","pas fait",2);
		tom.ajouterPreferences("espace");
		System.out.println(tom.getPreferences()[0]);
		tom.ajouterPreferences("musique");
		System.out.println(tom.getPreferences()[1]);
		tom.choisirActivite(jeu1);
		
		Endroit musee = new Endroit("Musee", 7, 0);
		Endroit expo = new Endroit("Expo", 4, 0);
		jeu1.ajouterEndroits(musee);
		System.out.println(jeu1.getaVisiter()[0].getNom());
		jeu1.ajouterEndroits(expo);
		//System.out.println(jeu1.getaVisiter()[0].getNom()); à resoudre
	}
}
