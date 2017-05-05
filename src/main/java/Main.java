import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffle();
        Player player1 = new Player("Computer");
        ArrayList<Card> playerDeck = player1.takeACards();
        System.out.println();
        for (int i = 0; i < playerDeck.size(); i++){
            System.out.println(playerDeck.get(i).getSuit() + " " + playerDeck.get(i).getRank());
        }
        System.out.println();
        for (int i = 0; i < deck.getDeck().size(); i++){
            System.out.println(deck.getDeck().get(i).getSuit() + " " + deck.getDeck().get(i).getRank());
        }

    }
}
