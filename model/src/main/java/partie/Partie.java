package partie;

import cartes.Carte;
import joueur.Joueur;
import merveilles.Merveille;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Partie {


    private ArrayList<Joueur> listeDesJoueurs;
    private final int NB_JOUEURS = 4;
    private final int NB_CARTES = 148;
    private final int NB_MERVEILLES = 7;

    private Carte[] carte;
    private Merveille [] merveilles;

    // Differentes listes pour différencier les cartes
    private ArrayList<Carte> cartesAgeI;
    private ArrayList<Carte> cartesAgeII;
    private ArrayList<Carte> cartesAgeIII;
    private ArrayList<Merveille> Merveilles;
    private ArrayList<Carte> carteDefausse;



    public void constructionDesListes(){
        Merveilles = new ArrayList<>(Merveilles);
        Merveilles.addAll(Arrays.asList(merveilles).subList(0, NB_MERVEILLES));

        Collections.shuffle(Merveilles);

        ArrayList<Carte> toutesLesCartes = new ArrayList<Carte>();
        for (int i =0; i< NB_CARTES; i++)
        {
            if (carte[i].getConfigurationNumber() <= )     // a faire quand le Model sera bon
        }


    }
    public void miseEnPlacePartie() {
    }


}
