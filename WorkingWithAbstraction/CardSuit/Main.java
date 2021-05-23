package WorkingWithAbstraction.CardSuit;

import WorkingWithAbstraction.CardsWithPower.CardSuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardSuits[] cardSuits = CardSuits.values();

        if(scanner.nextLine().equals("Card Suits")){
            System.out.println("Card Suits:");
            for (CardSuits cardSuit : cardSuits) {
                System.out.println("Ordinal value: "+cardSuit.ordinal()+"; Name value: "+cardSuit);
            }
        }
    }
}
