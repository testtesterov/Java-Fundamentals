import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputOne=scanner.nextLine().split("\\s+");
        String[] inputTwo=scanner.nextLine().split("\\s+");

        List<Integer> firstDeck=new ArrayList<>();
        List<Integer> secondDeck=new ArrayList<>();
        for(int i=0;i<inputOne.length;i++){
            firstDeck.add(Integer.parseInt(inputOne[i]));
        }
        for(int i=0;i<inputTwo.length;i++){
            secondDeck.add(Integer.parseInt(inputTwo[i]));
        }
        while(!(firstDeck.isEmpty()|| secondDeck.isEmpty())){
            int first=firstDeck.get(0);
            int second=secondDeck.get(0);
            firstDeck.remove(firstDeck.get(0));
            secondDeck.remove(secondDeck.get(0));
            if(first>second){
                firstDeck.add(first);
                firstDeck.add(second);

            }
            if(first<second){
                secondDeck.add(second);
                secondDeck.add(first);

            }
        }
        /*for(int i=0;i<firstDeck.size();i++){
            if(firstDeck.get(i)>secondDeck.get(i)){
                firstDeck.add(firstDeck.get(i));
                firstDeck.add(secondDeck.get(i));
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
            if(firstDeck.get(i)<secondDeck.get(i)){
                secondDeck.add(secondDeck.get(i));
                secondDeck.add(secondDeck.get(i));
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
            if(firstDeck.get(i)==secondDeck.get(i)){
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
            if(firstDeck.size()==0&&secondDeck.size()==0) break;
        }*/
        int sum=0;
        if(firstDeck.size()==secondDeck.size()){
            return;
        }
        if(firstDeck.size()==0){
            for(int i=0;i<secondDeck.size();i++){
                sum+=secondDeck.get(i);
            }
            System.out.println("Second player wins! Sum: "+sum);
        }
        if(secondDeck.size()==0){
            for(int i=0;i<firstDeck.size();i++){
                sum+=firstDeck.get(i);
            }
            System.out.println("First player wins! Sum: "+sum);
        }
    }
}
