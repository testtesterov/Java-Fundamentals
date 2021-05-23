import java.util.Scanner;

public class CharactersInRange {
    public static void charsInRange(char charOne, char charTwo){
        if(charTwo>charOne) {
            for (int i = 1 + charOne; i < charTwo; i++) {
                System.out.print((char) i + " ");
            }
        }
        else{
            for (int i = 1 + charTwo; i < charOne; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charOne=scanner.nextLine().charAt(0);
        char charTwo=scanner.nextLine().charAt(0);
        charsInRange(charOne,charTwo);
    }
}
