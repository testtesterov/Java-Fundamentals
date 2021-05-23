import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int lecturesCount=Integer.parseInt(scanner.nextLine());
        int additionalBonus=Integer.parseInt(scanner.nextLine());
        int maxMax=0;
        for(int i=0;i<n;i++){
            int currentMax=Integer.parseInt(scanner.nextLine());
            if(currentMax>maxMax){
                maxMax=currentMax;
            }
        }
        System.out.println("Max Bonus: "+(int) Math.ceil(((double) maxMax/lecturesCount)*(5+additionalBonus))+".");
        System.out.println("The student has attended "+maxMax+" lectures.");
    }
}
