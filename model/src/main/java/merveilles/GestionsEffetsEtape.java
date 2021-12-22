package merveilles;

import joueur.Joueur;

import java.util.Map;

public class GestionsEffetsEtape {

    public void appliquerEffetMerveille(Joueur joueur) {

        if (joueur.getMerveille().getCite().equals("Olympia"))
        {
            if (joueur.getMerveille().getEtape() == 1)
            {
                joueur.addPtsVictoire(3);
            }
            else if (joueur.getMerveille().getEtape() == 2)
            {
                //TODO Batiment gratuit
            }
            else if (joueur.getMerveille().getEtape() == 3)
            {
                joueur.addPtsVictoire(7);
            }
        }
        if (joueur.getMerveille().getCite().equals("Gizah"))
        {
            if (joueur.getMerveille().getEtape() == 1)
            {
                joueur.addPtsVictoire(3);
            }
            else if (joueur.getMerveille().getEtape() == 2)
            {
                joueur.addPtsVictoire(5);
            }
            else if (joueur.getMerveille().getEtape() == 3)
            {
                joueur.addPtsVictoire(7);
            }
        }
        if (joueur.getMerveille().getCite().equals("Alexandria"))
        {
            if (joueur.getMerveille().getEtape() == 1)
            {
                joueur.addPtsVictoire(3);
            }
            else if (joueur.getMerveille().getEtape() == 2)
            {
                //TODO Ressource au choix parmi les MP
            }
            else if (joueur.getMerveille().getEtape() == 3)
            {
                joueur.addPtsVictoire(7);
            }
        }
        if (joueur.getMerveille().getCite().equals("Halikarnassos"))
        {
            if (joueur.getMerveille().getEtape() == 1)
            {
                joueur.addPtsVictoire(3);
            }
            else if (joueur.getMerveille().getEtape() == 2)
            {
                //TODO Batiment gratuit parmi les cartes defaussées
            }
            else if (joueur.getMerveille().getEtape() == 3)
            {
                joueur.addPtsVictoire(7);
            }
        }
        if (joueur.getMerveille().getCite().equals("Babylon"))
        {
            if (joueur.getMerveille().getEtape() == 1)
            {
                joueur.addPtsVictoire(3);
            }
            else if (joueur.getMerveille().getEtape() == 2)
            {
                //TODO Symbole scientifique gratuit
            }
            else if (joueur.getMerveille().getEtape() == 3)
            {
                joueur.addPtsVictoire(7);
            }
        }
        if (joueur.getMerveille().getCite().equals("Rhodos"))
        {
            if (joueur.getMerveille().getEtape() == 1)
            {
                joueur.addPtsVictoire(3);
            }
            else if (joueur.getMerveille().getEtape() == 2)
            {
                //TODO Batiment gratuit
            }
            else if (joueur.getMerveille().getEtape() == 3)
            {
                joueur.addPtsVictoire(7);
            }
        }
        if (joueur.getMerveille().getCite().equals("Ephesos"))
        {
            if (joueur.getMerveille().getEtape() == 1)
            {
                joueur.addPtsVictoire(3);
            }
            else if (joueur.getMerveille().getEtape() == 2)
            {
                joueur.addPieces(9);
            }
            else if (joueur.getMerveille().getEtape() == 3)
            {
                joueur.addPtsVictoire(7);
            }
        }

    }
}
