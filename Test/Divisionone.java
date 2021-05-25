import java.util.Scanner;

public class Divisionone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int x=0;
        if(number%2==0) x=2;
        if(number%3==0) x=3;
        if(number%6==0) x=6;
        if(number%7==0) x=7;
        if(number%10==0) x=10;
        if(x!=0) System.out.print("The number is divisible by "+x);
        else System.out.println("Not divisible");
    }
}