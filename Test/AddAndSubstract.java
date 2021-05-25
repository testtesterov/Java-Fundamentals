import java.util.Scanner;

public class AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int thirdNumber=Integer.parseInt(scanner.nextLine());
        System.out.println(substract(sum(firstNumber,secondNumber),thirdNumber));
    }
    public static int sum(int firstNumber,int secondNumber){
        return firstNumber+secondNumber;
    }
    public static int substract(int x,int thirdNumber){
        return x-thirdNumber;
    }
}
