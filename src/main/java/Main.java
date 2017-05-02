
public class Main {
    public static void main(String[] args){
        System.out.println("New game");
        Card card = new Card(Suit.CLUBS, Rank.ACE);
        Deck deck = new Deck();
        deck.createDeck();

    }
}
