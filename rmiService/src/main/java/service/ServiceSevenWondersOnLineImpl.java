package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;

import interfaces.facade.FacadeSevenWondersOnLine;
public class ServiceSevenWondersOnLineImpl extends UnicastRemoteObject implements ServiceSevenWondersOnLine {
    FacadeSevenWondersOnLine facadeSevenWondersOnLine;


    protected ServiceSevenWondersOnLineImpl() throws RemoteException {
        super();
        this.facadeSevenWondersOnLine = new FacadeSevenWondersOnLineImpl(); // a faire dans le Modele
    }

    public static ServiceSevenWondersOnLine creer() throws RemoteException {
        return new ServiceSevenWondersOnLineImpl();
    }

    @Override
    public String creePartie(String joueur) throws RemoteException {
        return this.facadeSevenWondersOnLine.creePartie(joueur);

    }


    @Override
    public void rejoindreUnePartie(String joueur) throws RemoteException {
        this.facadeSevenWondersOnLine.rejoindreUnePartie(joueur);

    }

    @Override
    public void miseEnPlaceDuJeu() throws RemoteException {
        this.facadeSevenWondersOnLine.miseEnPlaceDuJeu();
    }

    @Override
    public void constructionDesListes() {
        this.facadeSevenWondersOnLine.constructionDesListes();

    }

    @Override
    public void joueursPret() {
        this.facadeSevenWondersOnLine.joueursPret();

    }

    @Override
    public void finAge() {
        this.facadeSevenWondersOnLine.finAge();

    }


    @Override
    public void choixCarteAJouee(String joueur,String choix) throws RemoteException {
        this.facadeSevenWondersOnLine.choixCarteAJouee(joueur,choix);

    }

    @Override
    public void jouerCarteCommerce(int positionJoueur, String choix) {
        this.facadeSevenWondersOnLine.jouerCarteCommerce(positionJoueur,choix);

    }

    @Override
    public void defausserCarte(int postionCarte, String choix) {
        this.facadeSevenWondersOnLine.defausserCarte(postionCarte,choix);

    }

    @Override
    public void debloquerUneEtapeMerveille(int positionJoueur, String choix) {
        this.facadeSevenWondersOnLine.debloquerUneEtapeMerveille(positionJoueur,choix);

    }

    @Override
    public void passerAgeSuivant() {
        this.facadeSevenWondersOnLine.passerAgeSuivant();

    }

    @Override
    public void passerTourSuivant() {
        this.facadeSevenWondersOnLine.passerTourSuivant();

    }

    @Override
    public Map<String, Integer> listesDesRessourcesDesVoisinsDeChaqueJoueur(int positionJoueur) {
        return null;
    }

    @Override
    public void batailleMilitaire() {
        this.facadeSevenWondersOnLine.batailleMilitaire();

    }

    @Override
    public void nombreDePointsMilitaireAGagnerSelonAge() {
        this.facadeSevenWondersOnLine.nombreDePointsMilitaireAGagnerSelonAge();
    }

    @Override
    public void partieTerminee() throws RemoteException {
        this.facadeSevenWondersOnLine.partieTerminee();

    }

    @Override
    public String getVainqueur(String joueur) {
        return null;
    }



    @Override
    public void finDePartie() {
        this.facadeSevenWondersOnLine.finDePartie();

    }
}
