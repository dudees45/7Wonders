package joueur;

import merveilles.*;
import cartes.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Joueur {

    private String nom;
    private ArrayList<Carte> cartesJouees; //les cartes jouées par le joueur
    private HashMap<String,Integer> ressources; //ressources du joueur, ce qui comprend les matieres premieres et les produits manufactures
    private Merveille merveille; //merveille du joueur

    private int pieces;   //argent du joueur

    //booleens d'état
    private boolean etatJeu; //définit si le joueur est prêt ou non
    private boolean commerceMatieresPremieres, commerceProduitsManufactures; //definit si le joueur est en état de commercer et ce pour les deux types principaux de ressources

    private int ptsVictoire; //nb de points de Victoire simples (symboles aux lauriers)

    //Nombres de symboles scientifiques
    private int nbTablettes;
    private int nbRouages;
    private int nbCompas;

    //Attributs liés à la guerre
    private int puissanceMilitaire; //Nombre de symboles rouges
    private int ptsVictoireMilitaire; //pts de victoire dus à la guerre (total mis à jour avec des valeurs dépendantes de l'âge de chaque guerre)
    private int nbJetonsDefaite; //nb de points de défaite (une défaite vaut -1 quelque soit l'âge)


    //constructeur
    public Joueur(String nom){  //Constructeur, au début, seul le nom différencie les joueurs
        this.nom = nom;
        pieces = 3; //On débute avec 3 pièces
        cartesJouees = new ArrayList<Carte>();
        etatJeu = false;
        commerceMatieresPremieres = false;
        commerceProduitsManufactures = false;
        ressources = new HashMap<String, Integer>(); // on initialise les ressources du joueur, à 0 de toute façon comme le choix des merveilles n'a pas été fait
        ressources.put("Pierres",0);
        ressources.put("Verres",0); //Le verre est un produit manufacture
        ressources.put("Papiers",0); //Le papier est un produit manufacture
        ressources.put("Bois",0);
        ressources.put("Tissus",0); //le tissu est un produit manufacture
        ressources.put("Briques",0);
        ressources.put("Minerais",0);
        ptsVictoire = 0;
        ptsVictoireMilitaire = 0;
        puissanceMilitaire = 0;
        nbJetonsDefaite = 0;
        nbCompas = 0;
        nbRouages = 0;
        nbTablettes = 0;
        merveille = null;  // le joueur n'aura pas encore choisi de merveille à sa création
    }

    //Fonctions triées par attribu ciblé

    //nom

    //retourne le nom du joueur
    public String getNom() {
        return nom;
    }

    //définit le nom du joueur
    public void setNom(String nouveauNom) {
        nom = nouveauNom;
    }


    //Cartes jouees

    //retourne toutes les cartes jouées par le joueur
    public ArrayList<Carte> getCartesJouees() {
        return cartesJouees;
    }

    //ajoute une carte à la liste des cartes jouées par le joueur
    public void addCartesJouees(Carte laCarte) {
        cartesJouees.add(laCarte);
    }

    //Vérifie si le joueur a posé une carte en particulier et fournie en paramètre
    public boolean aCarte(Carte carte){
        return cartesJouees.contains(carte);
    }


    //Ressources

    //retourne un dictionnaire listant toutes les ressources du joueur sous forme <nom, quantité>
    public HashMap<String, Integer> getRessources() {
        return ressources;
    }

    //définit les ressources du joueur. Généré par Generate mais semble inutile à priori
    public void setRessources(HashMap<String, Integer> lesRessources) {
        ressources = lesRessources;
    }

    //Donne au joueur n ressources dont le nom est fourni
    public void augmenterRessource(String nom, int n) {
        ressources.put(nom, ressources.get(nom) + n);
    }

    //permet d'augmenter les ressources du joueur selon un dictionnaire de plusieurs augmentations <nom de la ressource, quantité>
    public void augmenterPlusieursRessources(HashMap<String, Integer> listeAugmentations) {
        for (HashMap.Entry<String,Integer> e : listeAugmentations.entrySet()) {
            ressources.put(e.getKey(), ressources.get(e.getKey()) + e.getValue());
            // IMPORTANT : à tester car exception relevée de mon côté hors de ce git : la retrouver avec sa cause puis gérer avec un try/catch
            //Sinon : trouver une autre façon de procéder à l'itération de chaque valeur
        }
    }

    //retourne si oui ou non le joueur a "qte" fois ou plus la ressource "nom"
    public boolean aAssezRessource(String nom, int qte){
        if(ressources.get(nom) >= qte ) {
            return true;
        }else {
            return false;
        }
    }

    //retourne la quantité que le joueur possède de telle ressource dont le nom est fourni en paramètre
    public int getNbRessources(String nom) {
        return ressources.get(nom);
    }


    //Merveille

    //retourne la Merveille du Joueur
    public Merveille getMerveille() {
        return merveille;
    }

    //Assigne une merveille à un joueur et lui confère les éventuels bonus initiaux associés à celle-ci
    public void setMerveille(Merveille laMerveille) {
        merveille = laMerveille;
        // TO DO : rajouter au passage les bénéfices initiaux de la merveille au joueur ! (ressources, pièces... ?)
    }


    //Pièces

    //retourne la fortune du joueur
    public int getPieces() {
        return pieces;
    }

    //ajoute n pieces au joueur
    public void addPieces(int n) {
        pieces += n;
    }

    //enleve n pièces au joueur
    public void enleverPieces(int n){
        pieces -= n;
        if(pieces<0)
            pieces=0;  //Au cas où, bien que ça ne paraisse pas possible, le retrait dépasse la barre du positif ou nul du solde
    }


    //Les états

    //verifie si le joueur est prêt pour la suite
    public boolean isEtatJeu() {
        return etatJeu;
    }

    //definit si le joueur est prêt pour la suite
    public void setEtatJeu(boolean nouvelEtat) {
        etatJeu = nouvelEtat;
    }

    //retourne l'état du joueur quant au commerce de de produits manufactures
    public boolean isCommerceMatieresPremieres() {
        return commerceMatieresPremieres;
    }

    //definit l'état du joueur quant au commerce de matières premières
    public void setCommerceMatieresPremieres(boolean nouvelEtat) {
        commerceMatieresPremieres = nouvelEtat;
    }

    //retourne l'état du joueur quant au commerce de de produits manufactures
    public boolean isCommerceProduitsManufactures() {
        return commerceProduitsManufactures;
    }

    //definit l'état du joueur quant au commerce de Produits Manufactures
    public void setCommerceProduitsManufactures(boolean nouvelEtat) {
        commerceProduitsManufactures = nouvelEtat;
    }


    // Les pts de Victoire

    //retourne le total de pts de victoire du joueur
    public int getPtsVictoire() {
        return ptsVictoire;
    }

    //définit un nv nb de points de victoire. généré par le Generate mais est-ce utile ? (sinon, à suppr de préférence et à la fin du projet)
    public void setPtsVictoire(int qte) {
        ptsVictoire = qte;
    }

    //Ajoute n pts de victoire au joueur
    public void addPtsVictoire(int n){
        ptsVictoire = ptsVictoire+n;
    }


    //La science

    //retourne le nb de Tablettes Scientifiques du joueur
    public int getNbTablettes() {
        return nbTablettes;
    }

    //retourne le nb de Rouages Scientifiques du joueur
    public int getNbRouages() {
        return nbRouages;
    }

    //retourne le nb de Compas Scientifiques du joueur
    public int getNbCompas() {
        return nbCompas;
    }

    //Ajoute n tablettes scientifiques au joueur
    public void addTablettes(int n){
        nbTablettes = nbTablettes+n;
    }

    //Ajoute n rouages scientifiques au joueur
    public void addRouages(int n){
        nbRouages = nbRouages+n;
    }

    //Ajoute n compas scientifiques au joueur
    public void addCompas(int n){
        nbCompas = nbCompas+n;
    }


    //Les fonctions militaires

    //retourne le nb de symboles rouges (puissance militaire) du joueur
    public int getPuissanceMilitaire() {
        return puissanceMilitaire;
    }

    //ajoute n symboles rouges (puissance Militaire) au joueur
    public void addPuissanceMilitaire(int n) {
        puissanceMilitaire = puissanceMilitaire+n;
    }

    //retourne le total de pts de victoire militaire
    public int getPtsVictoireMilitaire() {
        return ptsVictoireMilitaire;
    }

    //definit le nb de points de victoire militaire. Généré par Generate mais est-ce vraiment utile ?
    public void setPtsVictoireMilitaire(int nouveauxPtsVictoireMilitaire) {
        ptsVictoireMilitaire = nouveauxPtsVictoireMilitaire;
    }

    //retourne le nb de jetons de défaite militaire du joueur
    public int getNbJetonsDefaite() {
        return nbJetonsDefaite;
    }

    //définit le nb de jetons de défaite militaire du joueur. généré par generate mais est-ce vraiment utile ?
    public void setNbJetonsDefaite(int nouveauNbJetonsDefaite) {
        nbJetonsDefaite = nouveauNbJetonsDefaite;
    }

    //ajoute n points de victoire militaire au joueur
    public void addPointsVictoireMilitaire(int n){
        ptsVictoireMilitaire = ptsVictoireMilitaire+n;
    }

    //ajoute n jetons de défaite militaire au joueur
    public void addJetonsDefaiteMilitaire(int n){
        nbJetonsDefaite = nbJetonsDefaite+n;
    }

    //retire 1 point de victoire militaire au joueur, ce qui correspond à une défaite (dans l,optique, cette fonction sera privilégiée pour le calcul final)
    public void retirerPointsVictoireMilitaire(){
        ptsVictoireMilitaire--;
    }

    //retire n jetons de défaite militaire au joueur. Fonction prévue mais potentiellement inutile
    public void retirerJetonsDefaiteMilitaire(int n){
        nbJetonsDefaite = nbJetonsDefaite+n;
    }


    //autres fonctions


}
