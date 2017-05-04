import java.util.ArrayList;

public class Deck {
    public static ArrayList<Card> deck = new ArrayList<Card>();

    public ArrayList<Card> createDeck(){
        deck.add(new Card(Suit.HEARTS, Rank.ACE));
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
            System.out.println(shuffleDeck.get(i).getSuit());
            deck.remove(index);
        }
        for(int i = 0; i < 36; i ++){
            System.out.println(shuffleDeck.get(i).getSuit() + " " + shuffleDeck.get(i).getRank());
        }
    }
}
