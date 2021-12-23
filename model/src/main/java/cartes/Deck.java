package cartes;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Carte> deck;

    public Deck() {
        deck = new ArrayList<>();
    }

    public void ajoutCarteDansDeck(Carte carte)
    {
        if (deck.size() < 7) {
            deck.add(carte);
        }
    }
    public void enleverCarteDuDeck(Carte carte)
    {
        deck.remove(carte);
    }
    public int getSizeDeck()
    {
        return deck.size();
    }
    public Carte getCarteDansDeck(int indice)
    {
        return deck.get(indice);
    }
    public void clearDeck()
    {
        deck.clear();
    }

}
