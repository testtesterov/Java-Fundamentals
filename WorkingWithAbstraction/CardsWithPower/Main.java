package WorkingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rankRank=scanner.nextLine();
        String rankSuit=scanner.nextLine();
        Card card = new Card(CardRanks.valueOf(rankRank), CardSuits.valueOf(rankSuit));

        System.out.println(card.toString());
    }
}
