package WorkingWithAbstraction.CardRank;


import WorkingWithAbstraction.CardsWithPower.CardRanks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRanks[] cardRanks = CardRanks.values();

        if(scanner.nextLine().equals("Card Ranks")){
            System.out.println("Card Ranks:");
            for (CardRanks cardRank : cardRanks) {
                System.out.println("Ordinal value: "+cardRank.ordinal()+"; Name value: "+cardRank);
            }
        }
    }
}
