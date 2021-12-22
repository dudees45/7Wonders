package partie;

import cartes.Carte;
import cartes.GestionsEffetCarte;
import joueur.Joueur;
import merveilles.GestionsEffetsEtape;
import merveilles.Merveille;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Partie {


    private ArrayList<Joueur> listeDesJoueurs;
    private final int NB_JOUEURS = 4;
    private final int NB_CARTES = 88;
    private final int NB_MERVEILLES = 7;

    private List<Carte> cartes;
    private List<Merveille> merveilles;

    // Differentes listes pour différencier les cartes
    private ArrayList<Carte> cartesAgeI;
    private ArrayList<Carte> cartesAgeII;
    private ArrayList<Carte> cartesAgeIII;
    private ArrayList<Carte> carteDefausse;
    private GestionsEffetCarte gestionsEffetCarte;
    private GestionsEffetsEtape gestionsEffetsEtape;

    public Partie(ArrayList<Joueur> listeDesJoueurs, List<Carte> cartes, List<Merveille> merveilles) {
        this.listeDesJoueurs = listeDesJoueurs;
        this.cartes = cartes;
        this.merveilles = merveilles;
        this.cartesAgeI = null;
        this.cartesAgeII = null;
        this.cartesAgeIII = null;
        this.carteDefausse = null;
        this.gestionsEffetsEtape = null;
        this.gestionsEffetCarte = null;
    }

    public void constructionDesListes(){

        Collections.shuffle(this.merveilles);

        this.cartes.forEach(c -> {
            if (c.getAge() == 1){
                this.cartesAgeI.add(c);
            }else if (c.getAge() == 2){
                this.cartesAgeII.add(c);
            }else{
                this.cartesAgeIII.add(c);
            }});

        Collections.shuffle(this.cartesAgeI);
        Collections.shuffle(this.cartesAgeII);
        Collections.shuffle(this.cartesAgeIII);

    }

    public void miseEnPlacePartie() {
        this.constructionDesListes();
        this.listeDesJoueurs.forEach( j -> {
            this.cartesAgeI.forEach(c -> {
                j.getDeck().ajoutCarteDansDeck(c);
                this.cartesAgeI.remove(c);
            });

            this.merveilles.forEach(m -> {
                j.setMerveille(m);
                this.merveilles.remove(m);
            });

        });

    }

    public void jouerCarte(Joueur joueur, Carte carte){
        GestionsEffetCarte gestionsEffetCarte = new GestionsEffetCarte();
        //TODO gestionsEffetCarte.appliquerEffetCarte();
        AtomicBoolean carteGratuite = new AtomicBoolean(false);
        joueur.getCartesJouees().forEach(cj -> {
            if(carte.getChainage().containsValue(cj.getNom())){
                carteGratuite.set(true);
            }
        });
        //TODO fonction qui va verifier si le cout est en gold ou ressources
        if(!carteGratuite.get()){
          if(coutCarteEnGold()){
              joueur.enleverPieces(1);
          }else{
              //TODO fonction qui va verifier si on a assez de ressources pour repondre au cout de la carte
          }
        }
    }

    //TO DO : finir cette méthode (il faut appliquer les effets de l'étape au joueur fourni en paramètre)
    public void construireEtape(Joueur p) {
        this.gestionsEffetsEtape.appliquerEffetMerveille(p);
        p.getMerveille().setEtape(p.getMerveille().getEtape()+1);  //on incrémente le num de l'étape de la merveille
    }



    public ArrayList<Joueur> getListeDesJoueurs() {
        return listeDesJoueurs;
    }

    public void setListeDesJoueurs(ArrayList<Joueur> listeDesJoueurs) {
        this.listeDesJoueurs = listeDesJoueurs;
    }

    public int getNB_JOUEURS() {
        return NB_JOUEURS;
    }

    public int getNB_CARTES() {
        return NB_CARTES;
    }

    public int getNB_MERVEILLES() {
        return NB_MERVEILLES;
    }


    public ArrayList<Carte> getCarteDefausse() {
        return carteDefausse;
    }

    public void setCarteDefausse(ArrayList<Carte> carteDefausse) {
        this.carteDefausse = carteDefausse;
    }


    public ArrayList<Carte> getCartesAgeI() {
        return cartesAgeI;
    }

    public void setCartesAgeI(ArrayList<Carte> cartesAgeI) {
        this.cartesAgeI = cartesAgeI;
    }

    public ArrayList<Carte> getCartesAgeII() {
        return cartesAgeII;
    }

    public void setCartesAgeII(ArrayList<Carte> cartesAgeII) {
        this.cartesAgeII = cartesAgeII;
    }

    public ArrayList<Carte> getCartesAgeIII() {
        return cartesAgeIII;
    }

    public void setCartesAgeIII(ArrayList<Carte> cartesAgeIII) {
        this.cartesAgeIII = cartesAgeIII;
    }

    public List<Carte> getCartes() {
        return cartes;
    }

    public void setCartes(ArrayList<Carte> cartes) {
        this.cartes = cartes;
    }

    public List<Merveille> getMerveilles() {
        return merveilles;
    }
}
