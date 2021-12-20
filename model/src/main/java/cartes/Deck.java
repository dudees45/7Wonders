package cartes;

import java.util.ArrayList;

public class Deck {

    private ArrayList< Carte> deck;

    public Deck() {
        deck = new ArrayList<>();
    }
    public void ajoutCarteDansDeck(Carte carte)
    {
        if (deck.size() < 7) {
            deck.add(carte);
        }
    }
}
