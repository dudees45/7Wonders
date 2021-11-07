package player;

import merveilles.*;
import cartes.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {

    private String nom;
    private ArrayList<Cartes> cartesJouees; //les cartes jouées par le joueur
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



    public Player(String nom){  //Constructeur, au début, seul le nom différencie les joueurs
        this.nom = nom;
        pieces = 3; //On débute avec 3 pièces
        cartesJouees = new ArrayList<Cartes>();
        etatJeu = false;
        commerceMatieresPremieres = false;
        commerceProduitsManufactures = false;
        ressources = new HashMap<String, Integer>(); // on initialise les ressources du joueur, à 0 de toute façon comme le choix des merveilles n'a pas été fait
        ressources.put("Pierres",0);
        ressources.put("Verres",0); //Le verre est un produit manufacture
        ressources.put("Papiers",0); //Le papier est un produit manufacture
        ressources.put("Bois",0);
        ressources.put("Laines",0); //La laine est un produit manufacture
        ressources.put("Briques",0);
        ressources.put("Minerais",0);
        ptsVictoire = 0;
        ptsVictoireMilitaire = 0;
        puissanceMilitaire = 0;
        nbJetonsDefaite = 0;
        merveille = null;  // le joueur n'aura pas encore choisi de merveille à sa création
    }



     //Vérifie si le joueur a une carte en particulier
    public boolean aCarte(Cartes carte){
        return cartesJouees.contains(carte);
    }
}
