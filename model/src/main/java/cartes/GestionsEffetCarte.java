package cartes;

import joueur.Joueur;

import java.util.Map;

public class GestionsEffetCarte {

    public void appliquerEffetCarte (Map<String,String> effet, Joueur joueur) throws Exception {
        if (effet.get("nomEffet") == null){
            throw new Exception(" Il y'a un soucis cette carte n'a pas d effet");
        }
        else
        {
            if(effet.get("nomEffet").equals("gain_pointsVictoire"))
            {
                joueur.setPtsVictoire(joueur.getPtsVictoire() + Integer.parseInt(effet.get("valeurEffet")));
            }
            if(effet.get("nomEffet").equals("gain_pointsBouclier"))
            {
                joueur.setPuissanceMilitaire(joueur.getPuissanceMilitaire() + Integer.parseInt(effet.get("valeurEffet")));
            }
            if(effet.get("nomEffet").equals("gain_pieces"))
            {
                joueur.setPieces(joueur.getPieces() + Integer.parseInt(effet.get("valeurEffet")));
            }
            if (effet.get("nomEffet").)
        }
    }
}
