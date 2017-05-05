import java.util.ArrayList;

public class Deck {
    private static ArrayList<Card> deck = new ArrayList<Card>();

    public ArrayList<Card> createDeck(){
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    public void shuffle(){
        ArrayList<Card> shuffleDeck = new ArrayList<Card>();
        for (int i = 0; i < 36; i++){
            int index = (int)(Math.random() * deck.size());
            shuffleDeck.add(i, deck.get(index));
            deck.remove(index);
        }
        for(int i = 0; i < 36; i ++){
            deck.add(shuffleDeck.get(i));
            System.out.println(deck.get(i).getSuit() + " " + deck.get(i).getRank());
        }
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public void deleteCardFromDeck(int i){
        deck.remove(i);
    }
}
