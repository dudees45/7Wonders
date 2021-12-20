package interfaces.facade;

import java.rmi.RemoteException;
import java.util.Map;


public interface FacadeSevenWondersOnLine {

    String creePartie(String joueur) throws RemoteException;
    void rejoindreUnePartie(String nom) throws RemoteException;
    void miseEnPlaceDuJeu() throws RemoteException;
    void constructionDesListes();
    void joueursPret();
    void finAge();

    void choixCarteAJouee(String joueur, String choix) throws RemoteException;
    void jouerCarteCommerce(int positionJoueur, String choix) ;
    void defausserCarte (int postionCarte, String choix);
    void debloquerUneEtapeMerveille(int positionJoueur, String choix);
    void passerAgeSuivant();
    void passerTourSuivant();
    Map<String,Integer> listesDesRessourcesDesVoisinsDeChaqueJoueur(int positionJoueur);
    void batailleMilitaire();
    void nombreDePointsMilitaireAGagnerSelonAge();
    void partieTerminee() throws RemoteException;
    String getVainqueur(String joueur);
    void finDePartie();

}
