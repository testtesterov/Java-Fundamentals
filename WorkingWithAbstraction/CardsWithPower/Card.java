package WorkingWithAbstraction.CardsWithPower;

public class Card {
    private CardRanks rank;
    private CardSuits suit;

    public Card(CardRanks rank, CardSuits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.rank, this.suit, this.rank.getValue()+this.suit.getValue());
    }
}
