package facade;

public class FacadePlateau {
    /**
     * Le plateau géré par la façade
     */
    private Plateau plateau;

    /**
     * Création du plateau
     */
    public void creerPlateau(){
        this.plateau = new Plateau();
    }
}
