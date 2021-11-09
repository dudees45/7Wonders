package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceSevenWondersOnLine extends Remote {

    void creePartie(String nomPartie) throws RemoteException ;
    void rejoindreUnePartie(String nom) throws RemoteException;
    void initPartie() throws RemoteException;
    void choixJoueur() throws RemoteException;
    void partieTerminee() throws RemoteException;
    String getVainqueur(String joueur);
    boolean partieCommencee();
    void finDePartie();








}
