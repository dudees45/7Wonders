package plateau;

import plateau.exceptions.*;
import joueur.Joueur;
import java.util.ArrayList;
import java.util.Collection;

public class Plateau {
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
     * @param joueur
     */
    public void ajouterJoueur(Joueur joueur) throws JoueurDejaAjoute, maximumJoueursAtteint{
        if (this.getNbJoueursActuels()<4){
            for(Joueur p : this.joueurs){
                if (p == joueur){
                    throw new JoueurDejaAjoute();
                } else {
                    this.joueurs.add(joueur);
                }
            }
        } else {
            throw new maximumJoueursAtteint();
        }
    }
    public int getNbJoueursActuels() {
        int nb = 0;
        for(Joueur joueur : this.joueurs) {
            nb++;
        }
        return nb;
    }
}
