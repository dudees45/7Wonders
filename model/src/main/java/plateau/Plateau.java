package plateau;

import plateau.exceptions.*;
import player.Player;
import java.util.ArrayList;
import java.util.Collection;

public class Plateau {
    /**
     * Tous les joueurs concernés par ce plateau
     */
    Collection<Player> joueurs;
    /**
     * Constructeur du plateau avec la liste des joueurs
     */
    public Plateau() {
        this.joueurs = new ArrayList<Player>();
    }
    /**
     * Permet d'ajouter un joueur dans le plateau
     * @param joueur
     */
    public void ajouterJoueur(Player joueur) throws JoueurDejaAjoute, maximumJoueursAtteint{
        if (this.getNbJoueursActuels()<4){
            for(Player p : this.joueurs){
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
        for(Player joueur : this.joueurs) {
            nb++;
        }
        return nb;
    }
}
