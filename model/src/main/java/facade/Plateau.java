package facade;

import joueur.Joueur;
import facade.exceptions.JoueurDejaAjoute;
import facade.exceptions.maximumJoueursAtteint;

import java.util.ArrayList;
import java.util.Collection;

public class Plateau {

    private final int NB_JOUEURS_MAX = 4;
    private final int NB_CARTES = 148;
    private final int NB_MERVEILLES = 7;

    /**
     * Tous les joueurs concernés par ce plateau
     */
    Collection<Joueur> joueurs;
    
    /**
     * Constructeur du plateau avec la liste des joueurs
     */
    public Plateau() {
        this.joueurs = new ArrayList<Joueur>();
    }

    /**
     * Permet d'ajouter un joueur dans le plateau
     * @param j
     */
    public void ajouterJoueur(Joueur j) throws JoueurDejaAjoute, maximumJoueursAtteint{
        if (this.getNbJoueursActuels()<this.NB_JOUEURS_MAX){
            for(Joueur joueur : this.joueurs){
                if (joueur == j){
                    throw new JoueurDejaAjoute();
                } else {
                    this.joueurs.add(j);
                }
            }
        } else {
            throw new maximumJoueursAtteint();
        }
    }

    /**
     * Retourne le nombre de joueurs dans un plateau
     * @return nb
     */
    public int getNbJoueursActuels() {
        int nb = 0;
        for(Joueur joueur : this.joueurs) {
            nb++;
        }
        return nb;
    }
}
