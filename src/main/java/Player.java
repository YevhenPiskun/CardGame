import java.util.ArrayList;

/**
 * Created by episkun on 05.05.2017.
 */
public class Player {

    ArrayList<Card> userDeck = new ArrayList<Card>();
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public ArrayList<Card> takeACards(){
        ArrayList<Card> userDeck = new ArrayList<Card>();
        Deck deck = new Deck();
        for (int i = 0; i < 6; i++){
            userDeck.add(deck.getDeck().get(i));
            deck.deleteCardFromDeck(i);
        }
        return userDeck;
    }

}
