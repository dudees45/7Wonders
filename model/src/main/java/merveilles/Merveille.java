package merveilles;

import player.Player;

import java.util.HashMap;

public class Merveille {


    private String ressourceProduite; // ce que produit la merveille de base
    private String cite; // le nom de la merveille
    private int etape; // l'étape actuelle de cette étape

    //Pour chaque étape, son effet et ses ressources requises
    //A savoir qu'on travaille sur la face A des merveilles donc il n'y a que l'étape 2 qui donne autre chose que des pts de victoire
    //Premiere etape
    private HashMap<String,Integer> ressourcesPremiereEtape;
    private HashMap<String,String> effetPremiereEtape;

    //Deuxieme etape
    private HashMap<String,Integer> ressourcesDeuxiemeEtape;
    private HashMap<String,String> effetDeuxiemeEtape;

    //Troisieme etape
    private HashMap<String,Integer> ressourcesTroisiemeEtape;
    private HashMap<String,String> effetTroisiemeEtape;


    //Constructeur
    public Merveille(String ressourceProduite, String cite, HashMap<String, Integer> ressourcesPremiereEtape, HashMap<String, String> effetPremiereEtape, HashMap<String, Integer> ressourcesDeuxiemeEtape, HashMap<String, String> effetDeuxiemeEtape, HashMap<String, Integer> ressourcesTroisiemeEtape, HashMap<String, String> effetTroisiemeEtape) {
        this.ressourceProduite = ressourceProduite;
        this.cite = cite;
        this.etape = 0; //on commence sans étape déjà construite
        this.ressourcesPremiereEtape = ressourcesPremiereEtape;
        this.effetPremiereEtape = effetPremiereEtape;
        this.ressourcesDeuxiemeEtape = ressourcesDeuxiemeEtape;
        this.effetDeuxiemeEtape = effetDeuxiemeEtape;
        this.ressourcesTroisiemeEtape = ressourcesTroisiemeEtape;
        this.effetTroisiemeEtape = effetTroisiemeEtape;
    }

     //fonctions autres
    //getters et setters générés, à voir ensuite les fonctions inutiles à retirer
    //Je me passe de commentaires pour les getters et setters générés, ils n'ont rien de particulier

    public String getRessourceProduite() {
        return ressourceProduite;
    }

    public void setRessourceProduite(String ressourceProduite) {
        this.ressourceProduite = ressourceProduite;
    }

    public String getCite() {
        return cite;
    }

    public void setCite(String cite) {
        this.cite = cite;
    }

    public int getEtape() {
        return etape;
    }

    public void setEtape(int etape) {
        this.etape = etape;
    }

    public HashMap<String, Integer> getRessourcesPremiereEtape() {
        return ressourcesPremiereEtape;
    }

    public void setRessourcesPremiereEtape(HashMap<String, Integer> ressourcesPremiereEtape) {
        this.ressourcesPremiereEtape = ressourcesPremiereEtape;
    }

    public HashMap<String, String> getEffetPremiereEtape() {
        return effetPremiereEtape;
    }

    public void setEffetPremiereEtape(HashMap<String, String> effetPremiereEtape) {
        this.effetPremiereEtape = effetPremiereEtape;
    }

    public HashMap<String, Integer> getRessourcesDeuxiemeEtape() {
        return ressourcesDeuxiemeEtape;
    }

    public void setRessourcesDeuxiemeEtape(HashMap<String, Integer> ressourcesDeuxiemeEtape) {
        this.ressourcesDeuxiemeEtape = ressourcesDeuxiemeEtape;
    }

    public HashMap<String, String> getEffetDeuxiemeEtape() {
        return effetDeuxiemeEtape;
    }

    public void setEffetDeuxiemeEtape(HashMap<String, String> effetDeuxiemeEtape) {
        this.effetDeuxiemeEtape = effetDeuxiemeEtape;
    }

    public HashMap<String, Integer> getRessourcesTroisiemeEtape() {
        return ressourcesTroisiemeEtape;
    }

    public void setRessourcesTroisiemeEtape(HashMap<String, Integer> ressourcesTroisiemeEtape) {
        this.ressourcesTroisiemeEtape = ressourcesTroisiemeEtape;
    }

    public HashMap<String, String> getEffetTroisiemeEtape() {
        return effetTroisiemeEtape;
    }

    public void setEffetTroisiemeEtape(HashMap<String, String> effetTroisiemeEtape) {
        this.effetTroisiemeEtape = effetTroisiemeEtape;
    }

    //fonctions spécifiques (pas getters et setters)

    //retourne la prix en ressources de la prochaine étape
    public HashMap<String, Integer> prixEtapeSuivante() {
        switch(etape){
            case 0: //on retourne le coût de l'étape qui suit celle actuelle
                return ressourcesPremiereEtape;
            case 1:
                return ressourcesDeuxiemeEtape;
            case 2:
                return ressourcesTroisiemeEtape;
        }
        return null;
    }

    //TO DO: finir cette méthode permettant de vérifier (avec la liste des ressources d'un joueur (liste ou joueur en parametre ?), si il peut construire l'étape suivante)
    public boolean peutAcheterEtape(){
        return true;
    }


    //TO DO : finir cette méthode (il faut appliquer les effets de l'étape au joueur fourni en paramètre)
    public void construireEtape(Player p) {
            etape = etape+1; //on incrémente le num de l'étape de la merveille
            //on applique l'effet au joueur
            switch(etape) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
    }
}
