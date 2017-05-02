
public class Card {
    private Suit suit;
    private Rank rank;

    Card(Suit suit, Rank rank){
    }

    public Suit getSuit(){
        return suit;
    }

    public Rank getRank(){
        return rank;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }

}
